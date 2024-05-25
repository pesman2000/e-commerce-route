package com.example.ecommerceproj.navigationbottombar.data

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.route.ecommerce.accountdetailsscreen.AccountDetailsScreen

@Composable
fun Navigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Screen.AccountDetailsScreen.route) {
        composable(route = Screen.AccountDetailsScreen.route) {
            AccountDetailsScreen(/*navController = navController*/)
        }
    }
}