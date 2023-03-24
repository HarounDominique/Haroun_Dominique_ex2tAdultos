package com.example.jetpackcompose1.screens

import android.content.res.Configuration
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalConfiguration
import androidx.navigation.NavController
import com.example.jetpackcompose1.navigation.Screens


@Composable
fun MainScreen(navController: NavController) {

    when (LocalConfiguration.current.orientation) {
        Configuration.ORIENTATION_PORTRAIT -> {

            Column(
                modifier = Modifier
                    .fillMaxSize(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                Button(onClick = { navController.navigate(route = Screens.Screen1.route) }) {
                    Text(text = "Ejercicio 1")
                }
                Button(onClick = { navController.navigate(route = Screens.Screen2.route) }) {
                    Text(text = "Ejercicio 2")
                }
                /*
                Button(onClick = { navController.navigate(route = Screens.Screen3.route) }) {
                    Text(text = "Ejercicio 3")
                }

                 */
            }
        }


        Configuration.ORIENTATION_LANDSCAPE -> {
            Box(Modifier.fillMaxSize(), Alignment.Center) {
               Column() {
                   Button(onClick = { navController.navigate(route = Screens.Screen1.route) }) {
                       Text(text = "Ejercicio 1")
                   }
                   Button(onClick = { navController.navigate(route = Screens.Screen2.route) }) {
                       Text(text = "Ejercicio 2")
                   }
                   /*
                   Button(onClick = { navController.navigate(route = Screens.Screen3.route) }) {
                       Text(text = "Ejercicio 3")
                   }

                    */
               }
            }
        }
        else -> throw RuntimeException()
    }
    }
