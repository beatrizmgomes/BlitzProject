package br.com.fiap.blitzproject

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import br.com.fiap.blitzproject.ui.theme.BlitzProjectTheme

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
                    TelaPerfilComposable(navController = rememberNavController())
                }
            }
        }
    }
}

@Composable
fun TelaPerfilComposable(navController: NavController) {
    var username by remember { mutableStateOf("Seu Nome") }
    var phoneNumber by remember { mutableStateOf("Seu Número de Telefone") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        // Avatar do perfil
        Image(
            painter = painterResource(id = R.drawable.bmi_perfil), // Substitua com o seu próprio recurso de imagem
            contentDescription = null,
            modifier = Modifier
                .size(120.dp)
                .clip(MaterialTheme.shapes.medium)
                .background(MaterialTheme.colorScheme.primary)
                .padding(4.dp),
            contentScale = ContentScale.Crop
        )

        Spacer(modifier = Modifier.height(16.dp))

        // Nome de usuário
        BasicTextField(
            value = username,
            onValueChange = { username = it },
            singleLine = true,
            keyboardOptions = KeyboardOptions.Default.copy(
                imeAction = ImeAction.Done
            ),
            keyboardActions = KeyboardActions(
                onDone = {
                    // Executar ação quando o teclado "Done" for pressionado
                }
            ),
            textStyle = TextStyle(fontSize = 24.sp, fontWeight = FontWeight.Bold),
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(16.dp))

        // Número de telefone
        BasicTextField(
            value = phoneNumber,
            onValueChange = { phoneNumber = it },
            singleLine = true,
            keyboardOptions = KeyboardOptions.Default.copy(
                imeAction = ImeAction.Done
            ),
            keyboardActions = KeyboardActions(
                onDone = {
                    // Executar ação quando o teclado "Done" for pressionado
                }
            ),
            textStyle = TextStyle(fontSize = 16.sp, color = Color.Gray),
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(16.dp))

        // Botão de edição do perfil
        Button(
            onClick = { /* Ação de edição do perfil */ },
            modifier = Modifier
                .fillMaxWidth()
        ) {
            Text(text = "Editar Perfil")
        }

        Spacer(modifier = Modifier.height(16.dp))

        // Listagem de postagens ou informações adicionais do perfil
        LazyColumn(
            modifier = Modifier.fillMaxSize(),
            contentPadding = PaddingValues(8.dp)
        ) {
            items(10) { index ->
                // Substitua este conteúdo com as postagens ou informações do perfil reais
                Text(
                    text = "Postagem $index",
                    fontSize = 18.sp,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(8.dp)
                )
            }
         }
     }
}