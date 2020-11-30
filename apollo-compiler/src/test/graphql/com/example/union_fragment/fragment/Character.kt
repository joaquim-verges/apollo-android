// AUTO-GENERATED FILE. DO NOT MODIFY.
//
// This class was automatically generated by Apollo GraphQL plugin from the GraphQL queries it found.
// It should not be modified by hand.
//
package com.example.union_fragment.fragment

import com.apollographql.apollo.api.GraphqlFragment
import com.apollographql.apollo.api.internal.ResponseFieldMapper
import com.apollographql.apollo.api.internal.ResponseReader
import kotlin.String
import kotlin.Suppress

@Suppress("NAME_SHADOWING", "UNUSED_ANONYMOUS_PARAMETER", "LocalVariableName",
    "RemoveExplicitTypeArguments", "NestedLambdaShadowedImplicitParameter", "PropertyName",
    "RemoveRedundantQualifierName")
interface Character : GraphqlFragment {
  val __typename: String

  /**
   * The ID of the character
   */
  val id: String

  /**
   * The name of the character
   */
  val name: String

  companion object {
    val FRAGMENT_DEFINITION: String = """
        |fragment Character on Character {
        |  __typename
        |  id
        |  name
        |}
        """.trimMargin()

    operator fun invoke(reader: ResponseReader): Character {
      return CharacterImpl_ResponseAdapter.fromResponse(reader)
    }

    fun Mapper(): ResponseFieldMapper<Character> {
      return ResponseFieldMapper { reader ->
        CharacterImpl_ResponseAdapter.fromResponse(reader)
      }
    }
  }
}
