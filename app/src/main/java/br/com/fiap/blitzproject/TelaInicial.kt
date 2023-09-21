package br.com.fiap.blitzproject


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box


import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues


import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer


import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
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

import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController


class TelaPrincipal : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        setContent {
            BlitzProjectTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                ) {
                    TelaInicial(navController = rememberNavController())
                }

            }
        }
    }
}



@Composable
fun TelaInicial(
    navController: NavController
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        // Botões "Adicionar Ocorrência" e "Localização"
        Column(
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            BotaoGrande(
                onClick = { /* Ação para Adicionar Ocorrência */ },
                texto = "Adicionar Ocorrência",
                iconeResId = R.drawable.bmi_lista
            )

            BotaoGrande(
                onClick = { /* Ação para Avaliar Localização */ },
                texto = "Localização",
                iconeResId = R.drawable.bmi_localizacao
            )
        }

        Spacer(modifier = Modifier.height(16.dp))

        // Botões "Feedback" e "Contato"
        Column(
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            BotaoGrande(
                onClick = { /* Ação para Feedback */ },
                texto = "Feedback",
                iconeResId = R.drawable.bmi_feedbackcliente
            )

            BotaoGrande(
                onClick = { /* Ação para Contato Policial */ },
                texto = "Contato",
                iconeResId = R.drawable.bmi_contato
            )
        }

        // Botões "Menu", "Camera", "Perfil" e "Configurações"
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            BotaoPequeno(
                onClick = { navController.navigate("telaMenu") },
                iconeResId = R.drawable.bmi_menu
            )

            BotaoPequeno(
                onClick = { /* Ação para Câmera */ },
                iconeResId = R.drawable.bmi_camera
            )

            BotaoPequeno(
                onClick = { navController.navigate("telaPerfil") },
                iconeResId = R.drawable.bmi_perfil
            )

            BotaoPequeno(
                onClick = { /* Ação para Configurações */ },
                iconeResId = R.drawable.bmi_config
            )
        }
    }
}

@Composable
fun BotaoGrande(
    onClick: () -> Unit,
    texto: String,
    iconeResId: Int
) {
    Button(
        onClick = onClick,
        modifier = Modifier
            .fillMaxWidth()
            .height(150.dp) // Aumenta a altura dos botões de texto grande
            .background(Color.LightGray),
        shape = MaterialTheme.shapes.large,
        contentPadding = PaddingValues(16.dp)
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Image(
                painter = painterResource(id = iconeResId),
                contentDescription = null,
                modifier = Modifier
                    .size(48.dp)
            )
            Spacer(modifier = Modifier.height(8.dp))
            Text(
                text = texto,
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold
            )
        }
    }
}

@Composable
fun BotaoPequeno(
    onClick: () -> Unit,
    iconeResId: Int
) {
    Button(
        onClick = onClick,
        modifier = Modifier
            .size(60.dp)
            .background(Color.LightGray),
        shape = CircleShape,
        contentPadding = PaddingValues(8.dp)
    ) {
        Image(
            painter = painterResource(id = iconeResId),
            contentDescription = null,
            modifier = Modifier
                .size(36.dp)
        )
    }
}





























