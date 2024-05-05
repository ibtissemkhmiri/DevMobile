class GetCoinsUseCase(private val coinRepository: CoinRepository) {
    suspend fun execute(): List<Coin> {
        return coinRepository.getCoins()
    }
}