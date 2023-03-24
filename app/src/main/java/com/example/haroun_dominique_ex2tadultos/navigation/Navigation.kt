package com.example.jetpackcompose1.navigation

import Screen2
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.jetpackcompose1.screens.MainScreen
import com.example.jetpackcompose1.screens.Screen3
import com.example.jetpackcompose1.screens.teoria.Screen1

@Composable
fun Navigation() {
    val navController = rememberNavController()
    NavHost(navController, startDestination = Screens.MainScreen.route) {
        composable(route = Screens.MainScreen.route) { MainScreen(navController) }
        composable(route = Screens.Screen1.route) { Screen1() }
        composable(route = Screens.Screen2.route) { Screen2() }
        //composable(route = Screens.Screen3.route) { Screen3() }
    }
}


