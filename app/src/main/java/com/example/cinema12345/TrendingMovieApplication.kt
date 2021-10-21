package com.example.cinema12345

import android.app.Application
import android.media.audiofx.DynamicsProcessing
import android.os.Build
import android.os.Debug
import androidx.core.os.BuildCompat
import dagger.hilt.android.HiltAndroidApp
import timber.log.Timber


@HiltAndroidApp
class TrendingMovieApplication: Application() {

    override fun onCreate() {
        super.onCreate()
        if(BuildConfig.DEBUG){
            Timber.plant(Timber.DebugTree())
        }


    }
}