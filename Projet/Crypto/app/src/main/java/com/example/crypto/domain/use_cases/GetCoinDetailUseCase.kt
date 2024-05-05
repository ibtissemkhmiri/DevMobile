class GetCoinDetailUseCase(private val coinRepository: CoinRepository) {
    suspend fun execute(coinId: String): CoinDetail {
        return coinRepository.getCoinDetail(coinId)
    }
}