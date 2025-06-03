package com.example.tomandjerryapp.composables

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.sp
import com.example.tomandjerryapp.ui.theme.DeepOceanBlue
import com.example.tomandjerryapp.ui.theme.IBMPlexSansArabic

@Composable
fun PriceText(
    oldPrice: String?,
    currentPrice: String,
) {
    Text(
        text = buildAnnotatedString {
            if (oldPrice != null) {
                withStyle(
                    style = SpanStyle(
                        textDecoration = TextDecoration.LineThrough
                    )
                ) {
                    append(oldPrice)
                }
                append(" $currentPrice cheeses")
            } else {
                append("$currentPrice cheeses")
            }

        },
        color = DeepOceanBlue,
        fontSize = 15.sp,
        fontFamily = IBMPlexSansArabic,
        fontWeight = FontWeight.Medium,
        textAlign = TextAlign.Center,
        maxLines = 1,
    )
}