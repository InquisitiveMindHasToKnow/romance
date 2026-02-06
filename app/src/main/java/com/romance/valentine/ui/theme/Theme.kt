package com.romance.valentine.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable

private val ValentineColorScheme = lightColorScheme(
    primary = RoseRed,
    onPrimary = TextOnPrimary,
    primaryContainer = SoftPink,
    onPrimaryContainer = DeepRose,
    secondary = CoralRose,
    onSecondary = TextOnPrimary,
    secondaryContainer = PeachCream,
    onSecondaryContainer = TextDark,
    tertiary = WarmGold,
    onTertiary = TextDark,
    background = CreamWhite,
    onBackground = TextDark,
    surface = CardWhite,
    onSurface = TextDark,
    surfaceVariant = SoftRoseSurface,
    onSurfaceVariant = TextMedium
)

@Composable
fun ValentineTheme(
    content: @Composable () -> Unit
) {
    MaterialTheme(
        colorScheme = ValentineColorScheme,
        typography = Typography,
        content = content
    )
}
