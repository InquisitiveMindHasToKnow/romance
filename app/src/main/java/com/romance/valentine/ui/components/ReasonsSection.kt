package com.romance.valentine.ui.components

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.core.EaseInOut
import androidx.compose.animation.core.RepeatMode
import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.rememberInfiniteTransition
import androidx.compose.animation.core.tween
import androidx.compose.animation.expandVertically
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.shrinkVertically
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.romance.valentine.data.Reason
import com.romance.valentine.ui.theme.RoseRed

private const val PAGE_SIZE = 6

private val cardGradients = listOf(
    listOf(Color(0xFFFFF0F3), Color(0xFFFCE4EC)),
    listOf(Color(0xFFFFF8F6), Color(0xFFFFE4E8)),
    listOf(Color(0xFFFCE4EC), Color(0xFFF8BBD0)),
    listOf(Color(0xFFFFE4E8), Color(0xFFFFF0F3)),
    listOf(Color(0xFFF8BBD0), Color(0xFFFFF8F6)),
    listOf(Color(0xFFFFF0F3), Color(0xFFF8BBD0)),
)

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun ReasonsSection(
    reasons: List<Reason>,
    modifier: Modifier = Modifier
) {
    val pages = reasons.chunked(PAGE_SIZE)
    val pagerState = rememberPagerState(pageCount = { pages.size })

    Column(
        modifier = modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        HorizontalPager(
            state = pagerState,
            modifier = Modifier.fillMaxWidth()
        ) { pageIndex ->
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 2.dp),
                verticalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                pages[pageIndex].forEach { reason ->
                    ReasonItem(reason = reason)
                }
            }
        }

        if (pages.size > 1) {
            Row(
                modifier = Modifier.padding(top = 12.dp),
                horizontalArrangement = Arrangement.spacedBy(6.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                repeat(pages.size) { index ->
                    Box(
                        modifier = Modifier
                            .size(if (index == pagerState.currentPage) 8.dp else 6.dp)
                            .background(
                                color = if (index == pagerState.currentPage)
                                    MaterialTheme.colorScheme.primary
                                else
                                    MaterialTheme.colorScheme.primary.copy(alpha = 0.3f),
                                shape = CircleShape
                            )
                    )
                }
            }
        }
    }
}

@Composable
private fun ReasonItem(
    reason: Reason,
    modifier: Modifier = Modifier
) {
    var expanded by remember { mutableStateOf(false) }

    val gradient = cardGradients[(reason.number - 1) % cardGradients.size]

    val infiniteTransition = rememberInfiniteTransition(label = "heartPulse")
    val heartScale by infiniteTransition.animateFloat(
        initialValue = 1f,
        targetValue = 1.15f,
        animationSpec = infiniteRepeatable(
            animation = tween(900, easing = EaseInOut),
            repeatMode = RepeatMode.Reverse
        ),
        label = "heartScale"
    )

    Card(
        onClick = { expanded = !expanded },
        modifier = modifier.fillMaxWidth(),
        shape = RoundedCornerShape(12.dp),
        colors = CardDefaults.cardColors(containerColor = Color.Transparent),
        elevation = CardDefaults.cardElevation(defaultElevation = 2.dp)
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .background(Brush.verticalGradient(gradient))
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Box(contentAlignment = Alignment.Center) {
                    Icon(
                        imageVector = Icons.Filled.Favorite,
                        contentDescription = null,
                        tint = RoseRed,
                        modifier = Modifier
                            .size(52.dp)
                            .scale(if (expanded) heartScale else 1f)
                    )
                    Text(
                        text = "${reason.number}",
                        style = MaterialTheme.typography.labelLarge,
                        fontWeight = FontWeight.Bold,
                        color = Color.White
                    )
                }

                AnimatedVisibility(
                    visible = expanded,
                    enter = fadeIn() + expandVertically(),
                    exit = fadeOut() + shrinkVertically()
                ) {
                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        Spacer(modifier = Modifier.height(12.dp))
                        Text(
                            text = reason.text,
                            style = MaterialTheme.typography.bodyLarge,
                            color = MaterialTheme.colorScheme.onSurface,
                            textAlign = TextAlign.Center
                        )
                    }
                }
            }
        }
    }
}
