package com.example.cinema12345.network

import android.graphics.Movie
import com.example.cinema12345.model.Movies
import io.reactivex.rxjava3.core.Single
import retrofit2.http.GET

interface MovieServiece {

    @GET("trending/all/day?api_key=26cb66531597051260178cc92dd1ee50")
    fun getTrendingMovie(): Single<Movies>

}