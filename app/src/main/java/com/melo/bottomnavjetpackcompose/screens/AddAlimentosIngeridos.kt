package com.melo.bottomnavjetpackcompose.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight

@Composable
fun AddAlimentosIngeridos(){
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Red),
        contentAlignment = Alignment.Center

    ){
        Text(text = "AddAlimentos Screen",  style = MaterialTheme.typography.titleLarge, color = Color.White, fontWeight = FontWeight.Bold
        )
    }
}