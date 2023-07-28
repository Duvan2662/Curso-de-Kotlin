package com.example.administradordetareas

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.administradordetareas.ui.theme.AdministradorDeTareasTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AdministradorDeTareasTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    AppAdministradorTareas()

                }
            }
        }
    }
}

@Composable
fun AppAdministradorTareas() {

    VistaFinal(
        mensaje1 = stringResource(R.string.mensaje1),
        mensaje2 = stringResource(R.string.mensaje2),
        imagen = painterResource(R.drawable.ic_task_completed)
    )


}

@Composable
fun VistaFinal(mensaje1: String, mensaje2: String, imagen: Painter, modifier : Modifier = Modifier) {
    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.Center,//Centra de arriba  a abajo
        horizontalAlignment = Alignment.CenterHorizontally//Centra de izquierda a derecha
    ) {
        Image(
            painter = imagen,
            contentDescription = null
        )
        Text(
            text = mensaje1,
            modifier = Modifier
                .padding(
                    top = 24. dp,
                    bottom = 8. dp
                ),
           fontWeight = FontWeight.Bold // estilo de la letra Bold
        )
        Text(
            text = mensaje2,
            fontSize = 16. sp
        )
    }

}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    AdministradorDeTareasTheme {
        AppAdministradorTareas()
    }
}