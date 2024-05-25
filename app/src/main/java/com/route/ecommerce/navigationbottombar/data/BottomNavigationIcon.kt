package com.route.ecommerce.navigationbottombar.data

import com.route.ecommerce.R

data class BottomNavigationIcon(
    val title: String,
    val unselectedIcon: Int,
    val selectedIcon: Int,
)

val item: List<BottomNavigationIcon> = listOf(
    BottomNavigationIcon(
        "HomeScreen",
        R.drawable.home_not_selected,
        R.drawable.home_not_selected
    ),
    BottomNavigationIcon(
        "CollectionScreen",
        R.drawable.collection_not_selected,
        R.drawable.collection_not_selected
    ),
    BottomNavigationIcon(
        "FavoriteScreen",
        R.drawable.fav_not_selected,
        R.drawable.fav_not_selected
    ),
    BottomNavigationIcon(
        "AccountDetailScreen",
        R.drawable.prof_not_selected,
        R.drawable.prof_not_selected
    )
)

