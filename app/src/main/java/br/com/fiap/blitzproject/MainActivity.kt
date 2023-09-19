package br.com.fiap.blitzproject

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import br.com.fiap.blitzproject.view.TelaMenu
import br.com.fiap.blitzproject.view.TelaPerfil

class MainActivity : ComponentActivity () {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {


            val navController = rememberNavController()

            NavHost(navController = navController , startDestination = "TelaMenu"){
                composable(
                    route = "TelaPerfil"
                ){
                    TelaPerfil(navController)
                }

                composable(
                    route = "TelaMenu"
                ){
                    TelaMenu(navController)
                }
            }
        }
    }

    }
}