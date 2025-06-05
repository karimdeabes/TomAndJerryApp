package com.example.tomandjerryapp.donuts.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tomandjerryapp.R
import com.example.tomandjerryapp.ui.theme.CoralPink
import com.example.tomandjerryapp.ui.theme.IBMPlexSansArabic
import com.example.tomandjerryapp.ui.theme.Inter
import com.example.tomandjerryapp.ui.theme.PinkLavender
import com.example.tomandjerryapp.ui.theme.PinkRed

@Composable
fun HomeScreen() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(
                color = PinkLavender
            )

    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .verticalScroll(rememberScrollState()),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Top
        ) {
            Image(
                painter = painterResource(R.drawable.donuts_background),
                contentDescription = "Background",
                modifier = Modifier
                    .fillMaxWidth(),
                contentScale = ContentScale.Fit
            )

            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .align(Alignment.End)
                    .padding(horizontal = 40.dp)
                    .offset(y = (-137).dp),
                horizontalAlignment = Alignment.Start,
                verticalArrangement = Arrangement.Center
            ) {

                DonutsHeaderText(text = "Gonuts")
                DonutsHeaderText(text = "with")
                DonutsHeaderText(text = "Donuts")
                Text(
                    modifier = Modifier
                        .padding(top = 20.dp),
                    text = "Gonuts with Donuts is a Sri Lanka\n" +
                            "dedicated food outlets for specialize\n" +
                            "manufacturing of Donuts in Colombo,\nSri Lanka.",
                    color = CoralPink,
                    fontSize = 19.sp,
                    fontFamily = Inter,
                    fontWeight = FontWeight.Medium,
                )

            }
        }
        Row (
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentSize()
                .align(Alignment.BottomCenter)
                .padding( bottom = 35.dp, start = 40.dp, end = 40.dp)

        ){
            Button(
                modifier = Modifier
                    .fillMaxWidth(),
                onClick = { },
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.White
                )
            ) {
                Text(
                    modifier = Modifier
                        .padding(12.dp),
                    text = "Get Started",
                    color = Color.Black,
                    fontSize = 23.sp,
                    fontFamily = Inter,
                    fontWeight = FontWeight.SemiBold
                )
            }
        }
    }
}

@Composable
fun DonutsHeaderText(text: String) {
    Text(
        text = text,
        modifier = Modifier,
        color = PinkRed,
        fontSize = 56.sp,
        fontFamily = Inter,
        fontWeight = FontWeight.Bold,
    )
}

@Preview(name = "Pixel 8", showBackground = true, widthDp = 448, heightDp = 998)
@Composable
fun HomeScreenPreview() {
    HomeScreen()
}
