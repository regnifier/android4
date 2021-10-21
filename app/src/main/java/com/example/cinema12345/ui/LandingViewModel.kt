package com.example.cinema12345.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.cinema12345.model.Movie
import com.example.cinema12345.repository.MovieRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import timber.log.Timber
import javax.inject.Inject

@HiltViewModel
class LandingViewModel @Inject constructor(movieRepository: MovieRepository) : ViewModel() {

    private val _trendingMovies = MutableLiveData<List<Movie>>()
    val trandingMovies: LiveData<List<Movie>>
    get() = _trendingMovies

    init {
        movieRepository.getTrendingMovie().observeOn(AndroidSchedulers.mainThread())
            .subscribe({movies -> _trendingMovies.value = movies.results}, {t -> Timber.e(t)})

    }
}