package com.example.tomandjerryapp.tomandjerry.screens

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
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tomandjerryapp.R
import com.example.tomandjerryapp.tomandjerry.composables.SpacerHorizontal
import com.example.tomandjerryapp.tomandjerry.composables.SpacerVertical
import com.example.tomandjerryapp.tomandjerry.composables.TomCard
import com.example.tomandjerryapp.ui.theme.DarkBlue
import com.example.tomandjerryapp.ui.theme.DeepOceanBlue
import com.example.tomandjerryapp.ui.theme.IBMPlexSansArabic
import com.example.tomandjerryapp.ui.theme.LightBlue
import com.example.tomandjerryapp.ui.theme.ScreenBackground
import com.example.tomandjerryapp.ui.theme.SearchHintGray
import com.example.tomandjerryapp.ui.theme.UserNameBlack
import com.example.tomandjerryapp.ui.theme.UserNameGray
import com.example.tomandjerryapp.ui.theme.White80PercentOpacity

@Composable
fun JerryStoreScreen(
) {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(color = ScreenBackground)
            .padding(horizontal = 16.dp, vertical = 6.dp),
    ) {
        item {
            JerryStoreHeader()
        }

        item {
            SpacerVertical(19)
        }

        item {
            SearchBar()
        }

        item {
            SpacerVertical(10)
        }

        item {
            PromotionBanner(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(143.dp)
            )
        }

        item {
            SpacerVertical(16)
        }

        item {
            SectionHeader()
        }

        item {
            SpacerVertical(5)
        }

        item {
            TomItems(modifier = Modifier.fillMaxWidth())
        }
    }
}


@Composable
fun JerryStoreHeader() {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Row {
            Image(
                painter = painterResource(id = R.drawable.profile_image),
                contentDescription = "Profile Image",
                modifier = Modifier.size(60.dp)
            )

            SpacerHorizontal(10)

            Column(
                modifier = Modifier
                    .padding(vertical = 6.dp),
                verticalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    text = "Hi, Jerry \uD83D\uDC4B\uD83C\uDFFB",
                    modifier = Modifier,
                    color = UserNameBlack,
                    fontSize = 17.sp,
                    fontFamily = IBMPlexSansArabic,
                    fontWeight = FontWeight.Medium

                )


                Text(
                    text = "Which Tom do you want to buy?",
                    modifier = Modifier,
                    color = UserNameGray,
                    fontSize = 15.sp,
                    fontFamily = IBMPlexSansArabic,
                    fontWeight = FontWeight.Normal

                )
            }
        }
        Image(
            painter = painterResource(id = R.drawable.user_avatar),
            contentDescription = "Notifications",
            modifier = Modifier
                .size(55.dp)
                .clickable { }
        )
    }
}

@Composable
fun SearchBar() {
    Row(
        modifier = Modifier
            .height(60.dp)
            .fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        TextField(
            value = "", onValueChange = {}, modifier = Modifier.weight(1f), colors = TextFieldDefaults.colors(
                focusedIndicatorColor = Color.Transparent,
                focusedContainerColor = Color.White,
                unfocusedIndicatorColor = Color.Transparent,
                unfocusedContainerColor = Color.White
            ), singleLine = true, leadingIcon = {
                Image(
                    painter = painterResource(R.drawable.search_normal),
                    contentDescription = "Filter Icon",
                    modifier = Modifier.size(30.dp)
                )
            }, placeholder = {
                Text(
                    text = "Search about tom ...",
                    color = SearchHintGray,
                    fontFamily = IBMPlexSansArabic,
                    fontWeight = FontWeight.Normal,
                    fontSize = 18.sp
                )
            }, shape = RoundedCornerShape(12.dp)
        )

        SpacerHorizontal(10)

        Image(
            painter = painterResource(R.drawable.button),
            contentDescription = "Search Button",
            modifier = Modifier
                .clickable { }
                .size(60.dp),
            contentScale = ContentScale.FillBounds)

    }
}

@Composable
fun PromotionBanner(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .fillMaxWidth()
            .offset(y = (-9).dp)
    ) {
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically,
            modifier = modifier
                .padding(top = 27.dp)
                .background(
                    shape = RoundedCornerShape(20.dp),
                    brush = Brush.linearGradient(
                        colors = listOf(DarkBlue, LightBlue),
                        start = Offset(0f, 0f),
                        end = Offset(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY)
                    )
                ),
        ) {
            Column(
                verticalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier.padding(start = 15.dp),
            ) {
                Text(
                    text = "Buy 1 Tom and get 2 for free",
                    modifier = Modifier,
                    color = Color.White,
                    fontSize = 20.sp,
                    fontFamily = IBMPlexSansArabic,
                    fontWeight = FontWeight.SemiBold

                )
                SpacerVertical(10)
                Text(
                    text = "Adopt Tom! (Free Fail-Free\nGuarantee)",
                    modifier = Modifier,
                    color = White80PercentOpacity,
                    fontSize = 15.sp,
                    fontFamily = IBMPlexSansArabic,
                    fontWeight = FontWeight.Normal
                )
            }
        }
        Image(
            painter = painterResource(R.drawable.ellipse_1),
            contentDescription = null,
            modifier = Modifier
                .size(width = 124.7.dp, height = 142.4.dp)
                .offset(
                    x = (6).dp, y = (25).dp
                )
                .align(Alignment.BottomEnd),
            contentScale = ContentScale.Crop
        )
        Image(
            painter = painterResource(R.drawable.ellipse_2),
            contentDescription = null,
            modifier = Modifier
                .size(width = 124.7.dp, height = 140.4.dp)
                .offset(
                    x = (16).dp, y = (25).dp
                )
                .align(Alignment.BottomEnd),
            contentScale = ContentScale.Crop
        )
        Image(
            painter = painterResource(R.drawable.tom_banner_1),
            contentDescription = null,
            modifier = Modifier
                .size(width = 143.5.dp, height = 134.4.dp)
                .offset(x = (-1.2).dp, y = (0).dp)
                .align(Alignment.BottomEnd),
            contentScale = ContentScale.Crop,
        )
    }
}

@Composable
fun SectionHeader() {
    Row(
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .fillMaxWidth()
            .clickable { }
    ) {
        Text(
            text = "Cheap tom section",
            modifier = Modifier,
            color = UserNameBlack,
            fontSize = 25.sp,
            fontFamily = IBMPlexSansArabic,
            fontWeight = FontWeight.SemiBold
        )

        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Text(
                text = "View all",
                modifier = Modifier,
                color = DeepOceanBlue,
                fontFamily = IBMPlexSansArabic,
                fontWeight = FontWeight.Medium,
                fontSize = 15.sp
            )

            SpacerHorizontal(6)

            Image(
                painter = painterResource(R.drawable.arrow_right_04),
                contentDescription = null,
                modifier = Modifier.size(15.dp)
            )
        }
    }
}

@Composable
fun TomItems(modifier: Modifier = Modifier) {
    Row(
        modifier = modifier,
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center
    ) {
        TomCard(
            modifier = Modifier.weight(1f),
            painter = painterResource(R.drawable.tom_card_1),
            productName = stringResource(R.string.sport_tom),
            productDetails = stringResource(R.string.he_runs_1_meter_trips_over_his_boot),
            oldPrice = "5",
            currentPrice = "3"
        )
        SpacerHorizontal(10)
        TomCard(
            modifier = Modifier.weight(1f),
            painterResource(R.drawable.tom_card_2),
            productName = "Tom the lover",
            productDetails = stringResource(R.string.he_loves_one_sidedly_and_is_beaten_by_the_other_side),
            oldPrice = null,
            currentPrice = "5"
        )

    }


    Row(
        modifier = modifier,
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center
    ) {
        TomCard(
            modifier = Modifier.weight(1f),
            painter = painterResource(R.drawable.tom_card_3),
            productName = "Tom the bomb",
            productDetails = "He blows himself up before Jerry can catch him.",
            oldPrice = null,
            currentPrice = "10"
        )
        SpacerHorizontal(10)
        TomCard(
            modifier = Modifier.weight(1f),
            painterResource(R.drawable.tom_card_4),
            productName = stringResource(R.string.spy_tom),
            productDetails = "Disguises itself as a table.",
            oldPrice = null,
            currentPrice = "12"
        )
    }

    Row(
        modifier = modifier,
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center
    ) {
        TomCard(
            modifier = Modifier.weight(1f),
            painter = painterResource(R.drawable.tom_card_5),
            productName = "Frozen Tom",
            productDetails = "He was chasing Jerry, he froze after the first look",
            oldPrice = null,
            currentPrice = "10"
        )
        SpacerHorizontal(10)
        TomCard(
            modifier = Modifier.weight(1f),
            painterResource(R.drawable.tom_card_6),
            productName = "Sleeping Tom",
            productDetails = "He doesn't chase anyone, he just snores in stereo.\n",
            oldPrice = null,
            currentPrice = "10"
        )

    }
}


@Preview(name = "Pixel 8", showBackground = true, widthDp = 448, heightDp = 998)
@Preview(showBackground = true, widthDp = 360, heightDp = 800)
@Composable
fun JerryStorePreview() {
    JerryStoreScreen()
}