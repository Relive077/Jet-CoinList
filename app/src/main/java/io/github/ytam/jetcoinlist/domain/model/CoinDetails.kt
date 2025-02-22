package io.github.ytam.jetcoinlist.domain.model

data class CoinDetails(
    val id: String,
    val name: String,
    val description: String,
    val firstDataDate: String,
    val lastDataDate: String,
    val symbol: String,
    val type: String
)
