package com.example.articulodecompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.articulodecompose.ui.theme.ArticuloDeComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ArticuloDeComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    ArticuloCompose(titulo = getString(R.string.titulo), parrafo1 = getString(R.string.parrafo1), parrafo2 = getString(R.string.parrafo2))
                }
            }
        }
    }
}

@Composable
fun ArticuloCompose(titulo : String, parrafo1 : String, parrafo2 : String, modifier : Modifier = Modifier) {
    val imagen = painterResource(R.drawable.bg_compose_background)

    Column(modifier = modifier) {
        Image(
            painter = imagen,
            contentDescription = null,
        )

        ArticuloTextos(titulo = titulo, parrafo1 = parrafo1, parrafo2 = parrafo2)
    }


}

@Composable
fun ArticuloTextos(titulo : String, parrafo1 : String, parrafo2 : String, modifier : Modifier = Modifier) {

    Column(modifier = modifier) {
        Text(
            text = titulo,
            fontSize = 24. sp,
            modifier = modifier
                .padding(
                    top = 16. dp,
                    bottom = 16. dp,
                    end = 16. dp,
                    start = 16. dp
                )
        )
        Text(
            text = parrafo1,
            modifier = modifier
                .padding(
                    start = 16.dp,
                    end = 16. dp
                ),
            textAlign = TextAlign.Justify
        )
        Text(
            text = parrafo2,
            modifier = modifier
                .padding(
                    start = 16. dp,
                    end = 16. dp,
                    top = 16. dp,
                    bottom = 16. dp
                ),
            textAlign = TextAlign.Justify
        )
    }

}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ArticuloDeComposeTheme {
        ArticuloCompose(titulo = stringResource(R.string.titulo), parrafo1 = stringResource(R.string.parrafo1), parrafo2 = stringResource(R.string.parrafo2))
    }
}