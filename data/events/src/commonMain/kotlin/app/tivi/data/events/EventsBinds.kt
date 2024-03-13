// Copyright 2023, Google LLC, Christopher Banes and the Tivi project contributors
// SPDX-License-Identifier: Apache-2.0

package app.tivi.data.events

import app.tivi.inject.ApplicationScope
import me.tatarka.inject.annotations.Provides

interface EventsBinds {
  @ApplicationScope
  @Provides
  fun bindTraktEventDataSource(bind: TraktEventDataSourceImpl): EventDataSource = bind

}
