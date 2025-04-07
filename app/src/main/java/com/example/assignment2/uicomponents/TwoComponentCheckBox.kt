package com.example.assignment2.uicomponents

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
fun TwoComponentCheckBox(
    dollClothesList: List<String>,
    checkStates: List<MutableState<Boolean>>
) {
    Column(
    ) {
        dollClothesList.chunked(2).forEachIndexed { indexes, items ->
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceEvenly,
                modifier = Modifier.fillMaxWidth()
            ) {
                items.forEachIndexed { index, item ->
                    val realIndex = indexes * 2 + index

                    ImageWithCheckBox(checkStates[realIndex].value, item) {
                        checkStates[realIndex].value = it
                    }
                }
            }
        }
    }
}