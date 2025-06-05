package com.example.tomandjerryapp.donuts.composables

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tomandjerryapp.ui.theme.Inter

@Composable
fun DonutsButton(
    modifier: Modifier = Modifier,
    text: String,
    containerColor: Color,
    fonSize: Int,
    textColor: Color,
    padding: Int = 0
) {
    Button(
        modifier = modifier
            .fillMaxWidth(),
        onClick = { },
        colors = ButtonDefaults.buttonColors(
            containerColor = containerColor
        )
    ) {
        Text(
            modifier = Modifier
                .padding(padding.dp),
            text = text,
            color = textColor,
            fontSize = fonSize.sp,
            fontFamily = Inter,
            fontWeight = FontWeight.SemiBold
        )
    }
}