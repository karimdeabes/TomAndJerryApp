package com.example.tomandjerryapp.composables

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tomandjerryapp.R
import com.example.tomandjerryapp.ui.theme.DarkGrayishBrown
import com.example.tomandjerryapp.ui.theme.DeepOceanBlue
import com.example.tomandjerryapp.ui.theme.IBMPlexSansArabic
import com.example.tomandjerryapp.ui.theme.LightBabyBlue
import com.example.tomandjerryapp.ui.theme.SearchHintGray

@Composable
fun TomCard(
    modifier: Modifier = Modifier,
    painter: Painter,
    productName: String,
    productDetails: String,
    oldPrice: String?,
    currentPrice: String
) {
    Box(
        modifier = modifier
            .fillMaxWidth()
            .height(305.dp)
    ) {
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.BottomEnd)
                .padding(top = 35.dp),
            shape = RoundedCornerShape(18.dp),
            colors = CardDefaults.cardColors(Color.White),
        ) {
            Column(
                modifier = modifier
                    .fillMaxWidth()
                    .padding(top = 114.dp, start = 10.dp, end = 10.dp, bottom = 10.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.SpaceBetween
            ) {
                Column(
                    modifier = Modifier,
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {
                    Text(
                        text = productName,
                        modifier = Modifier,
                        color = DarkGrayishBrown,
                        fontSize = 22.sp,
                        fontFamily = IBMPlexSansArabic,
                        fontWeight = FontWeight.SemiBold,
                        textAlign = TextAlign.Center
                    )
                    Text(
                        text = productDetails,
                        color = SearchHintGray,
                        fontSize = 15.sp,
                        fontFamily = IBMPlexSansArabic,
                        fontWeight = FontWeight.Normal,
                        textAlign = TextAlign.Center
                    )
                }


                Row(
                    modifier = Modifier
                        .fillMaxWidth(),
                    verticalAlignment = Alignment.Bottom,
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {

                    Row(
                        modifier = Modifier
                            .height(37.dp)
                            .fillMaxWidth()
                            .weight(1f)
                            .background(color = LightBabyBlue, shape = RoundedCornerShape(10.dp)),
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

                        PriceText(oldPrice, currentPrice)

                    }


                    SpacerHorizontal(11)

                    Icon(
                        modifier = Modifier
                            .size(37.dp)
                            .clickable(
                                onClick = { }
                            ),
                        painter = painterResource(R.drawable.add_to_cart_container),
                        contentDescription = null,
                        tint = DeepOceanBlue
                    )
                }
            }
        }
        Image(
            painter = painter,
            contentDescription = null,
            modifier = Modifier
                .size(124.dp)
                .align(Alignment.TopCenter)
                .offset(y = 16.dp),
            contentScale = ContentScale.Fit,
        )
    }
}
