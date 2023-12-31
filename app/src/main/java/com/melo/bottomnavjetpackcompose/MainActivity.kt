package com.melo.bottomnavjetpackcompose

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.melo.bottomnavjetpackcompose.ui.theme.BottomNavJetPackComposeTheme


class MainActivity : ComponentActivity() {
    @SuppressLint("CoroutineCreationDuringComposition")
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContent {
            BottomNavJetPackComposeTheme {
                MainScreen()
            }
        }
    }
}
