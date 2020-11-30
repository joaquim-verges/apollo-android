// AUTO-GENERATED FILE. DO NOT MODIFY.
//
// This class was automatically generated by Apollo GraphQL plugin from the GraphQL queries it found.
// It should not be modified by hand.
//
package com.example.union_fragment.fragment

import com.apollographql.apollo.api.GraphqlFragment
import com.apollographql.apollo.api.internal.ResponseFieldMarshaller
import kotlin.String

data class StarshipImpl(
  override val __typename: String = "Starship",
  /**
   * The name of the starship
   */
  override val name: String
) : Starship, GraphqlFragment {
  override fun marshaller(): ResponseFieldMarshaller {
    return ResponseFieldMarshaller { writer ->
      StarshipImpl_ResponseAdapter.toResponse(writer, this)
    }
  }

  companion object {
    val FRAGMENT_DEFINITION: String = """
        |fragment Starship on Starship {
        |  __typename
        |  name
        |}
        """.trimMargin()
  }
}
