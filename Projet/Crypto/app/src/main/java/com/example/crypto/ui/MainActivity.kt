class MainActivity : AppCompatActivity() {
    private val viewModel: CoinViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModel.fetchCoins()

        viewModel.coins.observe(this, Observer { coins ->
            // Update UI with the list of coins
        })
    }
}