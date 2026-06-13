package com.utl.idgs903.angel.idgs903compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.utl.idgs903.angel.idgs903compose.ui.theme.IDGS903ComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            IDGS903ComposeTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Saludo(Modifier.padding(innerPadding))
                }
            }
        }
    }

    @Composable
    fun Saludo(modifier: Modifier){
        Text("HOLA MUNDO")
        Text("HOLA muncial")
    }
    @Preview
    @Composable
    fun Saludo2(){
        IDGS903ComposeTheme{
            Saludo(Modifier.fillMaxSize())
        }
    }
}