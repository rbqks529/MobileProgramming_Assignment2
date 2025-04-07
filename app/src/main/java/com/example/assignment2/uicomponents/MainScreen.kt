package com.example.assignment2.uicomponents

import android.content.res.Configuration
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun MainScreen(modifier: Modifier = Modifier) {
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
    val orientation = LocalConfiguration.current.orientation

    if (orientation == Configuration.ORIENTATION_PORTRAIT) {
        PortraitScreen(dollClothesList, checkStates, modifier)
    } else {
        LandscapeScreen(dollClothesList, checkStates, modifier)
    }
}

@Preview
@Composable
private fun MainScreenPreview() {
    MainScreen()
}