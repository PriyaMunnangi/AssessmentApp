package com.example.assessment.screen.hiring

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.assessment.data.models.Hiring
import com.example.assessment.ui.theme.AssessmentTheme

@Composable
fun HiringNamesStateComposable(
    list: List<Hiring>
) {
    LazyColumn {
        items(list) {item ->
            HiringScreenStateLessComposable(
                item.name?: "",
                item.id
            )
        }
    }
}

@Composable
fun HiringScreenStateLessComposable(
    name: String,
    id: Int,
    modifier: Modifier = Modifier
) {

    Card(modifier = Modifier.padding(8.dp)) {
        Row(modifier = Modifier.fillMaxWidth()) {
            Row(modifier = Modifier.fillMaxWidth()
                .weight(1f)
                .padding(16.dp)) {
                Text(text = "Name: ")
                Text(text = name)
            }
            Row(modifier = Modifier.fillMaxWidth()
                .weight(1f)
                .padding(16.dp)) {
                Text(text = "ID : ")
                Text(text = "$id")
            }
        }
    }
}

@Preview
@Composable
fun HiringScreenStateLessComposablePreview() {
    AssessmentTheme {
        HiringScreenStateLessComposable(
            "Test",
            1
        )
    }
}