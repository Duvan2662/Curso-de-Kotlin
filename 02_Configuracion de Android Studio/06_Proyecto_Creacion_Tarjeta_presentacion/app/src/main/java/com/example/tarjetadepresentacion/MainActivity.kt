package com.example.tarjetadepresentacion


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tarjetadepresentacion.ui.theme.TarjetaDePresentacionTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TarjetaDePresentacionTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    TarjetaDePresentacion()
                }
            }
        }
    }


}

@Composable
fun TarjetaDePresentacion() {
    DisenoTarjetaDePresentacion(
        stringResource(R.string.nombre),
        stringResource(R.string.tituloo),
        stringResource(R.string.correo),
        stringResource(R.string.github),
        stringResource(R.string.celular),
        painterResource(R.drawable.whatsapp_image_2023_07_18_at_11_17_23_am),
        painterResource(R.drawable.telefono),
        painterResource(R.drawable.github),
        painterResource(R.drawable.mensaje)



    )
}
@Composable
fun DisenoTarjetaDePresentacion(nombre: String, titulo: String, correo: String, github: String, telefono: String, imagen: Painter, imgtelefono: Painter, imggit: Painter, imgmensaje: Painter, modifier: Modifier = Modifier ) {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(7, 48, 66, 255))
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .weight(3f)
        ) {
            Column(modifier = Modifier
                .fillMaxHeight()
                .padding(
                    top = 16.dp,
                    bottom = 16.dp,
                    start = 60.dp,
                    end = 60.dp
                ),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    modifier = Modifier.padding(
                        top = 120. dp
                    ),
                    painter = imagen,
                    contentDescription = null
                )
                Text(
                    modifier = Modifier.padding(
                        top = 20. dp
                    ),
                    text = nombre,
                    fontSize = 22. sp,
                    color = Color(255,255,255),
                    fontWeight = FontWeight.W900

                )
                Text(
                    modifier = Modifier.padding(
                        top = 10. dp
                    ),
                    text = titulo,
                    fontSize = 15. sp,
                    color = Color(0xFF3ddc84),
                )
            }

        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
        ) {
            Column(modifier = Modifier
                .fillMaxHeight()
                .fillMaxWidth(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Row(
                    modifier = Modifier
                        .weight(1f)
                        .fillMaxWidth()
                        .padding(
                            start = 85. dp,
                        ),
                    verticalAlignment = Alignment.CenterVertically,
                ) {
                    Icon(
                        modifier = Modifier
                            .padding(
                                end = 12. dp
                            )
                            .size(
                                30. dp
                            ),
                        painter = imgtelefono,
                        contentDescription = null,
                        tint = Color(0xFF3ddc84)
                    )
                    Text(
                        text = telefono,
                        fontSize = 18. sp,
                        color = Color(255,255,255),
                        fontWeight = FontWeight.W900
                    )

                }
                Row(
                    modifier = Modifier
                        .weight(1f)
                        .fillMaxWidth()
                        .padding(
                            start = 85. dp,
                        ),
                    verticalAlignment = Alignment.CenterVertically,
                ) {
                    Icon(
                        modifier = Modifier
                            .padding(
                                end = 12. dp
                            )
                            .size(
                                30. dp
                            ),
                        painter = imggit,
                        contentDescription = null,
                        tint = Color(0xFF3ddc84)
                    )
                    Text(
                        text = github,
                        fontSize = 18. sp,
                        color = Color(255,255,255),
                        fontWeight = FontWeight.W900
                    )

                }
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .weight(1f)
                        .padding(
                            start = 85. dp,
                        ),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Icon(
                        modifier = Modifier
                            .padding(
                                end = 12. dp
                            )
                            .size(
                                30. dp
                            ),
                        painter = imgmensaje,
                        contentDescription = null,
                        tint = Color(0xFF3ddc84)
                    )
                    Text(
                        text = correo,
                        fontSize = 18. sp,
                        color = Color(255,255,255),
                        fontWeight = FontWeight.W900
                    )

                }
            }

        }

    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    TarjetaDePresentacionTheme {
        TarjetaDePresentacion()
    }
}