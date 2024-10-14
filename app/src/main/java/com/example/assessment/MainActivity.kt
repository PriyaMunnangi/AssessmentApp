package com.example.assessment

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.compose.rememberNavController
import com.example.assessment.navigation.HiringNavHost
import com.example.assessment.screen.hiring.HiringViewmodel
import com.example.assessment.ui.theme.AssessmentTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            val navController = rememberNavController()
            AssessmentTheme {
                val hiringViewmodel = hiltViewModel<HiringViewmodel>()

                Scaffold { innerPadding ->

                    HiringNavHost(
                        navController,
                        Modifier.padding(innerPadding),
                        hiringViewmodel,
                    )

                }
            }
        }
    }
}