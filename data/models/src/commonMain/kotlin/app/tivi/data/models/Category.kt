// Copyright 2024, Christopher Banes and the Tivi project contributors
// SPDX-License-Identifier: Apache-2.0

package app.tivi.data.models

data class Category(
  val id: String? = null,
  val name: String? = null,
  val path: String? = null,
){
  companion object {
    val EMPTY_SHOW = Category()
  }
}
