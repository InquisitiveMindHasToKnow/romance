package com.romance.valentine.ui.components

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.expandVertically
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.shrinkVertically
import androidx.compose.foundation.BorderStroke
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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.romance.valentine.data.SurpriseChoice
import com.romance.valentine.ui.theme.RoseRed
import com.romance.valentine.ui.theme.SoftPink

@Composable
fun SurpriseSection(
    choices: List<SurpriseChoice>,
    selectedId: Int?,
    onChoiceSelected: (Int) -> Unit,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        if (selectedId == null) {
            Text(
                text = "Pick one surprise — choose wisely, you only get one!",
                style = MaterialTheme.typography.bodyMedium,
                color = MaterialTheme.colorScheme.onBackground.copy(alpha = 0.7f),
                textAlign = TextAlign.Center,
                modifier = Modifier.padding(bottom = 12.dp)
            )
        }

        val ordinals = listOf("One", "Two", "Three", "Four", "Five")

        AnimatedVisibility(
            visible = selectedId == null,
            enter = fadeIn(),
            exit = fadeOut()
        ) {
            SurpriseDecorations(topRow = true)
        }

        Column(
            verticalArrangement = Arrangement.spacedBy(12.dp),
            modifier = Modifier.fillMaxWidth()
        ) {
            choices.forEachIndexed { index, choice ->
                val isSelected = selectedId == choice.id
                val isLocked = selectedId != null && !isSelected
                val label = "Surprise ${ordinals.getOrElse(index) { "${index + 1}" }}"

                SurpriseCard(
                    choice = choice,
                    label = label,
                    isSelected = isSelected,
                    isLocked = isLocked,
                    onClick = {
                        if (selectedId == null) {
                            onChoiceSelected(choice.id)
                        }
                    }
                )
            }
        }

        AnimatedVisibility(
            visible = selectedId == null,
            enter = fadeIn(),
            exit = fadeOut()
        ) {
            SurpriseDecorations(topRow = false)
        }

        if (selectedId != null) {
            Spacer(modifier = Modifier.height(8.dp))
            Text(
                text = "You chose your surprise!",
                style = MaterialTheme.typography.bodySmall,
                color = MaterialTheme.colorScheme.primary,
                textAlign = TextAlign.Center
            )
        }
    }
}

@Composable
private fun SurpriseDecorations(topRow: Boolean) {
    // Two rows of emojis — top row and bottom row use different orderings for variety
    val topEmojis = listOf("🎁", "✨", "🎀", "🎊", "🎁", "✨")
    val bottomEmojis = listOf("✨", "🎉", "🎁", "🎀", "🎊", "🎁")
    val emojis = if (topRow) topEmojis else bottomEmojis
    val topPaddings = listOf(4, 12, 0, 8, 14, 2)
    val bottomPaddings = listOf(14, 2, 10, 0, 6, 12)
    val paddings = if (topRow) topPaddings else bottomPaddings

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 6.dp),
        horizontalArrangement = Arrangement.SpaceEvenly,
        verticalAlignment = Alignment.CenterVertically
    ) {
        emojis.forEachIndexed { index, emoji ->
            Text(
                text = emoji,
                fontSize = if (index % 2 == 0) 26.sp else 20.sp,
                modifier = Modifier.padding(top = paddings[index].dp)
            )
        }
    }
}

@Composable
private fun SurpriseCard(
    choice: SurpriseChoice,
    label: String,
    isSelected: Boolean,
    isLocked: Boolean,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Box(modifier = modifier.fillMaxWidth()) {
        Card(
            onClick = onClick,
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(16.dp),
            colors = CardDefaults.cardColors(
                containerColor = if (isSelected)
                    MaterialTheme.colorScheme.primaryContainer
                else
                    MaterialTheme.colorScheme.surface
            ),
            border = if (isSelected) BorderStroke(2.dp, RoseRed) else BorderStroke(1.dp, SoftPink),
            elevation = CardDefaults.cardElevation(
                defaultElevation = if (isSelected) 6.dp else 2.dp
            )
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(20.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = label,
                    style = MaterialTheme.typography.titleMedium,
                    color = if (isSelected)
                        MaterialTheme.colorScheme.onPrimaryContainer
                    else
                        MaterialTheme.colorScheme.onSurface
                )
                AnimatedVisibility(
                    visible = isSelected,
                    enter = fadeIn() + expandVertically(),
                    exit = fadeOut() + shrinkVertically()
                ) {
                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        Spacer(modifier = Modifier.height(12.dp))
                        Text(
                            text = choice.emoji,
                            fontSize = 36.sp
                        )
                        Spacer(modifier = Modifier.height(8.dp))
                        Text(
                            text = choice.title,
                            style = MaterialTheme.typography.titleSmall,
                            color = MaterialTheme.colorScheme.onPrimaryContainer
                        )
                        Spacer(modifier = Modifier.height(4.dp))
                        Text(
                            text = choice.description,
                            style = MaterialTheme.typography.bodyMedium,
                            textAlign = TextAlign.Center,
                            color = MaterialTheme.colorScheme.onPrimaryContainer.copy(alpha = 0.8f)
                        )
                    }
                }
            }
        }

        if (isLocked) {
            Box(
                modifier = Modifier
                    .matchParentSize()
                    .clip(RoundedCornerShape(16.dp))
                    .background(MaterialTheme.colorScheme.surface.copy(alpha = 0.75f)),
                contentAlignment = Alignment.Center
            ) {
                Icon(
                    imageVector = Icons.Filled.Lock,
                    contentDescription = "Locked",
                    tint = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.5f),
                    modifier = Modifier.size(32.dp)
                )
            }
        }
    }
}
