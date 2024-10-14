package com.example.assessment.screen.hiring

import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.assessment.ui.theme.AssessmentTheme
import com.example.assessment.ui.theme.CardBackGround

@Composable
fun HiringItemIDListComposable(
    keys: List<Int>,
    onClick: (Int) -> Unit
) {
    LazyColumn {
        items(keys) { key ->
            Card(
                onClick ={ onClick(key) },
                modifier = Modifier.fillMaxWidth()
                    .padding(8.dp),
                colors = CardColors(
                    containerColor = CardBackGround,
                    contentColor = Color.Black,
                    disabledContainerColor = CardBackGround,
                    disabledContentColor = Color.Black
                ),
                content = {
                  Text(
                      text = "$key",
                      fontSize = 24.sp,
                      modifier = Modifier.fillMaxWidth().
                      padding(16.dp)
                  )
                }
            )
        }
    }
}

@Preview
@Composable
fun HiringItemIdListComposablePreview() {
    AssessmentTheme {
        HiringItemIDListComposable(
            keys = listOf(1,2,3,4)
        ) { }
    }
}