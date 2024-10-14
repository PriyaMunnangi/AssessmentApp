package com.example.assessment.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.assessment.screen.hiring.HiringItemIDListComposable
import com.example.assessment.screen.hiring.HiringNamesStateComposable
import com.example.assessment.screen.hiring.HiringViewmodel

@Composable
fun HiringNavHost(
    navController: NavHostController,
    modifier: Modifier,
    viewmodel: HiringViewmodel
) {

    NavHost(navController = navController,
        startDestination = HiringListID.route,
        modifier = modifier
        ) {
        composable(
            route = HiringListID.route
        ) {
            HiringItemIDListComposable(viewmodel.hiringState.keys.sorted()) {
                navController.navigate("${HiringNames.route}/$it")
            }
        }
        composable(route =  HiringNames.routeWithArgs,
            arguments = HiringNames.arguments) {
            val key = it.arguments?.getInt(HiringNames.key)
            val list= viewmodel.hiringState[key]?.toList() ?: emptyList()
            HiringNamesStateComposable(
                list.sortedBy {
                    it.name
                }
            )
        }
    }

}