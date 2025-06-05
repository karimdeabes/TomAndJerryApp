package com.example.tomandjerryapp.donuts.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tomandjerryapp.R
import com.example.tomandjerryapp.donuts.composables.ContentHeaderText
import com.example.tomandjerryapp.donuts.composables.DonutsButton
import com.example.tomandjerryapp.tomandjerry.composables.SpacerHorizontal
import com.example.tomandjerryapp.tomandjerry.composables.SpacerVertical
import com.example.tomandjerryapp.ui.theme.Inter
import com.example.tomandjerryapp.ui.theme.PinkLavender
import com.example.tomandjerryapp.ui.theme.PinkRed

@Composable
fun ItemScreen() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(
                color = Color.White
            )
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .verticalScroll(rememberScrollState())
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(0.46f)
                    .background(color = PinkLavender)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.one_donut),
                    contentDescription = null,
                    modifier = Modifier
                        .fillMaxWidth()
                        .wrapContentSize()
                        .align(Alignment.CenterHorizontally),
                    contentScale = ContentScale.Crop
                )
            }

            Box(
                modifier = Modifier
                    .background(
                        color = PinkLavender
                    )
                    .fillMaxSize()
                    .weight(0.56f)
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(
                            color = Color.White,
                            shape = RoundedCornerShape(
                                topStart = 40.dp,
                                topEnd = 40.dp
                            )
                        )
                        .padding(40.dp)
                ) {
                    ContentHeaderText(text = "Strawberry Wheel")

                    SectionHeader(
                        text = "About Gonut",
                        topPadding = 32
                    )

                    Text(
                        text = "These soft, cake-like Strawberry Frosted Donuts feature fresh strawberries and a delicious fresh strawberry glaze frosting. Pretty enough for company and the perfect treat to satisfy your sweet tooth.",
                        modifier = Modifier
                            .padding(top = 16.dp),
                        color = Color.Black.copy(alpha = 0.6f),
                        fontSize = 16.sp,
                        fontFamily = Inter,
                        fontWeight = FontWeight.Normal
                    )

                    SectionHeader(
                        text = "Quantity",
                        topPadding = 24
                    )

                    SpacerVertical(10)

                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(55.dp),
                        horizontalArrangement = Arrangement.Start,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        QuantityButton("-", Color.White, Color.Black, 34)
                        SpacerHorizontal(18)
                        QuantityButton("1", Color.White, Color.Black, 22)
                        SpacerHorizontal(18)
                        QuantityButton("+", Color.Black, Color.White, 32)
                    }

                    SpacerVertical(50)

                }


                Image(
                    painter = painterResource(R.drawable.fav_icon),
                    contentDescription = null,
                    modifier = Modifier
                        .align(Alignment.TopEnd)
                        .offset(y = (-60).dp)
                        .size(height = 125.dp, width = 118.dp)
                        .clickable(
                            onClick = { }
                        )
                )
            }

        }

        Image(
            painter = painterResource(R.drawable.arrow_back_),
            contentDescription = null,
            modifier = Modifier
                .align(Alignment.TopStart)
                .padding(start = 40.dp, top = 40.dp)
                .clickable { }
        )

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentHeight()
                .align(Alignment.BottomCenter)
                .padding(top = 0.dp, bottom = 20.dp, start = 40.dp, end = 40.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                modifier = Modifier,
                text = "£16",
                color = Color.Black,
                fontSize = 31.sp,
                fontFamily = Inter,
                fontWeight = FontWeight(614)
            )
            SpacerHorizontal(26)
            DonutsButton(
                text = "Add to Cart",
                containerColor = PinkRed,
                fonSize = 21,
                textColor = Color.White,
                padding = 14
            )
        }
    }
}


@Composable
fun SectionHeader(
    text: String,
    topPadding: Int
) {
    Text(
        modifier = Modifier
            .padding(top = topPadding.dp),
        text = text,
        color = Color.Black.copy(alpha = 0.69f),
        fontSize = 19.sp,
        fontFamily = Inter,
        fontWeight = FontWeight(530)
    )
}

@Composable
fun QuantityButton(
    text: String,
    containerColor: Color,
    contentColor: Color,
    fontSize: Int
) {
    Box(
        modifier = Modifier
            .size(51.dp)
            .padding(2.dp)
            .clickable { }
            .shadow(
                elevation = 0.6.dp,
                shape = RoundedCornerShape(16.dp)
            )
            .background(
                color = containerColor,
                shape = RoundedCornerShape(16.dp)
            ),
        contentAlignment = Alignment.Center
    ) {
        Text(
            modifier = Modifier
                .align(Alignment.Center)
                .padding(top = 0.dp, bottom = 5.dp),
            text = text,
            color = contentColor,
            fontSize = fontSize.sp,
            fontFamily = Inter,
            fontWeight = FontWeight.Medium,
            textAlign = TextAlign.Center
        )
    }
}

@Preview(name = "Pixel 8", showBackground = true, widthDp = 448, heightDp = 998)
@Composable
fun ItemScreenPreview() {
    ItemScreen()
}
