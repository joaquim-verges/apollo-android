// AUTO-GENERATED FILE. DO NOT MODIFY.
//
// This class was automatically generated by Apollo GraphQL plugin from the GraphQL queries it found.
// It should not be modified by hand.
//
package com.example.union_fragment.type

import com.apollographql.apollo.api.ScalarType
import kotlin.String

enum class CustomType : ScalarType {
  Date {
    override fun typeName(): String = "Date"

    override fun className(): String = "kotlin.Any"
  },

  URL {
    override fun typeName(): String = "URL"

    override fun className(): String = "kotlin.Any"
  },

  UnsupportedType {
    override fun typeName(): String = "UnsupportedType"

    override fun className(): String = "kotlin.Any"
  }
}
