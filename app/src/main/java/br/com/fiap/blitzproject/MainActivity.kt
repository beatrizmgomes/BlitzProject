package br.com.fiap.blitzproject

import OcorrenciaPolicialForm
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import br.com.fiap.blitzproject.ui.theme.BlitzProjectTheme

class MainActivity : ComponentActivity() {
    private lateinit var navController: NavHostController // Declarar uma propriedade para o NavController
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BlitzProjectTheme {

                navController = rememberNavController()
                NavHost(navController = navController, startDestination = "telaInicial") {
                    composable(route = "telaInicial") { TelaInicial(navController) }
                    composable(route = "telaMenu") { TelaMenuComposable(navController) }
                    composable(route = "telaPerfil"){ TelaPerfilComposable(navController)}
                    composable(route = "telaOcorrencia") { OcorrenciaPolicialForm(navController)}
                }
            }
        }
    }
}