package com.example.lab7

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.lab7.ui.theme.Lab7Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Lab7Theme {
                // Usamos Scaffold para crear la estructura de la pantalla
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    // Reemplazamos el contenido del Scaffold con la pantalla ScreenUser
                    ScreenUser(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ScreenUserPreview() {
    Lab7Theme {
        ScreenUser(androidx.compose.ui.Modifier.Companion.padding(innerPadding))
    }
}
