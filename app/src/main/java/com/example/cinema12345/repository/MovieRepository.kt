package com.example.cinema12345.repository

import com.example.cinema12345.model.Movies
import com.example.cinema12345.network.MovieServiece
import io.reactivex.rxjava3.core.Single
import io.reactivex.rxjava3.schedulers.Schedulers
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class MovieRepository @Inject constructor(private val movieService: MovieServiece){

    fun getTrendingMovie(): Single<Movies>{
        return movieService
            .getTrendingMovie()
            .subscribeOn(Schedulers.io())
    }
}