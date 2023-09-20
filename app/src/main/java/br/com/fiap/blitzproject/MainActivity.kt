package br.com.fiap.blitzproject

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import br.com.fiap.blitzproject.navegacaoentretelas.TelaMenu
import br.com.fiap.blitzproject.ui.theme.BlitzProjectTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BlitzProjectTheme {

                val navController = rememberNavController()

                NavHost(navController = navController, startDestination = "telaInicial") {
                    composable(
                        route = "telaInicial"
                    ){
                        TelaInicial(navController)
                    }

                    composable(
                        route = "telaMenu"
                    ) {
                        TelaMenu()
                    }


                }
            }
        }
    }

}

