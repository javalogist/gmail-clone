package com.developer.javalogist.components

import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import com.developer.javalogist.model.BottomMenuData

@Composable
fun HomeBottomMenu() {
    val bottomMenuList = listOf(BottomMenuData.Mail, BottomMenuData.Meet)

    BottomNavigation(
        backgroundColor = Color.White, contentColor = Color.Black
    ) {
        bottomMenuList.forEach {
            BottomNavigationItem(label = { Text(text = it.title) },
                alwaysShowLabel = true,
                selected = false,
                icon = { Icon(imageVector = it.icon, contentDescription = null) },
                onClick = { /*TODO*/ })
        }
    }
}