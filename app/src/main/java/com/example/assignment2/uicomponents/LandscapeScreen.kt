package com.example.assignment2.uicomponents

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun LandscapeScreen(
    dollClothesList: List<String>,
    checkStates: List<MutableState<Boolean>>,
    modifier: Modifier = Modifier
) {
    val context = LocalContext.current

    Column (
        modifier = modifier,
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "202012362 조규빈")
        Spacer(modifier = Modifier.height(20.dp))
        Row (
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Spacer(modifier = Modifier.width(width = 100.dp))
            DollClothing(dollClothesList, checkStates, context)
            TwoComponentCheckBox(dollClothesList, checkStates)
            Spacer(modifier = Modifier.width(width = 100.dp))
        }
    }
}

@Preview
@Composable
private fun LandscapeScreenPreview() {
    val dollClothesList = listOf(
        "arms",
        "ears",
        "eyebrows",
        "eyes",
        "glasses",
        "hat",
        "mouth",
        "mustache",
        "nose",
        "shoes"
    )

    // 10번 반복해서 state 10개가 저장된 리스트를 생성
    val checkStates = List(10) {
        rememberSaveable { mutableStateOf(false) }
    }

    LandscapeScreen(dollClothesList, checkStates)
}