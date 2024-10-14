package com.example.assessment.navigation

import androidx.navigation.NavType
import androidx.navigation.navArgument

interface HiringDestination {
    val route: String
}


object HiringListID: HiringDestination {
    override val route: String
        get() = "HiringListIDs"
}

object HiringNames: HiringDestination {
    override val route: String
        get() = "HiringNames"
    val key = "key"
    val arguments = listOf(
        navArgument(key) {
            type = NavType.IntType
        }
    )
    val routeWithArgs = "${route}/{${key}}"
}