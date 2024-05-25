package com.example.ecommerceproj.navigationbottombar.data

sealed class Screen(val route: String) {

    object AccountDetailsScreen {
        val route = "account_detail_screen"
    }

}