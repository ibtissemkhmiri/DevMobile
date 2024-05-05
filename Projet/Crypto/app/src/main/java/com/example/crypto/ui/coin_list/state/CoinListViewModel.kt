class CoinViewModel(private val getCoinsUseCase: GetCoinsUseCase) : ViewModel() {
    private val _coins = MutableLiveData<List<Coin>>()
    val coins: LiveData<List<Coin>> = _coins

    fun fetchCoins() {
        viewModelScope.launch {
            _coins.value = getCoinsUseCase.execute()
        }
    }
}