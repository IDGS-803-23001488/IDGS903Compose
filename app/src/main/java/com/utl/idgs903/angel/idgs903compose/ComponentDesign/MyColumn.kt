package com.utl.idgs903.angel.idgs903compose.ComponentDesign
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.utl.idgs903.angel.idgs903compose.ui.theme.IDGS903ComposeTheme

@Composable
fun MyColumn(modifier: Modifier){
    Column(
        Modifier.fillMaxSize()
            .padding(20.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ){
        Text("HOLA MUNDO",Modifier.background(Color.Red).padding(10.dp))
        Text("HOLA muncial")
    }
}

@Preview
@Composable
fun Saludo2(){
    IDGS903ComposeTheme{
        MyColumn(Modifier.fillMaxSize())
    }
}