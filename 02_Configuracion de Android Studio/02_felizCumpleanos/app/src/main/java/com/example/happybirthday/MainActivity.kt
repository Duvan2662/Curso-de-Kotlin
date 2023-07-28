package com.example.happybirthday

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.happybirthday.ui.theme.HappyBirthdayTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {//La funcion main o principal de la aplicacion
        super.onCreate(savedInstanceState)
        setContent {
            HappyBirthdayTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    SaludoDeCumpleanoConImagen(mensaje = getString(R.string.mensaje_cumpleanos), remitente = getString(R.string.remitente))//Funcion que se ejecuta cuando se programa

                }
            }
        }
    }
}


@Composable
fun SaludoDeCumpleanoConImagen(mensaje:String, remitente:String,modifer:Modifier=Modifier) {//Imagen que va a tener el mensaje de cumpleaños
    val imagen = painterResource(R.drawable.androidparty)//Variable que posee la imagen 

    Box{//permite sobreponer elementos 
        Image(//Permite añadir una imagen en la pantalla
            painter = imagen, // Imagen que se va a añadir
            contentDescription = null,//Esto se hace para decirle a tolk back que no tiene necesidad de leer la imagen Talk back es la funcion de android que pronuncia en altavoz para las personas ciegas
            contentScale = ContentScale.Crop//ayuda a mantener la imagen de ancho y de largo en el telefono
        )
        SaludoDeCumpleanos(mensaje = mensaje, remitente = remitente)//Funcion con los 2 textos
    }



}

@Composable //Funcion Componsable
fun SaludoDeCumpleanos(modificador : Modifier = Modifier, mensaje:String, remitente:String) {//Funcion que recibe un mensaje y un remitente
    Column(
        modifier = modificador.fillMaxSize(),//se establecerá la altura y el ancho del diseño de la columna en la altura y el ancho máximos disponibles.
        verticalArrangement = Arrangement.Top,//Ordena los elementos de texto en la parte superior
        horizontalAlignment = Alignment.CenterHorizontally//alinéalos en el centro de forma horizontal.
    ) {//Colum me permite organizar los elementos en forma de columna (de arriba a bajo) tambien exite Row que alinea los elementos de (izquierda a derecha)
        Text( //Permite añadir texto en pantalla
            text = mensaje,//Mensaje que se quiere mostrar
            fontSize = 32 .sp,//Tamaño de la letra
            modifier = Modifier//para modificar el paddin y demas
                .padding(//margen interna de un elemento
                    start = 16. dp,//margen interna inicial de 16 dp
                    end =  16. dp,//margen interna final de 16 dp
                    top = 16. dp,//margen interna superior de 16 dp
                    bottom = 16. dp//margen interna inferior de 16 dp
                )
        )
        Text(
            text = remitente,
            fontSize = 24. sp,
            modifier = Modifier
                .align(//Alinea el texto en una parte especifica
                    alignment = Alignment.End//lo alinea en la parte final
                )
                .padding(
                    end = 16.dp
                )
        )
    }

}


@Preview(showBackground = true)//Permite pre visualizar lo que se esta programando
@Composable
fun VistaPreviaTarjetaCumpleanos() {//Funcion componsable para pre visualizar lo que se esta programando
    HappyBirthdayTheme {
        SaludoDeCumpleanoConImagen(stringResource(R.string.mensaje_cumpleanos), stringResource(R.string.remitente))//Funcion que se quiere PreVisualizar

    }

}