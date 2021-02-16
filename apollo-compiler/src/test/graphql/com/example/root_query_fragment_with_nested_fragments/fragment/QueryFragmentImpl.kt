// AUTO-GENERATED FILE. DO NOT MODIFY.
//
// This class was automatically generated by Apollo GraphQL plugin from the GraphQL queries it found.
// It should not be modified by hand.
//
package com.example.root_query_fragment_with_nested_fragments.fragment

import com.apollographql.apollo.api.Fragment
import com.apollographql.apollo.api.Operation
import com.apollographql.apollo.api.ResponseAdapterCache
import com.apollographql.apollo.api.ResponseField
import com.apollographql.apollo.api.internal.ResponseAdapter
import com.example.root_query_fragment_with_nested_fragments.fragment.adapter.QueryFragmentImpl_ResponseAdapter
import kotlin.String
import kotlin.collections.List

class QueryFragmentImpl : Fragment<QueryFragmentImpl.Data> {
  override fun adapter(customScalarAdapters: ResponseAdapterCache): ResponseAdapter<Data> {
    val adapter = customScalarAdapters.getFragmentAdapter("QueryFragmentImpl") {
      QueryFragmentImpl_ResponseAdapter(customScalarAdapters)
    }
    return adapter
  }

  override fun responseFields(): List<ResponseField.FieldSet> = listOf(
    ResponseField.FieldSet(null, QueryFragmentImpl_ResponseAdapter.RESPONSE_FIELDS)
  )
  override fun variables(): Operation.Variables = Operation.EMPTY_VARIABLES

  /**
   * The query type, represents all of the entry points into our object graph
   */
  data class Data(
    override val __typename: String = "Query",
    override val hero: Hero?,
    override val droid: Droid?,
    override val human: Human?
  ) : QueryFragment, Fragment.Data {
    /**
     * A character from the Star Wars universe
     */
    interface Hero : QueryFragment.Hero {
      data class CharacterHero(
        override val __typename: String,
        /**
         * The name of the character
         */
        override val name: String
      ) : QueryFragment.Hero, QueryFragment.Hero.Character, HeroFragment, Hero

      data class OtherHero(
        override val __typename: String
      ) : QueryFragment.Hero, Hero

      companion object {
        fun Hero.asCharacterHero(): CharacterHero? = this as? CharacterHero
      }
    }

    /**
     * An autonomous mechanical character in the Star Wars universe
     */
    interface Droid : QueryFragment.Droid {
      data class DroidDroid(
        override val __typename: String,
        /**
         * What others call this droid
         */
        override val name: String,
        /**
         * This droid's primary function
         */
        override val primaryFunction: String?
      ) : QueryFragment.Droid, QueryFragment.Droid.Droid, DroidFragment, Droid

      data class OtherDroid(
        override val __typename: String
      ) : QueryFragment.Droid, Droid

      companion object {
        fun Droid.asDroidDroid(): DroidDroid? = this as? DroidDroid
      }
    }

    /**
     * A humanoid creature from the Star Wars universe
     */
    interface Human : QueryFragment.Human {
      data class HumanHuman(
        override val __typename: String,
        /**
         * What this human calls themselves
         */
        override val name: String,
        /**
         * The home planet of the human, or null if unknown
         */
        override val homePlanet: String?
      ) : QueryFragment.Human, QueryFragment.Human.Human, Human

      data class OtherHuman(
        override val __typename: String
      ) : QueryFragment.Human, Human

      companion object {
        fun Human.asHumanHuman(): HumanHuman? = this as? HumanHuman
      }
    }
  }
}