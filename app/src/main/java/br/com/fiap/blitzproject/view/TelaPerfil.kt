package br.com.fiap.blitzproject.view

import br.com.fiap.blitzproject.R

package br.com.fiap.blitzproject


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement


import androidx.compose.foundation.layout.Column


import androidx.compose.foundation.layout.Row


import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import br.com.fiap.blitzproject.ui.theme.BlitzProjectTheme

import androidx.compose.ui.res.painterResource


class TelaPerfil : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BlitzProjectTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    TelaInicial()
                }

            }
        }
    }
}

@Composable
fun TelaPerfil(
    navController: NavController
){


    fun TelaPerfil() = // Barra inferior tela

        Column(
            verticalArrangement = Arrangement.Bottom,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth() // Ocupar toda a largura da tela
                    .padding(16.dp), // Espaçamento interno

//                    horizontalArrangement = Arrangement.SpaceBetween // Alinhamento dos elementos dentro da Row

            ) {
                Button(
                    onClick = { /*TODO*/ },
                    modifier = Modifier
                        .weight(1f)
                        .fillMaxWidth(),
                    colors = ButtonDefaults.buttonColors(containerColor = Color.LightGray)
                ) {
                    // Conteúdo do Botão 1 (Ícone 1)
                    Image(
                        painter = painterResource(id = R.drawable.bmi_menu),
                        contentDescription = "Logo menu de itens."
                )

            }

            Button(
                onClick = { /*TODO*/ },
                modifier = Modifier
                    .weight(1f)
                    .fillMaxWidth(),
                colors = ButtonDefaults.buttonColors(containerColor = Color.LightGray)
            ) {
                // Conteúdo do Botão 2 (Ícone 2)
                Image(
                    painter = painterResource(id = R.drawable.bmi_camera),
                    contentDescription = "Logo câmera fotográfica."
                )

            }

            Button(
                onClick = { /*TODO*/ },
                modifier = Modifier
                    .weight(1f)
                    .fillMaxWidth(),
                colors = ButtonDefaults.buttonColors(containerColor = Color.LightGray)

            ) {
                // Conteúdo do Botão 3 (Ícone 3)
                Image(
                    painter = painterResource(id = R.drawable.bmi_perfil),
                    contentDescription = "Logo perfil do usuário."
                )
            }

            Button(
                onClick = { /*TODO*/ },
                modifier = Modifier
                    .weight(1f)
                    .fillMaxWidth(),
                colors = ButtonDefaults.buttonColors(containerColor = Color.LightGray)

            ) {
                // Conteúdo do Botão 4 (Ícone 4)
                Image(
                    painter = painterResource(id = R.drawable.bmi_config),
                    contentDescription = "Logo de configurações."
                )

            }
        }

    }




























