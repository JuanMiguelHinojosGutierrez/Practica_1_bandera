package com.example.practica_1_bandera.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun  InicioScreen(modifier: Modifier = Modifier){

    Box(modifier=modifier){
        Text(text = "Inicio Screen")
    }
}

@Composable
fun Bandera(){
    Column(){
        Box(modifier = Modifier.background(color = Color.Green)){}
        Box(modifier = Modifier.background(color = Color.White)){}
        Box(modifier = Modifier.background(color = Color.Red)){}
    }
}