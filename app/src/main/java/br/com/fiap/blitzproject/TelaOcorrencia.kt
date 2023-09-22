import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            OcorrenciaPolicialForm(navController = rememberNavController())
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun OcorrenciaPolicialForm(navController: NavHostController) {
    var descricao by remember { mutableStateOf("") }
    var dataHora by remember { mutableStateOf("") }
    var localizacao by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        // Título do formulário
        Text(
            text = "Adicionar Ocorrência Policial",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Black
        )

        // Campo de descrição da ocorrência
        OutlinedTextField(
            value = descricao,
            onValueChange = { descricao = it },
            label = { Text(text = "Descrição da Ocorrência") },
            modifier = Modifier
                .fillMaxWidth()
                .height(100.dp)
        )

        // Campo de data e hora
        OutlinedTextField(
            value = dataHora,
            onValueChange = { dataHora = it },
            label = { Text(text = "Data e Hora") },
            modifier = Modifier
                .fillMaxWidth()
                .height(50.dp)
        )

        // Campo de localização
        OutlinedTextField(
            value = localizacao,
            onValueChange = { localizacao = it },
            label = { Text(text = "Localização") },
            modifier = Modifier
                .fillMaxWidth()
                .height(50.dp)
        )

        // Botão para adicionar a ocorrência
        Button(
            onClick = {
                // Aqui você pode adicionar a lógica para processar a ocorrência
            },
            modifier = Modifier
                .fillMaxWidth()
                .height(60.dp)
        ) {
            Text(
                text = "Adicionar Ocorrência",
                fontWeight = FontWeight.Bold
            )
        }
    }
}

