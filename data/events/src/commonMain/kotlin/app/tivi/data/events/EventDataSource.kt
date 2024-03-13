// Copyright 2023, Google LLC, Christopher Banes and the Tivi project contributors
// SPDX-License-Identifier: Apache-2.0

package app.tivi.data.events

import app.tivi.data.models.Event

interface EventDataSource {
  suspend fun getEvent(event: Event): Event
}
