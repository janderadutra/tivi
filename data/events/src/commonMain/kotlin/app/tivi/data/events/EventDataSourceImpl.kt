// Copyright 2023, Google LLC, Christopher Banes and the Tivi project contributors
// SPDX-License-Identifier: Apache-2.0

package app.tivi.data.events

import app.moviebase.tmdb.Tmdb3
import app.tivi.data.mappers.TmdbShowDetailToTiviShow
import app.tivi.data.models.Event
import app.tivi.data.models.TiviShow
import me.tatarka.inject.annotations.Inject

@Inject
class EventDataSourceImpl(
  private val tmdb: Tmdb3,
  private val mapper: TmdbShowDetailToTiviShow,
) : EventDataSource {
  override suspend fun getEvent(show: Event): Event {

    return tmdb.show.getDetails(tmdbId).let { mapper.map(it) }
  }
}
