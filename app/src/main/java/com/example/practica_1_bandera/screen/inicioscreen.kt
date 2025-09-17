package com.example.practica_1_bandera.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import com.example.practica_1_bandera.R
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
//Bandera vertical que ocupa toda la pantalla con una columna
fun  InicioScreen(modifier: Modifier = Modifier){
    Column(modifier = Modifier.fillMaxSize()){
        Box(modifier = Modifier
            //.size(200.dp)
            .weight(1f)
            .fillMaxWidth()
            .background(color = Color.Green)){}
        Box(modifier = Modifier
            //.size(200.dp)
            .weight(1f)
            .fillMaxWidth()
            .background(color = Color.White)){
            Image(
                painter = painterResource(id = R.drawable.aguila_mexico),
                contentDescription = "escudo bandera mexicana",
                modifier = Modifier
                    .align(Alignment.Center)
                    .size(130.dp)
                    .rotate(90f)
            )
        }
        Box(modifier = Modifier
            //.size(200.dp)
            .weight(1f)
            .fillMaxWidth()
            .background(color = Color.Red)){}
    }
}

@Composable
//Bandera horizontal en una línea
fun OtraBandera(modifier: Modifier = Modifier){
    Box(modifier = Modifier.fillMaxSize()){
        Row(modifier = Modifier
            .align(Alignment.Center)){
            Box(modifier = Modifier
                .weight(1f)
                //.fillMaxHeight()
                .size(200.dp)
                .background(color = Color.Green)){}
            Box(modifier = Modifier
                .weight(1f)
                //.fillMaxHeight()
                .size(200.dp)
                .background(color = Color.White)){
                Image(
                    painter = painterResource(id = R.drawable.aguila_mexico),
                    contentDescription = "escudo bandera mexicana",
                    modifier = Modifier
                        .align(Alignment.Center)
                        .size(80.dp)
                )
            }
            Box(modifier = Modifier
                .weight(1f)
                //.fillMaxHeight()
                .size(200.dp)
                .background(color = Color.Red)){}
        }
    }
}