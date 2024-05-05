class MainActivity : ComponentActivity() {
    private val viewModel: ReplyHomeViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            AppTheme {
                val windowSize = rememberWindowSizeClass()
                val devicePosture = devicePostureFlow.collectAsState().value
                val uiState = viewModel.uiState.collectAsState().value

                ReplyApp(windowSize, devicePosture, uiState)
            }
        }
    }
}