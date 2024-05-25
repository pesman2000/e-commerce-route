package com.route.ecommerce.navigationbottombar

//noinspection UsingMaterialAndMaterial3Libraries
import android.annotation.SuppressLint
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
//noinspection UsingMaterialAndMaterial3Libraries
import androidx.compose.material.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemColors
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.route.ecommerce.navigationbottombar.data.item
import com.route.ecommerce.ui.theme.RouteBlue

@SuppressLint("AutoboxingStateCreation")
@Composable
fun NavigationModel() {

    var selectedItemIndex by rememberSaveable { mutableStateOf(0) }

    Surface{
        Scaffold(
            bottomBar = {
                NavigationBar(
                    containerColor = RouteBlue,
                    modifier = Modifier
                        .height(80.dp)
                        .clip(
                            shape = RoundedCornerShape(
                                topStart = 15.dp,
                                topEnd = 15.dp))) {
                    item.forEachIndexed { index, item ->
                        NavigationBarItem(
                            selected = selectedItemIndex == index,
                            onClick = {
                                selectedItemIndex = index
                               // navController.navigate(item.title)
                            },
                            icon = {
                                Icon(
                                    painter = painterResource(id =
                                    if (index == selectedItemIndex)
                                        {item.selectedIcon}
                                    else item.unselectedIcon),
                                    contentDescription = item.title,
                                    tint = if (index == selectedItemIndex)
                                        RouteBlue
                                    else Color.White
                                )
                            },
                            colors = NavigationBarItemColors(
                                selectedIndicatorColor = Color.White,
                                selectedTextColor =Color.Transparent,
                                selectedIconColor =RouteBlue,
                                unselectedIconColor =Color.White,
                                unselectedTextColor =Color.White,
                                disabledIconColor =Color.Transparent,
                                disabledTextColor =Color.Transparent
                            )
                        )
                    }
                }
            }
        ) {
            paddingValues ->
        }
    }
}

@Preview
@Composable
private fun NavigationModelPreview() {
    NavigationModel()
}
