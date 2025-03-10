package com.example.app_splashscreen.Navigation

sealed class AppScreens(val route: String){
    object SplashScreen: AppScreens(route = "Splash_screen")
    object MainScreen: AppScreens(route = "Main_screen")
}