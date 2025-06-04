package com.example.tomandjerryapp.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
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
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import com.example.tomandjerryapp.R
import com.example.tomandjerryapp.composables.HeaderText
import com.example.tomandjerryapp.composables.PriceText
import com.example.tomandjerryapp.composables.SpacerHorizontal
import com.example.tomandjerryapp.composables.SpacerVertical
import com.example.tomandjerryapp.ui.theme.DarkGray37Alpha
import com.example.tomandjerryapp.ui.theme.DarkGray60Alpha
import com.example.tomandjerryapp.ui.theme.DarkTealBlue
import com.example.tomandjerryapp.ui.theme.DeepOceanBlue
import com.example.tomandjerryapp.ui.theme.DeepOceanBlueText
import com.example.tomandjerryapp.ui.theme.DimBlack87Alpha
import com.example.tomandjerryapp.ui.theme.IBMPlexSansArabic
import com.example.tomandjerryapp.ui.theme.LightPastelBlue
import com.example.tomandjerryapp.ui.theme.OceanBlue50Alpha
import com.example.tomandjerryapp.ui.theme.VeryDarkGray
import com.example.tomandjerryapp.ui.theme.White38Alpha
import com.example.tomandjerryapp.ui.theme.White87Alpha

@Composable
fun TomKitchenScreen() {


    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .align(Alignment.TopCenter)
                .background(
                    color = OceanBlue50Alpha
                ), contentAlignment = Alignment.TopStart
        ) {
            Image(
                painter = painterResource(R.drawable.ellipse_3),
                contentDescription = null,
                modifier = Modifier
                    .fillMaxWidth(0.49f)
                    .fillMaxHeight(0.385f),
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
                FoodIngredients(
                    painter = painterResource(R.drawable.ruler), text = "High tension"

                )

                SpacerVertical(20)

                FoodIngredients(
                    painter = painterResource(R.drawable.chef), text = "Shocking foods"
                )
            }

        }
        Column(
            modifier = Modifier
                .background(
                    color = White87Alpha, shape = RoundedCornerShape(
                        topStart = 20.dp, topEnd = 20.dp
                    )
                )
                .fillMaxWidth()
                .fillMaxHeight(0.784f)
                .padding(16.dp)
                .align(Alignment.BottomCenter)
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 15.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Column(
                    modifier = Modifier.weight(1f),
                    verticalArrangement = Arrangement.SpaceBetween,
                    horizontalAlignment = Alignment.Start
                ) {
                    HeaderText("Electric Tom pasta", 25, FontWeight.Medium)

                    SpacerVertical(6)

                    Row(
                        modifier = Modifier
                            .height(37.dp)
                            .background(
                                color = LightPastelBlue, shape = RoundedCornerShape(10.dp)
                            )
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
                    tint = DeepOceanBlue)
            }

            SpacerVertical(19)

            Text(
                text = "Pasta cooked with a charger cable and\nsprinkled with questionable cheese. Make sure\nto unplug it before eating (or not, you decide).",
                modifier = Modifier,
                color = DarkGray60Alpha,
                fontSize = 17.6.sp,
                fontFamily = IBMPlexSansArabic,
                fontWeight = FontWeight.Medium
            )

            SpacerVertical(21)

            HeaderText("Details", 22, FontWeight.Medium)

            SpacerVertical(4)

            Row(
                modifier = Modifier.fillMaxWidth()
            ) {
                DetailsCard(
                    modifier = Modifier.weight(1f),
                    detailsValue = "1000 V",
                    detailsLabel = "Temperature",
                    painter = painterResource(R.drawable.temperature)
                )

                SpacerHorizontal(11)

                DetailsCard(
                    modifier = Modifier.weight(1f),
                    detailsValue = "3 sparks",
                    detailsLabel = "Time",
                    painter = painterResource(R.drawable.timer)
                )

                SpacerHorizontal(11)

                DetailsCard(
                    modifier = Modifier.weight(1f),
                    detailsValue = "1M 12K",
                    detailsLabel = "No. of deaths",
                    painter = painterResource(R.drawable.evil)
                )
            }

            SpacerVertical(21)

            HeaderText("Preparation method", 22, FontWeight.Medium)

            SpacerVertical(3)

            LazyColumn(
                modifier = Modifier.fillMaxWidth()
            ) {
                item {
                    StepContainer("1", "Put the pasta in a toaster.")
                }
                item {
                    SpacerVertical(9)
                }
                item {
                    StepContainer("2", "Pour battery juice over it.")
                }
                item {
                    SpacerVertical(9)
                }
                item {
                    StepContainer("3", "Wait for the spark to ignite.")
                }
                item {
                    SpacerVertical(9)
                }
                item {
                    StepContainer("4", "Serve with an insulating glove.")
                }
                item {
                    SpacerVertical(10)
                }
                item {
                    StepContainer("5", "Serve with an insulating glove.")
                }
                item {
                    SpacerVertical(12)
                }


            }
        }

        Image(
            painter = painterResource(R.drawable.dish),
            contentDescription = null,
            modifier = Modifier
                .align(Alignment.TopEnd)
                .padding(28.dp)
                .offset(x = (-5).dp, y = (-10).dp)
                .fillMaxWidth(0.6f)
        )
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(0.09f)
                .background(
                    color = Color.White,
                )
                .align(Alignment.BottomCenter),
            contentAlignment = Alignment.BottomEnd
        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(0.5.dp)
                    .border(
                        BorderStroke(1.dp, VeryDarkGray)
                    )
                    .align(Alignment.TopCenter)
            )
            Row(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(start = 20.dp, end = 12.dp, top = 16.dp, bottom = 0.dp)
                    .background(
                        color = DarkTealBlue,
                        shape = RoundedCornerShape(20.dp)
                    ),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "Add to cart",
                    color = White87Alpha,
                    fontSize = 19.sp,
                    fontFamily = IBMPlexSansArabic,
                    fontWeight = FontWeight.Medium

                )
                SpacerHorizontal(10)
                Box(
                    modifier = Modifier
                        .size(6.dp)
                        .background(
                            White38Alpha,
                            CircleShape
                        )
                )
                SpacerHorizontal(10)
                Column(
                    modifier = Modifier,
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally

                ) {
                    Text(
                        modifier = Modifier
                            .offset(y = (2.dp)),
                        text = "3 cheeses",
                        color = Color.White,
                        fontSize = 17.5.sp,
                        fontFamily = IBMPlexSansArabic,
                        fontWeight = FontWeight.Medium
                    )
                    Text(
                        modifier = Modifier
                            .offset(y = (-2).dp),
                        text = "5 cheeses",
                        color = Color.White.copy(alpha = 0.8f),
                        fontSize = 15.sp,
                        fontFamily = IBMPlexSansArabic,
                        fontWeight = FontWeight.Medium,
                        style = TextStyle(
                            textDecoration = TextDecoration.LineThrough
                        ),

                        )
                }
            }
        }
    }


}

@Composable
fun FoodIngredients(
    painter: Painter, text: String
) {
    Row(
        modifier = Modifier,
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Image(
            painter = painter, contentDescription = null, modifier = Modifier.size(30.dp)
        )

        SpacerHorizontal(10)

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


@Composable
fun DetailsCard(
    modifier: Modifier,
    detailsValue: String,
    detailsLabel: String,
    painter: Painter
) {
    Box(
        modifier = modifier, contentAlignment = Alignment.Center
    ) {
        Column(
            modifier = modifier
                .fillMaxWidth()
                .height(130.dp)
                .background(
                    color = LightPastelBlue, shape = RoundedCornerShape(16.dp)
                )
                .padding(10.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painter,
                contentDescription = null,
                modifier = Modifier.size(39.dp)

            )

            SpacerVertical(12)

            Text(
                text = detailsValue,
                color = DarkGray60Alpha,
                fontSize = 17.sp,
                fontFamily = IBMPlexSansArabic,
                fontWeight = FontWeight.Medium,
                modifier = Modifier
            )

            Text(
                text = detailsLabel,
                color = DarkGray37Alpha,
                fontSize = 15.sp,
                fontFamily = IBMPlexSansArabic,
                fontWeight = FontWeight.Medium,
                modifier = Modifier
            )
        }

    }
}

@Composable
fun StepContainer(
    stepNumber: String,
    stepDescription: String
) {
    Box(
        modifier = Modifier
            .fillMaxWidth(),
        contentAlignment = Alignment.Center

    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(
                    color = Color.White,
                    shape = RoundedCornerShape(
                        topStart = 20.dp,
                        bottomStart = 20.dp,
                        bottomEnd = 15.dp,
                        topEnd = 15.dp
                    )
                )
                .padding(start = 56.5.dp, top = 7.dp, end = 4.dp, bottom = 7.dp)
        ) {
            Text(
                text = stepDescription,
                color = DarkGray60Alpha,
                fontSize = 17.sp,
                fontFamily = IBMPlexSansArabic,
                fontWeight = FontWeight.Normal,
            )
        }
        Box(
            modifier = Modifier
                .size(44.4.dp)
                .background(
                    color = Color.White,
                    shape = CircleShape
                )
                .border(
                    width = 1.3.dp,
                    color = LightPastelBlue,
                    shape = CircleShape
                )
                .align(Alignment.CenterStart),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = stepNumber,
                color = DeepOceanBlueText,
                fontSize = 15.sp,
                fontFamily = IBMPlexSansArabic,
                fontWeight = FontWeight.Medium,
                modifier = Modifier
            )
        }
    }
}

@Preview(name = "Pixel 8", showBackground = true, widthDp = 448, heightDp = 998)
@Preview(showBackground = true, widthDp = 360, heightDp = 800)
@Composable
fun TomKitchenScreenPreview() {
    TomKitchenScreen()
}
