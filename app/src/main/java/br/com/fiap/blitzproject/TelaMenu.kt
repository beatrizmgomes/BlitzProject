package br.com.fiap.blitzproject

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import br.com.fiap.blitzproject.ui.theme.BlitzProjectTheme
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.material3.Divider
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.platform.LocalSoftwareKeyboardController
import androidx.compose.ui.platform.LocalView
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController


class TelaMenu : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BlitzProjectTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    TelaMenu()
                }
            }
        }
    }
}

@Composable
fun TelaMenu(
    navController: NavController,
    onMenuItemClick: (String) -> Unit,
    modifier: Modifier = Modifier
) {
    var selectedItem by remember { mutableStateOf("Meus Dados") }

    Column(
        modifier = modifier.fillMaxSize(),
        horizontalAlignment = Alignment.Start
    ) {
        Spacer(modifier = Modifier.height(16.dp))

        MenuItem("Meus Dados", selectedItem == "Meus Dados") {
            selectedItem = "Meus Dados"
            onMenuItemClick("Meus Dados")
        }

        MenuItem("Minhas Ocorrências", selectedItem == "Minhas Ocorrências") {
            selectedItem = "Minhas Ocorrências"
            onMenuItemClick("Minhas Ocorrências")
        }

        MenuItem("Política de Privacidade", selectedItem == "Política de Privacidade") {
            selectedItem = "Política de Privacidade"
            onMenuItemClick("Política de Privacidade")
        }

        MenuItem("Sobre", selectedItem == "Sobre") {
            selectedItem = "Sobre"
            onMenuItemClick("Sobre")
        }

        Spacer(modifier = Modifier.height(16.dp))

        Divider(modifier = Modifier.fillMaxWidth(), color = Color.Gray)

        Spacer(modifier = Modifier.height(16.dp))

        MenuItem("Sair", selectedItem == "Sair") {
            selectedItem = "Sair"
            onMenuItemClick("Sair")
        }
    }
}

@Composable
private fun MenuItem(text: String, selected: Boolean, onClick: () -> Unit) {
    val textColor = if (selected) MaterialTheme.colorScheme.primary else Color.Black

    Surface(
        modifier = Modifier.fillMaxWidth(),
        color = if (selected) Color.LightGray else Color.Transparent
    ) {
        Text(
            text = text,
            modifier = Modifier
                .padding(16.dp)
                .clickable { onClick() }
                .padding(8.dp),
            color = textColor,

        )
    }
}

//@Preview(showBackground = true, showSystemUi = true)
//@Composable
//fun TelaMenuPreview() {
//    BlitzProjectTheme {
//        TelaMenu()
//    }
//}
