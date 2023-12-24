package com.example.counter.ui.components

import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun IconButton(
    icon: ImageVector,
    modifier: Modifier = Modifier,
    onClick: () -> Unit)
{
    Button(
        modifier =  modifier.size(70.dp, 50.dp),
        onClick = onClick
    ) {
        Icon(
            icon,
            contentDescription = ""
        )
    }
}

@Composable
fun TextButton(
    text: String,
    modifier: Modifier = Modifier,
    onClick: () -> Unit)
{
    Button(
        modifier =  modifier.size(70.dp, 50.dp),
        onClick = onClick
    ) {
        Text(
            text = text,
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold
        )
    }
}