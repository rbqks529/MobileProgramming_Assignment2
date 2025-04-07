package com.example.assignment2.uicomponents

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.runtime.snapshots.SnapshotStateList
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.example.assignment2.model.ClothesData

@Composable
fun TwoComponentCheckBox(
    checkStatesAndClothesList: SnapshotStateList<ClothesData>,
    modifier: Modifier = Modifier
) {
    Column(
    ) {
        checkStatesAndClothesList.chunked(2).forEachIndexed { indexes, items ->
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceEvenly,
                modifier = Modifier.fillMaxWidth()
            ) {
                items.forEachIndexed { index, item ->
                    val realIndex = indexes * 2 + index

                    ImageNameWithCheckBox(checkStatesAndClothesList[realIndex].checkState, item.clothesName) {
                        checkStatesAndClothesList[realIndex] =
                            item.copy(
                                checkState = it
                            )
                    }
                }
            }
        }
    }
}