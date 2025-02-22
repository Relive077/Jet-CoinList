package io.github.ytam.jetcoinlist.presentation.navigation

sealed class Screen(val route: String) {
    object SplashScreen : Screen("splash_screen")
    object CoinListScreen : Screen("main_screen")
    object CoinDetailsScreen : Screen("details_screen")
}
