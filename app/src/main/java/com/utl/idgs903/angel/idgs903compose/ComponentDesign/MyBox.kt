package com.utl.idgs903.angel.idgs903compose.ComponentDesign

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.material3.Text
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview
@Composable
fun MyBox(){
    Box(Modifier.fillMaxSize(), contentAlignment = Alignment.Center){
        Box(Modifier.size(50.dp).background(Color.Red)){
            Text("Hola")
        }
    }
}