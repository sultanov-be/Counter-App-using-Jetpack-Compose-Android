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
fun CounterText(counter: Int) {
    Text(
        modifier = Modifier.padding(bottom = 50.dp),
        text = "$counter",
        fontSize = 32.sp,
        color = MaterialTheme.colorScheme.secondary,
        textAlign = TextAlign.Center,
        fontWeight = FontWeight.Bold
    )
}