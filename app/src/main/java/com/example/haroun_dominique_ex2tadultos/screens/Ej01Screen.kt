package com.example.jetpackcompose1.screens.teoria

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.haroun_dominique_ex2tadultos.ui.theme.Haroun_Dominique_ex2tAdultosTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Haroun_Dominique_ex2tAdultosTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Screen1()
                }
            }
        }
    }
}

@Composable
fun Screen1() {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Contadores") }
            )
        }
    ) {
        Column(Modifier.padding(it),
        horizontalAlignment = Alignment.CenterHorizontally){
            var text by rememberSaveable { mutableStateOf("") }

            TextField(
                value = text, onValueChange = { text = it }
            )
            Button(onClick = {
                if (text.isNotBlank())
                text = ""

            }) {
                Text(text = "Mostrar")
            }
        }
        //MyLazyColumn(Modifier.padding(it))
    }
}

@Composable
fun MyLazyColumn(modifier: Modifier = Modifier) {

    var lista =
        remember { items.toMutableStateList() }

    LazyColumn(
        Modifier
            .fillMaxSize()
            .padding(10.dp),
        // state = rememberLazyListState(),  //
    ) {
        items(lista) { item -> MyGraphicItem(item) }
    }
}

@Composable
fun MyGraphicItem(item: MyItem) {

    //var marcado by remember { mutableStateOf(false) }

    Column(modifier = Modifier.fillMaxWidth()) {
        Card(
            modifier = Modifier
                .padding(10.dp)
                .fillMaxWidth(.9f)
                .align(Alignment.CenterHorizontally),
            backgroundColor = Color.LightGray
        ) {
            Text(
                item.nombre,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(10.dp),
            )

            Checkbox(
                checked = item.marcado,
                onCheckedChange = {
                    item.marcado = !item.marcado
                    // marcado = !marcado
                }
            )

        }
    }
}

class MyItem(val nombre: String, marcadoInicial: Boolean = false) {
    var marcado by mutableStateOf(marcadoInicial)
}

val items: List<MyItem> = listOf(

    MyItem(
        nombre = "Elemento0",
        marcadoInicial = false
    ),
    MyItem(
        nombre = "Elemento1",
        marcadoInicial = false
    ),
    MyItem(
        nombre = "Elemento2",
        marcadoInicial = false
    ),
    MyItem(
        nombre = "Elemento3",
        marcadoInicial = false
    ),
    MyItem(
        nombre = "Elemento4",
        marcadoInicial = false
    ),
    MyItem(
        nombre = "Elemento5",
        marcadoInicial = false
    ),
    MyItem(
        nombre = "Elemento6",
        marcadoInicial = false
    ),
    MyItem(
        nombre = "Elemento0",
        marcadoInicial = false
    ),
    MyItem(
        nombre = "Elemento1",
        marcadoInicial = false
    ),
    MyItem(
        nombre = "Elemento2",
        marcadoInicial = false
    ),
    MyItem(
        nombre = "Elemento3",
        marcadoInicial = false
    ),
    MyItem(
        nombre = "Elemento4",
        marcadoInicial = false
    ),
    MyItem(
        nombre = "Elemento5",
        marcadoInicial = false
    ),
    MyItem(
        nombre = "Elemento6",
        marcadoInicial = false
    )
)

