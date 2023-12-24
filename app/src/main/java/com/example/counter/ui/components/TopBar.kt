package com.example.counter.ui.components

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun TopBar() {
    Text(
        modifier = Modifier.padding(20.dp),
        text = "Hello, Counter in Jetpack Compose!",
        fontSize = 28.sp,
        color = MaterialTheme.colorScheme.secondary,
        textAlign = TextAlign.Center,
        fontWeight = FontWeight.Bold
    )
}