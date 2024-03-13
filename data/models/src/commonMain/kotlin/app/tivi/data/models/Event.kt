// Copyright 2024, Christopher Banes and the Tivi project contributors
// SPDX-License-Identifier: Apache-2.0

package app.tivi.data.models

import kotlinx.datetime.Instant

data class Event(
  val id: String? = null,
  val title: String? = null,
  val notificationTitle: String? = null,
  val categoryId: String? = null,
  val status: EventStatus? = null,
  val startDate: Instant? = null,
  val endDate: Instant? = null,
){
  companion object {
    val EMPTY_SHOW = Event()
  }
}
