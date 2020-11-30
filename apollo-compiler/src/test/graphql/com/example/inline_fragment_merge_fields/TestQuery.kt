// AUTO-GENERATED FILE. DO NOT MODIFY.
//
// This class was automatically generated by Apollo GraphQL plugin from the GraphQL queries it found.
// It should not be modified by hand.
//
package com.example.inline_fragment_merge_fields

import com.apollographql.apollo.api.Operation
import com.apollographql.apollo.api.OperationName
import com.apollographql.apollo.api.Query
import com.apollographql.apollo.api.Response
import com.apollographql.apollo.api.ScalarTypeAdapters
import com.apollographql.apollo.api.ScalarTypeAdapters.Companion.DEFAULT
import com.apollographql.apollo.api.internal.OperationRequestBodyComposer
import com.apollographql.apollo.api.internal.QueryDocumentMinifier
import com.apollographql.apollo.api.internal.ResponseFieldMapper
import com.apollographql.apollo.api.internal.ResponseFieldMarshaller
import com.apollographql.apollo.api.internal.SimpleOperationResponseParser
import com.apollographql.apollo.api.internal.Throws
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.collections.List
import okio.Buffer
import okio.BufferedSource
import okio.ByteString
import okio.IOException

@Suppress("NAME_SHADOWING", "UNUSED_ANONYMOUS_PARAMETER", "LocalVariableName",
    "RemoveExplicitTypeArguments", "NestedLambdaShadowedImplicitParameter", "PropertyName",
    "RemoveRedundantQualifierName")
class TestQuery : Query<TestQuery.Data, Operation.Variables> {
  override fun operationId(): String = OPERATION_ID

  override fun queryDocument(): String = QUERY_DOCUMENT

  override fun variables(): Operation.Variables = Operation.EMPTY_VARIABLES

  override fun name(): OperationName = OPERATION_NAME

  override fun responseFieldMapper(): ResponseFieldMapper<Data> {
    return ResponseFieldMapper { reader ->
      TestQuery_ResponseAdapter.fromResponse(reader)
    }
  }

  @Throws(IOException::class)
  override fun parse(source: BufferedSource, scalarTypeAdapters: ScalarTypeAdapters):
      Response<Data> {
    return SimpleOperationResponseParser.parse(source, this, scalarTypeAdapters)
  }

  @Throws(IOException::class)
  override fun parse(byteString: ByteString, scalarTypeAdapters: ScalarTypeAdapters):
      Response<Data> {
    return parse(Buffer().write(byteString), scalarTypeAdapters)
  }

  @Throws(IOException::class)
  override fun parse(source: BufferedSource): Response<Data> {
    return parse(source, DEFAULT)
  }

  @Throws(IOException::class)
  override fun parse(byteString: ByteString): Response<Data> {
    return parse(byteString, DEFAULT)
  }

  override fun composeRequestBody(scalarTypeAdapters: ScalarTypeAdapters): ByteString {
    return OperationRequestBodyComposer.compose(
      operation = this,
      autoPersistQueries = false,
      withQueryDocument = true,
      scalarTypeAdapters = scalarTypeAdapters
    )
  }

  override fun composeRequestBody(): ByteString = OperationRequestBodyComposer.compose(
    operation = this,
    autoPersistQueries = false,
    withQueryDocument = true,
    scalarTypeAdapters = DEFAULT
  )

  override fun composeRequestBody(
    autoPersistQueries: Boolean,
    withQueryDocument: Boolean,
    scalarTypeAdapters: ScalarTypeAdapters
  ): ByteString = OperationRequestBodyComposer.compose(
    operation = this,
    autoPersistQueries = autoPersistQueries,
    withQueryDocument = withQueryDocument,
    scalarTypeAdapters = scalarTypeAdapters
  )

  /**
   * The query type, represents all of the entry points into our object graph
   */
  data class Data(
    val hero: Hero?
  ) : Operation.Data {
    override fun marshaller(): ResponseFieldMarshaller {
      return ResponseFieldMarshaller { writer ->
        TestQuery_ResponseAdapter.Data.toResponse(writer, this)
      }
    }

    /**
     * A character from the Star Wars universe
     */
    interface Hero {
      val __typename: String

      /**
       * The name of the character
       */
      val name: String

      /**
       * The friends of the character exposed as a connection with edges
       */
      val friendsConnection: FriendsConnection

      fun asCharacter(): Character? = this as? Character

      fun marshaller(): ResponseFieldMarshaller

      /**
       * A connection object for a character's friends
       */
      interface FriendsConnection {
        /**
         * The edges for each of the character's friends.
         */
        val edges: List<Edge?>?

        fun marshaller(): ResponseFieldMarshaller

        /**
         * An edge object for a character's friends
         */
        interface Edge {
          /**
           * The character represented by this friendship edge
           */
          val node: Node?

          fun marshaller(): ResponseFieldMarshaller

          /**
           * A character from the Star Wars universe
           */
          interface Node {
            /**
             * The name of the character
             */
            val name: String

            fun marshaller(): ResponseFieldMarshaller
          }
        }
      }

      /**
       * A character from the Star Wars universe
       */
      interface Character : Hero {
        override val __typename: String

        /**
         * The name of the character
         */
        override val name: String

        /**
         * The friends of the character exposed as a connection with edges
         */
        override val friendsConnection: FriendsConnection

        /**
         * Profile link
         */
        val profileLink: Any

        override fun marshaller(): ResponseFieldMarshaller

        /**
         * A connection object for a character's friends
         */
        interface FriendsConnection : Hero.FriendsConnection {
          /**
           * The edges for each of the character's friends.
           */
          override val edges: List<Edge?>?

          override fun marshaller(): ResponseFieldMarshaller

          /**
           * An edge object for a character's friends
           */
          interface Edge : Hero.FriendsConnection.Edge {
            /**
             * The character represented by this friendship edge
             */
            override val node: Node?

            override fun marshaller(): ResponseFieldMarshaller

            /**
             * A character from the Star Wars universe
             */
            interface Node : Hero.FriendsConnection.Edge.Node {
              /**
               * The name of the character
               */
              override val name: String

              override fun marshaller(): ResponseFieldMarshaller
            }
          }
        }
      }

      /**
       * A character from the Star Wars universe
       */
      data class CharacterHero(
        override val __typename: String,
        /**
         * The name of the character
         */
        override val name: String,
        /**
         * The friends of the character exposed as a connection with edges
         */
        override val friendsConnection: FriendsConnection,
        /**
         * Profile link
         */
        override val profileLink: Any
      ) : Hero, Character {
        override fun marshaller(): ResponseFieldMarshaller {
          return ResponseFieldMarshaller { writer ->
            TestQuery_ResponseAdapter.Data.Hero.CharacterHero.toResponse(writer, this)
          }
        }

        /**
         * A connection object for a character's friends
         */
        data class FriendsConnection(
          /**
           * The edges for each of the character's friends.
           */
          override val edges: List<Edge?>?
        ) : Hero.FriendsConnection, Character.FriendsConnection {
          override fun marshaller(): ResponseFieldMarshaller {
            return ResponseFieldMarshaller { writer ->
              TestQuery_ResponseAdapter.Data.Hero.CharacterHero.FriendsConnection.toResponse(writer, this)
            }
          }

          /**
           * An edge object for a character's friends
           */
          data class Edge(
            /**
             * The character represented by this friendship edge
             */
            override val node: Node?
          ) : Hero.FriendsConnection.Edge, Character.FriendsConnection.Edge {
            override fun marshaller(): ResponseFieldMarshaller {
              return ResponseFieldMarshaller { writer ->
                TestQuery_ResponseAdapter.Data.Hero.CharacterHero.FriendsConnection.Edge.toResponse(writer, this)
              }
            }

            /**
             * A character from the Star Wars universe
             */
            data class Node(
              /**
               * The name of the character
               */
              override val name: String
            ) : Hero.FriendsConnection.Edge.Node, Character.FriendsConnection.Edge.Node {
              override fun marshaller(): ResponseFieldMarshaller {
                return ResponseFieldMarshaller { writer ->
                  TestQuery_ResponseAdapter.Data.Hero.CharacterHero.FriendsConnection.Edge.Node.toResponse(writer, this)
                }
              }
            }
          }
        }
      }

      /**
       * A character from the Star Wars universe
       */
      data class OtherHero(
        override val __typename: String = "Character",
        /**
         * The name of the character
         */
        override val name: String,
        /**
         * The friends of the character exposed as a connection with edges
         */
        override val friendsConnection: FriendsConnection
      ) : Hero {
        override fun marshaller(): ResponseFieldMarshaller {
          return ResponseFieldMarshaller { writer ->
            TestQuery_ResponseAdapter.Data.Hero.OtherHero.toResponse(writer, this)
          }
        }

        /**
         * A connection object for a character's friends
         */
        data class FriendsConnection(
          /**
           * The edges for each of the character's friends.
           */
          override val edges: List<Edge?>?
        ) : Hero.FriendsConnection {
          override fun marshaller(): ResponseFieldMarshaller {
            return ResponseFieldMarshaller { writer ->
              TestQuery_ResponseAdapter.Data.Hero.OtherHero.FriendsConnection.toResponse(writer, this)
            }
          }

          /**
           * An edge object for a character's friends
           */
          data class Edge(
            /**
             * The character represented by this friendship edge
             */
            override val node: Node?
          ) : Hero.FriendsConnection.Edge {
            override fun marshaller(): ResponseFieldMarshaller {
              return ResponseFieldMarshaller { writer ->
                TestQuery_ResponseAdapter.Data.Hero.OtherHero.FriendsConnection.Edge.toResponse(writer, this)
              }
            }

            /**
             * A character from the Star Wars universe
             */
            data class Node(
              /**
               * The name of the character
               */
              override val name: String
            ) : Hero.FriendsConnection.Edge.Node {
              override fun marshaller(): ResponseFieldMarshaller {
                return ResponseFieldMarshaller { writer ->
                  TestQuery_ResponseAdapter.Data.Hero.OtherHero.FriendsConnection.Edge.Node.toResponse(writer, this)
                }
              }
            }
          }
        }
      }
    }
  }

  companion object {
    const val OPERATION_ID: String =
        "516a2d4b3fe97536486d2d559538aab9949d7c7e0de7081caec02439a0cb3969"

    val QUERY_DOCUMENT: String = QueryDocumentMinifier.minify(
          """
          |query TestQuery {
          |  hero {
          |    __typename
          |    name
          |    friendsConnection {
          |      edges {
          |        node {
          |          name
          |        }
          |      }
          |    }
          |    ... on Character {
          |      name
          |      profileLink
          |      friendsConnection {
          |        edges {
          |          node {
          |            name
          |          }
          |        }
          |      }
          |    }
          |  }
          |}
          """.trimMargin()
        )

    val OPERATION_NAME: OperationName = object : OperationName {
      override fun name(): String {
        return "TestQuery"
      }
    }
  }
}
