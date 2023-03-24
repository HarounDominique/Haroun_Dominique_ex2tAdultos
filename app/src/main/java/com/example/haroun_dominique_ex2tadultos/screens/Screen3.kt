package com.example.jetpackcompose1.screens


import android.content.res.Configuration
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview
@Composable
fun Screen3(){

   // when (LocalConfiguration.current.orientation) {
     //   Configuration.ORIENTATION_PORTRAIT -> {

            Column(
                Modifier
                    .fillMaxSize()
                    .background(Color(0xFFB9B7B7)),
            ) {
                Box(Modifier.weight(1f)) {
                    Text(
                        text = "0",
                        Modifier
                            .fillMaxWidth()
                            .align(Alignment.BottomEnd)
                            .padding(20.dp),
                        textAlign = TextAlign.End,
                        fontSize = 45.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.Black
                    )
                }
                Column(
                    Modifier
                        .weight(2.2f)
                ) {

                    Row(
                        Modifier
                            .fillMaxWidth()
                            .weight(1f)
                    ) {
                        BotonesGris("AC", Modifier.weight(2f))
                        BotonesGris("⌫", Modifier.weight(1f))
                        BotonesGris("/", Modifier.weight(1f))
                    }

                    Row(
                        Modifier
                            .fillMaxWidth()
                            .weight(1f)
                    ) {
                        BotonesNumeros("7", Modifier.weight(1f))
                        BotonesNumeros("8", Modifier.weight(1f))
                        BotonesNumeros("9", Modifier.weight(1f))
                        BotonesGris(
                            "x",
                            Modifier
                                .weight(1f)
                                .background(Color.Gray)
                                .fillMaxSize()
                                .border(width = 1.dp, color = Color(0xFFB9B7B7)),
                        )
                    }
                    Row(
                        Modifier
                            .fillMaxWidth()
                            .weight(1f)
                    ) {
                        BotonesNumeros("4", Modifier.weight(1f))
                        BotonesNumeros("5", Modifier.weight(1f))
                        BotonesNumeros("6", Modifier.weight(1f))
                        BotonesGris(
                            "-",
                            Modifier
                                .weight(1f)
                                .background(Color.Gray)
                                .fillMaxSize()
                                .border(width = 1.dp, color = Color(0xFFB9B7B7)),
                        )
                    }

                    Row(
                        Modifier
                            .fillMaxWidth()
                            .weight(1f)
                    ) {
                        BotonesNumeros("1", Modifier.weight(1f))
                        BotonesNumeros("2", Modifier.weight(1f))
                        BotonesNumeros("3", Modifier.weight(1f))
                        BotonesGris(
                            "+",
                            Modifier
                                .weight(1f)
                                .background(Color.Gray)
                                .fillMaxSize()
                                .border(width = 1.dp, color = Color(0xFFB9B7B7)),
                        )
                    }
                    Row(
                        Modifier
                            .fillMaxWidth()
                            .weight(1f)
                    ) {
                        BotonesNumeros("+/-", Modifier.weight(1f))
                        BotonesNumeros("0", Modifier.weight(1f))
                        BotonesNumeros(",", Modifier.weight(1f))
                        Text(
                            "=",
                            Modifier
                                .weight(1f)
                                .background(Color(0xFF6375CA))
                                .fillMaxSize()
                                .border(width = 1.dp, color = Color(0xFFB9B7B7)),
                            fontSize = 28.sp,
                            color = Color.Black,
                            textAlign = TextAlign.Center
                        )
                    }


                }

            }
        }
       /* Configuration.ORIENTATION_LANDSCAPE -> {
            Column(Modifier.fillMaxSize()) {
                Column(Modifier.fillMaxSize().weight(1f)) {

                }
                Column(Modifier.fillMaxSize().weight(1f)) {

                }
            }

        }
    }
}*/

@Composable
fun BotonesNumeros(texto: String,
                   modifier: Modifier,) {
    Text(
        text=texto,
        modifier
            .background(Color.White)
            .fillMaxSize()
            .border(width = 1.dp, color = Color(0xFFB9B7B7)),
        fontSize = 28.sp, color= Color.Black, textAlign = TextAlign.Center
    )
}

@Composable
fun BotonesGris(
    texto: String,
    modifier: Modifier,
){ Text(
    text=texto,
    modifier
        .background(Color.LightGray)
        .fillMaxSize()
        .border(width = 1.dp, color = Color(0xFFB9B7B7)),
    fontSize = 28.sp, color= Color.Black, textAlign = TextAlign.Center
)
}




