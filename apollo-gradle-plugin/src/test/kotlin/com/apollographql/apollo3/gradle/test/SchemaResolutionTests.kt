package com.apollographql.apollo.gradle.test


import com.apollographql.apollo.gradle.util.TestUtils
import com.apollographql.apollo.gradle.util.TestUtils.executeTask
import com.apollographql.apollo.gradle.util.TestUtils.withProject
import com.apollographql.apollo.gradle.util.generatedChild
import org.gradle.testkit.runner.UnexpectedBuildFailure
import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.Assert.assertTrue
import org.junit.Assert.fail
import org.junit.Test
import java.io.File

class SchemaResolutionTests {

  @Test
  fun `when SDL schema assert implicitly resolved and generates classes`() {
    val apolloConfiguration = """
      apollo {
        service("api") {
        }
      }
    """.trimIndent()

    withProject(
        usesKotlinDsl = false,
        apolloConfiguration = apolloConfiguration,
        plugins = listOf(TestUtils.kotlinJvmPlugin, TestUtils.apolloPlugin)
    ) { projectDir ->
      File(projectDir, "src/main/graphql/com").deleteRecursively()

      val fixturesDir = TestUtils.fixturesDirectory()

      val target = File(projectDir, "src/main/graphql")
      File(fixturesDir, "sdl").copyRecursively(target = target, overwrite = true)

      File(projectDir, "src/main/graphql/schema.json").delete()

      executeTask("generateApolloSources", projectDir)

      assertTrue(projectDir.generatedChild("api/FeedRepositoryQuery.kt").isFile)
    }
  }

  @Test
  fun `when SDL schema set explicitly assert generates classes`() {
    val apolloConfiguration = """
      apollo {
        service("api") {
          schemaFile.set(file("src/main/graphql/schema.sdl"))
        }
      }
    """.trimIndent()

    withProject(
        usesKotlinDsl = false,
        apolloConfiguration = apolloConfiguration,
        plugins = listOf(TestUtils.kotlinJvmPlugin, TestUtils.apolloPlugin)
    ) { projectDir ->
      File(projectDir, "src/main/graphql/com").deleteRecursively()

      val fixturesDir = TestUtils.fixturesDirectory()

      val target = File(projectDir, "src/main/graphql")
      File(fixturesDir, "sdl").copyRecursively(target = target, overwrite = true)

      executeTask("generateApolloSources", projectDir)

      assertTrue(projectDir.generatedChild("api/FeedRepositoryQuery.kt").isFile)
    }
  }

  @Test
  fun `when both SDL and introspection schema are found build fails`() {
    val apolloConfiguration = """
      apollo {
        service("api") {
        }
      }
    """.trimIndent()

    withProject(
        usesKotlinDsl = false,
        apolloConfiguration = apolloConfiguration,
        plugins = listOf(TestUtils.kotlinJvmPlugin, TestUtils.apolloPlugin)
    ) { projectDir ->
      File(projectDir, "src/main/graphql/com").deleteRecursively()

      val fixturesDir = TestUtils.fixturesDirectory()

      val target = File(projectDir, "src/main/graphql")
      File(fixturesDir, "sdl").copyRecursively(target = target, overwrite = true)

      try {
        executeTask("generateApolloSources", projectDir)
        fail("expected to fail")
      } catch (e: UnexpectedBuildFailure) {
        MatcherAssert.assertThat(
            e.message,
            CoreMatchers.containsString("Multiple schemas found")
        )
      }
    }
  }
}