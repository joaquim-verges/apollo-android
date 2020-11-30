// AUTO-GENERATED FILE. DO NOT MODIFY.
//
// This class was automatically generated by Apollo GraphQL plugin from the GraphQL queries it found.
// It should not be modified by hand.
//
package com.example.hero_name_query_long_name

import com.apollographql.apollo.api.ResponseField
import com.apollographql.apollo.api.internal.ResponseAdapter
import com.apollographql.apollo.api.internal.ResponseReader
import com.apollographql.apollo.api.internal.ResponseWriter
import kotlin.Array
import kotlin.String
import kotlin.Suppress

@Suppress("NAME_SHADOWING", "UNUSED_ANONYMOUS_PARAMETER", "LocalVariableName",
    "RemoveExplicitTypeArguments", "NestedLambdaShadowedImplicitParameter", "PropertyName",
    "RemoveRedundantQualifierName")
object
    TestQueryWithAVeryAVeryAVeryAVeryAVeryAVeryAVeryAVeryAVeryAVeryAVeryAVeryAVeryLongName_ResponseAdapter
    :
    ResponseAdapter<TestQueryWithAVeryAVeryAVeryAVeryAVeryAVeryAVeryAVeryAVeryAVeryAVeryAVeryAVeryLongName.Data>
    {
  private val RESPONSE_FIELDS: Array<ResponseField> = arrayOf(
    ResponseField.forObject("heroAVeryAVeryAVeryAVeryAVeryAVeryAV", "hero", mapOf<String, Any>(
      "episode" to mapOf<String, Any>(
        "kind" to "Variable",
        "variableName" to
            "episodeAVeryAVeryAVeryAVeryAVeryAVeryAVeryAVeryAVeryAVeryAVeryAVeryAVeryAVeryAVeryLongName")), true, null)
  )

  override fun fromResponse(reader: ResponseReader, __typename: String?):
      TestQueryWithAVeryAVeryAVeryAVeryAVeryAVeryAVeryAVeryAVeryAVeryAVeryAVeryAVeryLongName.Data {
    return Data.fromResponse(reader, __typename)
  }

  override fun toResponse(writer: ResponseWriter,
      value: TestQueryWithAVeryAVeryAVeryAVeryAVeryAVeryAVeryAVeryAVeryAVeryAVeryAVeryAVeryLongName.Data) {
    Data.toResponse(writer, value)
  }

  object Data :
      ResponseAdapter<TestQueryWithAVeryAVeryAVeryAVeryAVeryAVeryAVeryAVeryAVeryAVeryAVeryAVeryAVeryLongName.Data>
      {
    private val RESPONSE_FIELDS: Array<ResponseField> = arrayOf(
      ResponseField.forObject("heroAVeryAVeryAVeryAVeryAVeryAVeryAV", "hero", mapOf<String, Any>(
        "episode" to mapOf<String, Any>(
          "kind" to "Variable",
          "variableName" to
              "episodeAVeryAVeryAVeryAVeryAVeryAVeryAVeryAVeryAVeryAVeryAVeryAVeryAVeryAVeryAVeryLongName")), true, null)
    )

    override fun fromResponse(reader: ResponseReader, __typename: String?):
        TestQueryWithAVeryAVeryAVeryAVeryAVeryAVeryAVeryAVeryAVeryAVeryAVeryAVeryAVeryLongName.Data {
      return reader.run {
        var heroAVeryAVeryAVeryAVeryAVeryAVeryAV: TestQueryWithAVeryAVeryAVeryAVeryAVeryAVeryAVeryAVeryAVeryAVeryAVeryAVeryAVeryLongName.Data.HeroAVeryAVeryAVeryAVeryAVeryAVeryAV? = null
        while(true) {
          when (selectField(RESPONSE_FIELDS)) {
            0 -> heroAVeryAVeryAVeryAVeryAVeryAVeryAV = readObject<TestQueryWithAVeryAVeryAVeryAVeryAVeryAVeryAVeryAVeryAVeryAVeryAVeryAVeryAVeryLongName.Data.HeroAVeryAVeryAVeryAVeryAVeryAVeryAV>(RESPONSE_FIELDS[0]) { reader ->
              HeroAVeryAVeryAVeryAVeryAVeryAVeryAV.fromResponse(reader)
            }
            else -> break
          }
        }
        TestQueryWithAVeryAVeryAVeryAVeryAVeryAVeryAVeryAVeryAVeryAVeryAVeryAVeryAVeryLongName.Data(
          heroAVeryAVeryAVeryAVeryAVeryAVeryAV = heroAVeryAVeryAVeryAVeryAVeryAVeryAV
        )
      }
    }

    override fun toResponse(writer: ResponseWriter,
        value: TestQueryWithAVeryAVeryAVeryAVeryAVeryAVeryAVeryAVeryAVeryAVeryAVeryAVeryAVeryLongName.Data) {
      if(value.heroAVeryAVeryAVeryAVeryAVeryAVeryAV == null) {
        writer.writeObject(RESPONSE_FIELDS[0], null)
      } else {
        writer.writeObject(RESPONSE_FIELDS[0]) { writer ->
          HeroAVeryAVeryAVeryAVeryAVeryAVeryAV.toResponse(writer, value.heroAVeryAVeryAVeryAVeryAVeryAVeryAV)
        }
      }
    }

    object HeroAVeryAVeryAVeryAVeryAVeryAVeryAV :
        ResponseAdapter<TestQueryWithAVeryAVeryAVeryAVeryAVeryAVeryAVeryAVeryAVeryAVeryAVeryAVeryAVeryLongName.Data.HeroAVeryAVeryAVeryAVeryAVeryAVeryAV>
        {
      private val RESPONSE_FIELDS: Array<ResponseField> = arrayOf(
        ResponseField.forString("nameAVeryAVeryAVeryAVeryAVeryAVeryAVeryAVeryAVeryAVeryAVeryAVeryAVeryAVeryAVeryLongName", "name", null, false, null)
      )

      override fun fromResponse(reader: ResponseReader, __typename: String?):
          TestQueryWithAVeryAVeryAVeryAVeryAVeryAVeryAVeryAVeryAVeryAVeryAVeryAVeryAVeryLongName.Data.HeroAVeryAVeryAVeryAVeryAVeryAVeryAV {
        return reader.run {
          var nameAVeryAVeryAVeryAVeryAVeryAVeryAVeryAVeryAVeryAVeryAVeryAVeryAVeryAVeryAVeryLongName: String? = null
          while(true) {
            when (selectField(RESPONSE_FIELDS)) {
              0 -> nameAVeryAVeryAVeryAVeryAVeryAVeryAVeryAVeryAVeryAVeryAVeryAVeryAVeryAVeryAVeryLongName = readString(RESPONSE_FIELDS[0])
              else -> break
            }
          }
          TestQueryWithAVeryAVeryAVeryAVeryAVeryAVeryAVeryAVeryAVeryAVeryAVeryAVeryAVeryLongName.Data.HeroAVeryAVeryAVeryAVeryAVeryAVeryAV(
            nameAVeryAVeryAVeryAVeryAVeryAVeryAVeryAVeryAVeryAVeryAVeryAVeryAVeryAVeryAVeryLongName = nameAVeryAVeryAVeryAVeryAVeryAVeryAVeryAVeryAVeryAVeryAVeryAVeryAVeryAVeryAVeryLongName!!
          )
        }
      }

      override fun toResponse(writer: ResponseWriter,
          value: TestQueryWithAVeryAVeryAVeryAVeryAVeryAVeryAVeryAVeryAVeryAVeryAVeryAVeryAVeryLongName.Data.HeroAVeryAVeryAVeryAVeryAVeryAVeryAV) {
        writer.writeString(RESPONSE_FIELDS[0], value.nameAVeryAVeryAVeryAVeryAVeryAVeryAVeryAVeryAVeryAVeryAVeryAVeryAVeryAVeryAVeryLongName)
      }
    }
  }
}
