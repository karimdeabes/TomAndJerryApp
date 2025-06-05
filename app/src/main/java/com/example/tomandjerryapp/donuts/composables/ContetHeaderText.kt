package com.example.tomandjerryapp.donuts.composables

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.tomandjerryapp.ui.theme.Inter
import com.example.tomandjerryapp.ui.theme.PinkRed

@Composable
fun ContentHeaderText(
    modifier: Modifier = Modifier,
    text: String
) {
    Text(
        text = text,
        color = PinkRed,
        fontSize = 33.sp,
        fontFamily = Inter,
        fontWeight = FontWeight.SemiBold
    )
}