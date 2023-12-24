package com.example.counter

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.counter.ui.theme.CounterTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CounterTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    MainScreen()
                }
            }
        }
    }
}

/**
 * In Jetpack Compose, we use @Composable - annotation,
 * simply with this @ we say, that this fun has scope in compilation
 * with the specific instructions, parameters and calls.
 *
 * Start names of such fun in UI scope with capital letter
 * Ex: MainScreen, TopBar, and etc.
 */
@Composable
fun MainScreen() {
    /**
     * Text is the TextView. It also has attributes, and here are some of them.
     */
    Text(
        text = "Hello Jetpack Compose World!",
        fontSize = 28.sp,
        color = MaterialTheme.colorScheme.error
    )
}

/**
 * @Preview is annotation, that allows us to preview the UI,
 * use it when you build a specific group of UI,
 * also u can use it when u want to see the whole screen.
 */
@Preview(showBackground = true)
@Composable
fun MainScreenPreview() {
    CounterTheme {
        MainScreen()
    }
}