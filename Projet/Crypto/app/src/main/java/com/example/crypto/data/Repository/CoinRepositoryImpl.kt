interface CoinRepository {
    suspend fun getCoins(): List<Coin>
    suspend fun getCoinDetail(coinId: String): CoinDetail
}

class CoinRepositoryImpl(private val apiService: CoinPaprikaApi) : CoinRepository {
    override suspend fun getCoins(): List<Coin> {
        return apiService.getCoins()
    }

    override suspend fun getCoinDetail(coinId: String): CoinDetail {
        return apiService.getCoinDetail(coinId)
    }
}