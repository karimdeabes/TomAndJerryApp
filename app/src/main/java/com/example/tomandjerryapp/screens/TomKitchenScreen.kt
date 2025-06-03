package com.example.tomandjerryapp.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tomandjerryapp.R
import com.example.tomandjerryapp.composables.PriceText
import com.example.tomandjerryapp.composables.SpacerHorizontal
import com.example.tomandjerryapp.composables.SpacerVertical
import com.example.tomandjerryapp.ui.theme.DarkGray60Alpha
import com.example.tomandjerryapp.ui.theme.DeepOceanBlue
import com.example.tomandjerryapp.ui.theme.DimBlack87Alpha
import com.example.tomandjerryapp.ui.theme.IBMPlexSansArabic
import com.example.tomandjerryapp.ui.theme.LightBabyBlue
import com.example.tomandjerryapp.ui.theme.LightPastelBlue
import com.example.tomandjerryapp.ui.theme.OceanBlue50Alpha
import com.example.tomandjerryapp.ui.theme.UserNameBlack
import com.example.tomandjerryapp.ui.theme.White87Alpha

@Composable
fun TomKitchenScreen() {
    Box(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .align(Alignment.TopCenter)
                .background(
                    color = OceanBlue50Alpha
                )
                .fillMaxHeight(0.39f)
        ) {
            Image(
                painter = painterResource(R.drawable.ellipse_3),
                contentDescription = null,
                modifier = Modifier
                    .fillMaxWidth(0.5f),
                alignment = Alignment.CenterStart,
                contentScale = ContentScale.Crop
            )

            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.Start,
                modifier = Modifier
                    .padding(20.dp)
                    .offset(y = (25).dp)
            ) {
                HeaderText(
                    painter = painterResource(R.drawable.ruler),
                    text = "High tension"

                )

                SpacerVertical(20)

                HeaderText(
                    painter = painterResource(R.drawable.chef),
                    text = "Shocking foods"
                )
            }

        }
        Column(
            modifier = Modifier
                .background(
                    color = White87Alpha,
                    shape = RoundedCornerShape(
                        topStart = 20.dp,
                        topEnd = 20.dp
                    )
                )
                .fillMaxWidth()
                .fillMaxHeight(0.79f)
                .padding(16.dp)
                .align(Alignment.BottomCenter)
        ) {
            Row (
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 16.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ){
                Column(
                    modifier = Modifier
                        .weight(1f)
                        .padding(),
                    verticalArrangement = Arrangement.SpaceBetween,
                    horizontalAlignment = Alignment.Start
                ) {
                    Text(
                        text = "Electric Tom pasta",
                        modifier = Modifier,
                        color = DimBlack87Alpha,
                        fontSize = 25.sp,
                        fontFamily = IBMPlexSansArabic,
                        fontWeight = FontWeight.Medium
                    )

                    SpacerVertical(8)

                    Row(
                        modifier = Modifier
                            .height(37.dp)
                            .background(
                                color = LightPastelBlue,
                                shape = RoundedCornerShape(10.dp))
                            .padding(8.dp),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.Center

                    ) {
                        Icon(
                            modifier = Modifier.size(20.dp),
                            painter = painterResource(R.drawable.money_bag_01),
                            contentDescription = null,
                            tint = DeepOceanBlue
                        )

                        SpacerHorizontal(6)

                        PriceText(null, "5")

                    }
                }

                Icon(
                    modifier = Modifier
                        .clickable {}
                        .size(28.dp),
                    painter = painterResource(R.drawable.heart),
                    contentDescription = null,
                    tint = DeepOceanBlue
                )
            }

            SpacerVertical(20)

            Text(
                text = "Pasta cooked with a charger cable and\nsprinkled with questionable cheese. Make sure\nto unplug it before eating (or not, you decide).",
                modifier = Modifier,
                color = DarkGray60Alpha,
                fontSize = 17.sp,
                fontFamily = IBMPlexSansArabic,
                fontWeight = FontWeight.Medium
            )
        }

        Image(
            painter = painterResource(R.drawable.dish),
            contentDescription = null,
            modifier = Modifier
                .align(Alignment.TopEnd)
                .padding(25.dp)
                .offset(y = (-10).dp)
                .fillMaxWidth(0.6f)
        )
    }
}

@Composable
fun HeaderText(
    painter: Painter,
    text: String
) {
    Row(
        modifier = Modifier,
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Image(
            painter = painter,
            contentDescription = null,
            modifier = Modifier
                .size(30.dp)
        )

        SpacerHorizontal(8)

        Text(
            text = text,
            modifier = Modifier,
            color = White87Alpha,
            fontSize = 20.sp,
            fontFamily = IBMPlexSansArabic,
            fontWeight = FontWeight.Medium
        )
    }
}

@Preview(name = "Pixel 8", showBackground = true, widthDp = 448, heightDp = 998)
@Preview(showBackground = true, widthDp = 360, heightDp = 800)
@Composable
fun TomKitchenScreenPreview() {
    TomKitchenScreen()
}
