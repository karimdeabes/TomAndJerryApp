package com.example.tomandjerryapp.tomandjerry.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
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
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tomandjerryapp.R
import com.example.tomandjerryapp.tomandjerry.composables.HeaderText
import com.example.tomandjerryapp.tomandjerry.composables.SpacerHorizontal
import com.example.tomandjerryapp.tomandjerry.composables.SpacerVertical
import com.example.tomandjerryapp.ui.theme.DarkGray37Alpha
import com.example.tomandjerryapp.ui.theme.DarkGray60Alpha
import com.example.tomandjerryapp.ui.theme.DarkTealBlue
import com.example.tomandjerryapp.ui.theme.DimBlack87Alpha
import com.example.tomandjerryapp.ui.theme.IBMPlexSansArabic
import com.example.tomandjerryapp.ui.theme.LightPastelBlue
import com.example.tomandjerryapp.ui.theme.PaleCreamYellow
import com.example.tomandjerryapp.ui.theme.PaleGreen
import com.example.tomandjerryapp.ui.theme.PalePink
import com.example.tomandjerryapp.ui.theme.White80PercentOpacity
import com.example.tomandjerryapp.ui.theme.White87Alpha

@Composable
fun TomAccountScreen() {

    Box(
        modifier = Modifier.fillMaxSize()
    ) {

        Box(
            modifier = Modifier
                .fillMaxSize()
                .align(Alignment.TopCenter)
                .background(
                    color = DarkTealBlue
                ),
            contentAlignment = Alignment.TopStart
        ) {
            Image(
                painter = painterResource(R.drawable.background_shape),
                contentDescription = null,
                modifier = Modifier
                    .fillMaxWidth(1f)
                    .fillMaxHeight(0.185f)
                    .rotate(
                        1f
                    ),
                alignment = Alignment.TopCenter,
                contentScale = ContentScale.FillBounds
            )
            Image(
                painter = painterResource(R.drawable.background_shape_1),
                contentDescription = null,
                modifier = Modifier
                    .fillMaxWidth(1f)
                    .fillMaxHeight(0.28f)
                    .offset(x = 50.dp),
                alignment = Alignment.TopEnd,
                contentScale = ContentScale.FillBounds
            )

            ProfileInfo()

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
                .align(Alignment.BottomCenter)
        ) {

            SpacerVertical(12)

            StatsItems(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp)
            )

            LazyColumn(
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                item {

                    SpacerVertical(28)
                }

                item {

                    SettingSection1(
                        modifier = Modifier
                            .padding(horizontal = 16.dp)
                    )
                }

                item {

                    HorizontalDivider(
                        thickness = 0.7.dp,
                        modifier = Modifier
                            .fillMaxWidth()
                    )
                }

                item {

                    SettingSection2(
                        modifier = Modifier
                            .padding(horizontal = 16.dp)
                    )
                }

                item {
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(40.dp)
                            .align(Alignment.End),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(
                            text = "v.TomBeta",
                            fontSize = 15.sp,
                            fontFamily = IBMPlexSansArabic,
                            fontWeight = FontWeight.Normal,
                            color = DarkGray60Alpha
                        )
                    }
                }
            }
        }
    }
}

@Composable
fun ProfileInfo() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(0.21f),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top
    ) {
        Image(
            modifier = Modifier
                .size(97.dp)
                .padding(top = 18.dp),
            painter = painterResource(R.drawable.img),
            contentDescription = null,
        )

        Text(
            text = "Tom",
            modifier = Modifier
                .padding(top = 3.dp),
            color = Color.White,
            fontSize = 22.sp,
            fontFamily = IBMPlexSansArabic,
            fontWeight = FontWeight.Medium

        )

        Text(
            text = "specializes in failure!",
            modifier = Modifier
                .padding(bottom = 6.dp),
            color = White80PercentOpacity,
            fontSize = 14.5.sp,
            fontFamily = IBMPlexSansArabic,
            fontWeight = FontWeight.Normal

        )

        Row(
            modifier = Modifier
                .background(
                    color = Color.White.copy(alpha = 0.12f),
                    shape = RoundedCornerShape(60.dp)
                )
                .padding(vertical = 5.7.dp, horizontal = 16.dp)
                .wrapContentSize(),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "Edit foolishness",
                modifier = Modifier,
                color = Color.White,
                fontSize = 12.4.sp,
                fontFamily = IBMPlexSansArabic,
                fontWeight = FontWeight.Medium
            )
        }
    }
}

@Composable
fun StatsItems(modifier: Modifier = Modifier) {
    Row(
        modifier = modifier,
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center
    ) {
        StatCard(
            painter = painterResource(R.drawable.stat_icon_container_3),
            color = LightPastelBlue,
            modifier = Modifier
                .weight(1f),
            stateValue = "2M 12K",
            stateLabel = "No. of quarrels"
        )
        SpacerHorizontal(10)
        StatCard(
            painter = painterResource(R.drawable.stat_icon_container),
            color = PaleGreen,
            modifier = Modifier
                .weight(1f),
            stateValue = "+500 h",
            stateLabel = "Chase time"
        )
    }

    SpacerVertical(12)

    Row(
        modifier = modifier,
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center
    ) {
        StatCard(
            painter = painterResource(R.drawable.stat_icon_container_1),
            color = PalePink,
            modifier = Modifier
                .weight(1f),
            stateValue = "2M 12K",
            stateLabel = "Hunting times"
        )
        SpacerHorizontal(10)
        StatCard(
            painter = painterResource(R.drawable.stat_icon_container_2),
            color = PaleCreamYellow,
            modifier = Modifier
                .weight(1f),
            stateValue = "3M 7K",
            stateLabel = "Heartbroken"
        )
    }
}


@Composable
fun StatCard(
    modifier: Modifier,
    color: Color,
    painter: Painter,
    stateValue: String,
    stateLabel: String
) {
    Row(
        modifier = modifier
            .background(
                color = color,
                shape = RoundedCornerShape(16.dp)
            )
            .fillMaxWidth()
            .height(71.dp)
            .padding(start = 14.dp),
        horizontalArrangement = Arrangement.Start,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            modifier = Modifier
                .align(Alignment.CenterVertically)
                .size(52.dp),
            painter = painter,
            contentDescription = null

        )

        Column(
            modifier = Modifier
                .padding(vertical = 8.dp, horizontal = 10.dp),
            horizontalAlignment = Alignment.Start,
            verticalArrangement = Arrangement.Center
        ) {

            Text(
                text = stateValue,
                modifier = Modifier,
                color = DarkGray60Alpha,
                fontSize = 20.sp,
                fontFamily = IBMPlexSansArabic,
                fontWeight = FontWeight.SemiBold
            )
            Text(
                text = stateLabel,
                modifier = Modifier,
                color = DarkGray37Alpha,
                fontSize = 15.sp,
                fontFamily = IBMPlexSansArabic,
                fontWeight = FontWeight.Medium
            )
        }

    }
}

@Composable
fun SettingSection1(
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxWidth()
    ) {
        HeaderText(
            "Tom settings",
            25,
            FontWeight.Bold,
            modifier = Modifier
                .padding(bottom = 12.dp)
        )

        SettingItem(
            painter = painterResource(R.drawable.settings_icon_container),
            settingText = "Change sleeping place"
        )
        SettingItem(
            painter = painterResource(R.drawable.settings_icon_container_1),
            settingText = "Meow settings"
        )
        SettingItem(
            painter = painterResource(R.drawable.settings_icon_container_2),
            settingText = "Password to open the fridge"
        )

    }
}

@Composable
fun SettingSection2(
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxWidth()
    ) {
        HeaderText(
            "His favorite foods",
            25,
            FontWeight.Bold,
            modifier = Modifier
                .padding(top = 12.5.dp, bottom = 12.dp)
        )

        SettingItem(
            painter = painterResource(R.drawable.favorite_food_icon),
            settingText = "Mouses"
        )
        SettingItem(
            painter = painterResource(R.drawable.favorite_food_icon_1),
            settingText = "Last stolen meal"
        )
        SettingItem(
            painter = painterResource(R.drawable.favorite_food_icon_2),
            settingText = "Change sleep mood"
        )

    }
}

@Composable
fun SettingItem(
    painter: Painter,
    settingText: String
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(bottom = 15.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Start
    ) {
        Image(
            painter = painter,
            contentDescription = null,
            modifier = Modifier
                .size(48.4.dp)
        )

        Text(
            text = settingText,
            modifier = Modifier
                .padding(start = 10.dp),
            color = DimBlack87Alpha,
            fontSize = 20.5.sp,
            fontFamily = IBMPlexSansArabic,
            fontWeight = FontWeight.Medium
        )
    }
}

@Preview(name = "Pixel 8", showBackground = true, widthDp = 448, heightDp = 998)
@Composable
fun TomAccountScreenPreview() {
    TomAccountScreen()
}