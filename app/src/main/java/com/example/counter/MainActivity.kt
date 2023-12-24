package com.example.counter

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Add
import androidx.compose.material.icons.rounded.Refresh
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
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
     * by remember and mutableStateOf is special functions
     * that dynamically changes and force ui to refresh mutable components.
     */
    var counter by remember {
        mutableIntStateOf(0)
    }

    /**
     * Column is view container, in the other words it is a Vertical LinearLayout.
     */
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally //centralize the views in Column
    ) {
        /**
         * Text is the TextView. It also has attributes, and here are some of them.
         */
        Text(
            modifier = Modifier.padding(20.dp),
            text = "Hello, Counter in Jetpack Compose!",
            fontSize = 28.sp,
            color = MaterialTheme.colorScheme.secondary,
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.Bold
        )

        /**
         * Box is useful view container.
         */
        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            Column(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {

                Text(
                    modifier = Modifier.padding(bottom = 50.dp),
                    text = "$counter",
                    fontSize = 32.sp,
                    color = MaterialTheme.colorScheme.secondary,
                    textAlign = TextAlign.Center,
                    fontWeight = FontWeight.Bold
                )

                Row {
                    /**
                     * Button in compose built like a container.
                     */
                    Button(
                        modifier = Modifier.size(70.dp, 50.dp),
                        onClick = {
                            if (counter != 0) counter--
                        }
                    ) {
                        Text(
                            text = "-",
                            fontSize = 18.sp,
                            fontWeight = FontWeight.Bold
                        )
                    }

                    /**
                     * Spacer is view, mostly used to fill space between other views.
                     */
                    Spacer(modifier = Modifier.size(20.dp))

                    Button(
                        modifier = Modifier.size(70.dp, 50.dp),
                        onClick = {
                            counter++
                        }
                    ) {
                        Icon(Icons.Rounded.Add, contentDescription = "")
                    }
                }
                Button(
                    modifier = Modifier.padding(top = 70.dp),
                    onClick = {
                        counter = 0
                    }
                ) {
                    Icon(Icons.Rounded.Refresh, contentDescription = "")
                }
            }
        }
    }
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