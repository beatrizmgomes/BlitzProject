package br.com.fiap.blitzproject


import android.os.Bundle
import android.widget.ImageButton
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box


import androidx.compose.foundation.layout.Column


import androidx.compose.foundation.layout.Row


import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.fiap.blitzproject.ui.theme.BlitzProjectTheme

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.materialIcon
import androidx.compose.material.icons.rounded.Settings
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Icon
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import com.louiscad.splitties.resources.splittiesSvgResource


class TelaPrincipal : ComponentActivity() {
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
fun TelaInicial() {

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp), // Ajuste o espaço conforme necessário
        contentAlignment = Alignment.TopEnd // Posiciona o conteúdo no canto superior direito
    ) {
        Text(
            text = "Bem vindo(a), Ana!",
            color = Color.Black,
            fontSize = 18.sp
        )
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp), // Adicione margens para dar espaço aos botões
        verticalArrangement = Arrangement.Center, // Alinhar a coluna verticalmente no centro
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // Primeira linha
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        )

        {
            Button(
                onClick = { /*TODO*/ },
                modifier = Modifier
                    .weight(1f) // Distribuir espaço igualmente entre os botões
                    .fillMaxWidth(), // Preencher a largura máxima
                colors = ButtonDefaults.buttonColors(containerColor = Color.LightGray)
            ) {

                Text(
                    text = "Adicionar Ocorrência",
                    color = Color.Black
                )
            }
            Button(
                onClick = { /*TODO*/ },
                modifier = Modifier
                    .weight(1f) // Distribuir espaço igualmente entre os botões
                    .fillMaxWidth(), // Preencher a largura máxima
                colors = ButtonDefaults.buttonColors(containerColor = Color.LightGray)

            ) {
                Text(
                    text = "Avaliar Localização",
                    color = Color.Black
                )
            }
        }

        // Segunda linha
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Button(
                onClick = { /*TODO*/ },
                modifier = Modifier
                    .weight(1f) // Distribuir espaço igualmente entre os botões
                    .fillMaxWidth(), // Preencher a largura máxima
                colors = ButtonDefaults.buttonColors(containerColor = Color.LightGray)

            ) {
                Text(
                    text = "Contato Policial",
                    color = Color.Black
                )
            }
            Button(

                onClick = { /*TODO*/ },
                modifier = Modifier
                    .weight(1f) // Distribuir espaço igualmente entre os botões
                    .fillMaxWidth(), // Preencher a largura máxima
                colors = ButtonDefaults.buttonColors(containerColor = Color.LightGray)

            ) {
                Text(
                    text = "Feedback",
                    color = Color.Black
                )
            }
        }

    }


    // Barra inferior tela
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

            }

            Button(
                onClick = { /*TODO*/ },
                modifier = Modifier
                    .weight(1f)
                    .fillMaxWidth(),
                colors = ButtonDefaults.buttonColors(containerColor = Color.LightGray)
            ) {
                // Conteúdo do Botão 2 (Ícone 2)

            }

            Button(
                onClick = { /*TODO*/ },
                modifier = Modifier
                    .weight(1f)
                    .fillMaxWidth(),
                colors = ButtonDefaults.buttonColors(containerColor = Color.LightGray)

            ) {
                // Conteúdo do Botão 3 (Ícone 3)
                Icon(
                    imageVector = Icons.Filled.Person,
                    contentDescription = null,
                    modifier = Modifier.size(ButtonDefaults.IconSize)

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
                Icon(
                    imageVector = Icons.Rounded.Settings,
                    contentDescription = null,
                    modifier = Modifier.size(ButtonDefaults.IconSize)
                )

            }
        }

    }
}




























