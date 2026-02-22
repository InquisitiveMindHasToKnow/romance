package com.romance.valentine.ui.screen

import android.content.Context
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.romance.valentine.data.ValentineData
import com.romance.valentine.ui.components.FunFactsSection
import com.romance.valentine.ui.components.LoveLetterSection
import com.romance.valentine.ui.components.LoveNoteCard
import com.romance.valentine.ui.components.PhotoComplimentsSection
import com.romance.valentine.ui.components.PromisesSection
import com.romance.valentine.ui.components.ReasonsSection
import com.romance.valentine.ui.components.SectionHeader
import com.romance.valentine.ui.components.SurpriseSection
import com.romance.valentine.ui.theme.BlushPink
import com.romance.valentine.ui.theme.CreamWhite

private const val PREFS_NAME = "valentine_prefs"
private const val KEY_SURPRISE_CHOICE = "surprise_choice"

@Composable
fun ValentineScreen(
    modifier: Modifier = Modifier
) {
    val context = LocalContext.current
    val prefs = remember { context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE) }
    var selectedSurpriseId by remember {
        val saved = prefs.getInt(KEY_SURPRISE_CHOICE, -1)
        mutableStateOf(if (saved == -1) null else saved)
    }

    LazyColumn(
        modifier = modifier
            .fillMaxSize()
            .background(
                Brush.verticalGradient(
                    colors = listOf(CreamWhite, BlushPink)
                )
            ),
        contentPadding = PaddingValues(
            start = 20.dp,
            end = 20.dp,
            top = 24.dp,
            bottom = 24.dp
        ),
        verticalArrangement = Arrangement.spacedBy(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        item {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(
                    text = "Happy Valentine's Day",
                    style = MaterialTheme.typography.displayLarge,
                    color = MaterialTheme.colorScheme.primary,
                    textAlign = TextAlign.Center
                )
                Spacer(modifier = Modifier.height(4.dp))
                Text(
                    text = "My Love",
                    style = MaterialTheme.typography.displayMedium,
                    color = MaterialTheme.colorScheme.onBackground,
                    textAlign = TextAlign.Center
                )
            }
        }

        item {
            SectionHeader(title = "Captured Memories")
        }
        item {
            PhotoComplimentsSection(
                compliments = ValentineData.photoCompliments
            )
        }

        item {
            SectionHeader(title = "Love Notes")
        }
        item {
            LoveNoteCard(
                loveNotes = ValentineData.loveNotes
            )
        }

        item {
            SectionHeader(title = "A Letter For You")
        }
        item {
            LoveLetterSection(
                letter = ValentineData.loveLetter
            )
        }

        item {
            SectionHeader(title = "Choose Your Surprise")
        }
        item {
            SurpriseSection(
                choices = ValentineData.surprises,
                selectedId = selectedSurpriseId,
                onChoiceSelected = { id ->
                    selectedSurpriseId = id
                    prefs.edit().putInt(KEY_SURPRISE_CHOICE, id).apply()
                }
            )
        }

        item {
            SectionHeader(title = "Reasons I Love You")
        }
        item {
            ReasonsSection(
                reasons = ValentineData.reasons
            )
        }

        item {
            SectionHeader(title = "Promises to You")
        }
        item {
            PromisesSection(
                promises = ValentineData.promises
            )
        }

        item {
            SectionHeader(title = "Did You Know?")
        }
        item {
            FunFactsSection(
                funFacts = ValentineData.funFacts
            )
        }

        item {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 16.dp, bottom = 16.dp)
            ) {
                Text(
                    text = "Made with love, just for you",
                    style = MaterialTheme.typography.bodySmall,
                    color = MaterialTheme.colorScheme.onBackground.copy(alpha = 0.5f),
                    textAlign = TextAlign.Center
                )
                Text(
                    text = "Shakespeare Raymond \u2665",
                    style = MaterialTheme.typography.bodySmall,
                    color = MaterialTheme.colorScheme.onBackground.copy(alpha = 0.5f),
                    textAlign = TextAlign.Center
                )
            }
        }
    }
}
