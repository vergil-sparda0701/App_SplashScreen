package com.example.app_splashscreen.Navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.app_splashscreen.MainScreen
import com.example.app_splashscreen.ui.theme.Splash
import com.example.app_splashscreen.ui.theme.SplashScreen

@Composable
fun AppNavigation(){

    val navController = rememberNavController()
    NavHost(navController= navController,
        startDestination = AppScreens.SplashScreen.route){
        composable(AppScreens.SplashScreen.route){
            SplashScreen(navController)
        }
        composable(AppScreens.MainScreen.route){
            MainScreen()
        }
    }
}