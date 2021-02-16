// AUTO-GENERATED FILE. DO NOT MODIFY.
//
// This class was automatically generated by Apollo GraphQL plugin from the GraphQL queries it found.
// It should not be modified by hand.
//
package com.example.unique_type_name.fragment.adapter

import com.apollographql.apollo.api.ResponseAdapterCache
import com.apollographql.apollo.api.ResponseField
import com.apollographql.apollo.api.internal.IntResponseAdapter
import com.apollographql.apollo.api.internal.ListResponseAdapter
import com.apollographql.apollo.api.internal.NullableResponseAdapter
import com.apollographql.apollo.api.internal.ResponseAdapter
import com.apollographql.apollo.api.internal.StringResponseAdapter
import com.apollographql.apollo.api.internal.json.JsonReader
import com.apollographql.apollo.api.internal.json.JsonWriter
import com.example.unique_type_name.fragment.HeroDetailsImpl
import kotlin.Array
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.collections.List

@Suppress("NAME_SHADOWING", "UNUSED_ANONYMOUS_PARAMETER", "LocalVariableName",
    "RemoveExplicitTypeArguments", "NestedLambdaShadowedImplicitParameter", "PropertyName",
    "RemoveRedundantQualifierName")
class HeroDetailsImpl_ResponseAdapter(
  responseAdapterCache: ResponseAdapterCache
) : ResponseAdapter<HeroDetailsImpl.Data> {
  private val stringAdapter: ResponseAdapter<String> = StringResponseAdapter

  private val friendsConnectionAdapter: ResponseAdapter<HeroDetailsImpl.Data.FriendsConnection> =
      FriendsConnection(responseAdapterCache)

  override fun fromResponse(reader: JsonReader): HeroDetailsImpl.Data {
    var __typename: String? = null
    var name: String? = null
    var friendsConnection: HeroDetailsImpl.Data.FriendsConnection? = null
    reader.beginObject()
    while(true) {
      when (reader.selectName(RESPONSE_NAMES)) {
        0 -> __typename = stringAdapter.fromResponse(reader)
        1 -> name = stringAdapter.fromResponse(reader)
        2 -> friendsConnection = friendsConnectionAdapter.fromResponse(reader)
        else -> break
      }
    }
    reader.endObject()
    return HeroDetailsImpl.Data(
      __typename = __typename!!,
      name = name!!,
      friendsConnection = friendsConnection!!
    )
  }

  override fun toResponse(writer: JsonWriter, value: HeroDetailsImpl.Data) {
    writer.beginObject()
    writer.name("__typename")
    stringAdapter.toResponse(writer, value.__typename)
    writer.name("name")
    stringAdapter.toResponse(writer, value.name)
    writer.name("friendsConnection")
    friendsConnectionAdapter.toResponse(writer, value.friendsConnection)
    writer.endObject()
  }

  companion object {
    val RESPONSE_FIELDS: Array<ResponseField> = arrayOf(
      ResponseField.Typename,
      ResponseField(
        type = ResponseField.Type.NotNull(ResponseField.Type.Named.Other("String")),
        fieldName = "name",
      ),
      ResponseField(
        type = ResponseField.Type.NotNull(ResponseField.Type.Named.Object("FriendsConnection")),
        fieldName = "friendsConnection",
        fieldSets = listOf(
          ResponseField.FieldSet(null, FriendsConnection.RESPONSE_FIELDS)
        ),
      )
    )

    val RESPONSE_NAMES: List<String> = RESPONSE_FIELDS.map { it.responseName }
  }

  class FriendsConnection(
    responseAdapterCache: ResponseAdapterCache
  ) : ResponseAdapter<HeroDetailsImpl.Data.FriendsConnection> {
    private val nullableIntAdapter: ResponseAdapter<Int?> =
        NullableResponseAdapter(IntResponseAdapter)

    private val nullableListOfNullableEdgesAdapter:
        ResponseAdapter<List<HeroDetailsImpl.Data.FriendsConnection.Edges?>?> =
        NullableResponseAdapter(ListResponseAdapter(NullableResponseAdapter(Edges(responseAdapterCache))))

    override fun fromResponse(reader: JsonReader): HeroDetailsImpl.Data.FriendsConnection {
      var totalCount: Int? = null
      var edges: List<HeroDetailsImpl.Data.FriendsConnection.Edges?>? = null
      reader.beginObject()
      while(true) {
        when (reader.selectName(RESPONSE_NAMES)) {
          0 -> totalCount = nullableIntAdapter.fromResponse(reader)
          1 -> edges = nullableListOfNullableEdgesAdapter.fromResponse(reader)
          else -> break
        }
      }
      reader.endObject()
      return HeroDetailsImpl.Data.FriendsConnection(
        totalCount = totalCount,
        edges = edges
      )
    }

    override fun toResponse(writer: JsonWriter, value: HeroDetailsImpl.Data.FriendsConnection) {
      writer.beginObject()
      writer.name("totalCount")
      nullableIntAdapter.toResponse(writer, value.totalCount)
      writer.name("edges")
      nullableListOfNullableEdgesAdapter.toResponse(writer, value.edges)
      writer.endObject()
    }

    companion object {
      val RESPONSE_FIELDS: Array<ResponseField> = arrayOf(
        ResponseField(
          type = ResponseField.Type.Named.Other("Int"),
          fieldName = "totalCount",
        ),
        ResponseField(
          type = ResponseField.Type.List(ResponseField.Type.Named.Object("FriendsEdge")),
          fieldName = "edges",
          fieldSets = listOf(
            ResponseField.FieldSet(null, Edges.RESPONSE_FIELDS)
          ),
        )
      )

      val RESPONSE_NAMES: List<String> = RESPONSE_FIELDS.map { it.responseName }
    }

    class Edges(
      responseAdapterCache: ResponseAdapterCache
    ) : ResponseAdapter<HeroDetailsImpl.Data.FriendsConnection.Edges> {
      private val nullableNodeAdapter:
          ResponseAdapter<HeroDetailsImpl.Data.FriendsConnection.Edges.Node?> =
          NullableResponseAdapter(Node(responseAdapterCache))

      override fun fromResponse(reader: JsonReader): HeroDetailsImpl.Data.FriendsConnection.Edges {
        var node: HeroDetailsImpl.Data.FriendsConnection.Edges.Node? = null
        reader.beginObject()
        while(true) {
          when (reader.selectName(RESPONSE_NAMES)) {
            0 -> node = nullableNodeAdapter.fromResponse(reader)
            else -> break
          }
        }
        reader.endObject()
        return HeroDetailsImpl.Data.FriendsConnection.Edges(
          node = node
        )
      }

      override fun toResponse(writer: JsonWriter,
          value: HeroDetailsImpl.Data.FriendsConnection.Edges) {
        writer.beginObject()
        writer.name("node")
        nullableNodeAdapter.toResponse(writer, value.node)
        writer.endObject()
      }

      companion object {
        val RESPONSE_FIELDS: Array<ResponseField> = arrayOf(
          ResponseField(
            type = ResponseField.Type.Named.Object("Character"),
            fieldName = "node",
            fieldSets = listOf(
              ResponseField.FieldSet(null, Node.RESPONSE_FIELDS)
            ),
          )
        )

        val RESPONSE_NAMES: List<String> = RESPONSE_FIELDS.map { it.responseName }
      }

      class Node(
        responseAdapterCache: ResponseAdapterCache
      ) : ResponseAdapter<HeroDetailsImpl.Data.FriendsConnection.Edges.Node> {
        private val stringAdapter: ResponseAdapter<String> = StringResponseAdapter

        override fun fromResponse(reader: JsonReader):
            HeroDetailsImpl.Data.FriendsConnection.Edges.Node {
          var name: String? = null
          reader.beginObject()
          while(true) {
            when (reader.selectName(RESPONSE_NAMES)) {
              0 -> name = stringAdapter.fromResponse(reader)
              else -> break
            }
          }
          reader.endObject()
          return HeroDetailsImpl.Data.FriendsConnection.Edges.Node(
            name = name!!
          )
        }

        override fun toResponse(writer: JsonWriter,
            value: HeroDetailsImpl.Data.FriendsConnection.Edges.Node) {
          writer.beginObject()
          writer.name("name")
          stringAdapter.toResponse(writer, value.name)
          writer.endObject()
        }

        companion object {
          val RESPONSE_FIELDS: Array<ResponseField> = arrayOf(
            ResponseField(
              type = ResponseField.Type.NotNull(ResponseField.Type.Named.Other("String")),
              fieldName = "name",
            )
          )

          val RESPONSE_NAMES: List<String> = RESPONSE_FIELDS.map { it.responseName }
        }
      }
    }
  }
}