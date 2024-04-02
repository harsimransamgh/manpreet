package com.kaur.manpreet

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.kaur.manpreet.ui.theme.ManpreetTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ManpreetTheme {

                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colorScheme.background) {
                    WellnessTipList()
                }
            }
        }
    }
}

@Composable
fun WellnessTipList(viewModel: WellnessViewModel = WellnessViewModel()) {
    val tips = viewModel.wellnessTips
    LazyColumn {
        items(tips) { tip ->
            WellnessTipItem(tip)
        }
    }
}

@Composable
fun WellnessTipItem(tip: Wellness) {
    // Implementation of the tip item composable
}