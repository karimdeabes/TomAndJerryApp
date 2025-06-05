package com.example.tomandjerryapp.tomandjerry.composables

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.tomandjerryapp.ui.theme.DimBlack87Alpha
import com.example.tomandjerryapp.ui.theme.IBMPlexSansArabic

@Composable
fun HeaderText(
    text: String,
    fontSize: Int,
    fontWeight: FontWeight,
    modifier: Modifier = Modifier) {
    Text(
        text = text,
        modifier = modifier,
        color = DimBlack87Alpha,
        fontSize = fontSize.sp,
        fontFamily = IBMPlexSansArabic,
        fontWeight = fontWeight
    )
}