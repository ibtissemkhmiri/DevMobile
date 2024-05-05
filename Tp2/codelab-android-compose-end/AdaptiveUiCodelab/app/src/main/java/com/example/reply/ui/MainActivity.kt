package com.example.reply

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.reply.ui.ReplyApp
import com.example.reply.ui.ReplyHomeUIState

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                val viewModel: ReplyHomeViewModel = viewModel(factory = (application as MyApplication).viewModelProvider)
                ReplyApp(
                    windowSize = windowSizeClass.widthSizeClass,
                    foldingDevicePosture = DevicePosture.NormalPosture,
                    replyHomeUIState = viewModel.uiState.value
                )
            }
        }
    }
}
s