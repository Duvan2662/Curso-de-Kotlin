package com.example.cuadranteconcompose

import android.graphics.Color
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.cuadranteconcompose.ui.theme.CuadranteConComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CuadranteConComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    CuadranteCompose()
                }
            }
        }
    }
}



@Composable
fun CuadranteCompose () {
    DiseñoCuadrante(
        stringResource(R.string.titulo1),
        stringResource(R.string.texto1),
        stringResource(R.string.titulo2),
        stringResource(R.string.texto2),
        stringResource(R.string.titulo3),
        stringResource(R.string.texto3),
        stringResource(R.string.titulo4),
        stringResource(R.string.texto4)
    );

}


@Composable
fun DiseñoCuadrante(titulo1 : String, texto1 : String, titulo2 : String, texto2 : String, titulo3 : String, texto3 : String, titulo4 : String, texto4 : String, modifier: Modifier = Modifier) {

    Column(modifier = Modifier
        .fillMaxSize()//Ocupa completamente el espacio de la pantalla
    ) {//Columna de TODA la pantalla
        Row(modifier = Modifier
            .fillMaxWidth()//Ocupa completamente el espacio a lo ANCHO de la pantalla
            .weight(1f),//Como son dos filas (parte superior y parte inferior) el 1 les da a ambas el mismo tamaño
        ) {//Fila de la parte SUPERIOR
            Column(modifier = Modifier
                .fillMaxHeight()//Ocupa completamente el espacio a lo LARGO de la pantalla
                .weight(1f)//Como son dos columnas (lado izquierda y lado derecho) el 1 les da a ambas el mismo tamaño
                .background(androidx.compose.ui.graphics.Color.Green)
                .padding(
                    top = 16. dp,
                    bottom = 16. dp,
                    start = 16. dp,
                    end = 16.dp
                ),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {//columna izquierda dentro de la fila superior
                Text(
                    text = titulo1,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier
                        .padding(
                            bottom = 16. dp
                        )
                )
                Text(
                    text = texto1,
                    textAlign = TextAlign.Justify
                )
            }
            Column(modifier = Modifier
                .fillMaxHeight()//Ocupa completamente el espacio a lo LARGO de la pantalla
                .weight(1f)//Como son dos columnas (lado izquierda y lado derecho) el 1 les da a ambas el mismo tamaño
                .background(androidx.compose.ui.graphics.Color.Yellow)
                .padding(
                    top = 16. dp,
                    bottom = 16. dp,
                    start = 16. dp,
                    end = 16.dp
                ),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {///columna derecha dentro de la fila superior
                Text(
                    text = titulo2,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier
                        .padding(
                            bottom = 16. dp
                        )
                )
                Text(
                    text = texto2,
                    textAlign = TextAlign.Justify
                )
            }

        }
        Row(modifier = Modifier
            .fillMaxWidth()//Ocupa completamente el espacio a lo ANCHO de la pantalla
            .weight(1f),//Como son dos filas (parte superior y parte inferior) el 1 les da a ambas el mismo tamaño
        ) {//Fila de la parte INFERIOR
            Column(modifier = Modifier
                .fillMaxHeight()//Ocupa completamente el espacio a lo LARGO de la pantalla
                .weight(1f)//Como son dos columnas (lado izquierda y lado derecho) el 1 les da a ambas el mismo tamaño
                .background(androidx.compose.ui.graphics.Color.Cyan)
                .padding(
                    top = 16. dp,
                    bottom = 16. dp,
                    start = 16. dp,
                    end = 16.dp
                ),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {//columna IZQUIERDA dentro de la fila INFERIOR
                Text(
                    text = titulo3,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier
                        .padding(
                            bottom = 16. dp
                        )
                )
                Text(
                    text = texto3,
                    textAlign = TextAlign.Justify
                )
            }
            Column(modifier = Modifier
                .fillMaxHeight()//Ocupa completamente el espacio a lo LARGO de la pantalla
                .weight(1f)//Como son dos columnas (lado izquierda y lado derecho) el 1 les da a ambas el mismo tamaño
                .background(androidx.compose.ui.graphics.Color.LightGray)
                .padding(
                    top = 16. dp,
                    bottom = 16. dp,
                    start = 16. dp,
                    end = 16.dp
                ),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = titulo4,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier
                        .padding(
                            bottom = 16. dp
                        )
                )
                Text(
                    text = texto4,
                    textAlign = TextAlign.Justify
                )
            }
        }
    }

}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    CuadranteConComposeTheme {
        CuadranteCompose()
    }
}