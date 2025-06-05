package com.example.tomandjerryapp.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.tomandjerryapp.R

// Set of Material typography styles to start with
val Typography = Typography(
    bodyLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp
    )
)

val IBMPlexSansArabic = FontFamily(
    Font(R.font.ibm_plex_sans_arabic_medium, FontWeight.Medium),
    Font(R.font.ibm_plex_sans_arabic_regular, FontWeight.Normal),
    Font(R.font.ibm_plex_sans_arabic_thin, FontWeight.Thin),
    Font(R.font.ibm_plex_sans_arabic_semi_bold, FontWeight.SemiBold),
    Font(R.font.ibm_plex_sans_arabic_bold, FontWeight.Bold)
)

val Inter = FontFamily(
    Font(R.font.inter_24pt_regular, FontWeight.Normal),
    Font(R.font.inter_24pt_medium, FontWeight.Medium),
    Font(R.font.inter_24pt_bold, FontWeight.Bold),
    Font(R.font.inter_24pt_semi_bold, FontWeight.SemiBold)
)