package com.example.androidtestapp.navigation

import androidx.annotation.DrawableRes
import com.example.androidtestapp.R

sealed class BottomNavItem(
    val route: String,
    val title: String,
    @DrawableRes val icon: Int
) {
    object Home : BottomNavItem("home", "Home", R.drawable.ic_home)
    object Dashboard : BottomNavItem("dashboard", "Dashboard", R.drawable.ic_dashboard)
    object Settings : BottomNavItem("settings", "Settings", R.drawable.ic_settings)
}

val bottomNavItems = listOf(
    BottomNavItem.Home,
    BottomNavItem.Dashboard,
    BottomNavItem.Settings
)