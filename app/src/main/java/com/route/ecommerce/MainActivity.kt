package com.route.ecommerce

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.route.ecommerce.accountdetailsscreen.AccountDetailsScreen
import com.route.ecommerce.loginscreen.LogInScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        installSplashScreen()
        setContent {
            AccountDetailsScreen()
        }
    }
}

