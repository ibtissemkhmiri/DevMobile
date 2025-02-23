package com.example.crypto.ui.coin_list.state

import com.example.crypto.domain.model.Coin

data class CoinListState(
    val coins: List<Coin> = emptyList(),
    val isLoading: Boolean = false,
    val error: String = ""
)