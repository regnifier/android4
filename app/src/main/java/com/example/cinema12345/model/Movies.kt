package com.example.cinema12345.model

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Movies(
    val page: Long,
    @Json(name = "total_pages")
    val totalPages: Long,
    @Json(name = "total_results")
    val totalResults: Long,
    val results: List<Movie>)



@JsonClass(generateAdapter = true)
data class Movie(
    val id: Long?,
    val video: Boolean?,
    @Json(name = "vote_count")
    val voteCount: Long?,
    @Json(name = "vote_average")
    val voteAvarage: Double?,
    val title: String?,
    @Json(name = "release_date")
    val releaseDate: String?,
    @Json(name = "original_language")
    val originalLanguage: String?,
    @Json(name = "backdrop_path")
    val backDropPath: String?,
   
    val overview: String?,
    @Json(name = "poster_path")
    val posterPath: String?,
    val popularity: Double?,
    @Json(name = "media_type")
    val mediaType: String?
    )

