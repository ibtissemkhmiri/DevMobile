package com.example.crypto.data.Repository

import com.example.crypto.data.data_source.remote.dto.CoinDetailDto
import com.example.crypto.data.data_source.remote.dto.CoinDto

interface CoinRepository {
    suspend fun getCoins():List<CoinDto>
    suspend fun getCoinById(coinId:String): CoinDetailDto
}