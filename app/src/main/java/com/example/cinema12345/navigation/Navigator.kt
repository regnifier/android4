package com.example.cinema12345.navigation

import androidx.fragment.app.Fragment


fun Fragment.navigator(): Navigator {
    return requireActivity() as Navigator
}


interface Navigator {

    fun showMainScreen()

}