package com.example.assignment2.uicomponents

import android.content.Context
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.res.painterResource
import com.example.assignment2.R

@Composable
fun DollClothing(
    dollClothesList: List<String>,
    checkStates: List<MutableState<Boolean>>,
    context: Context
) {
    Box {
        Image(
            painter = painterResource(id = R.drawable.body),
            contentDescription = null,
        )
        dollClothesList.forEachIndexed { index, item ->
            val imgR = if (checkStates[index].value) {
                context.resources.getIdentifier(
                    item,
                    "drawable",
                    context.packageName
                )
            } else {
                null
            }

            imgR?.let {
                Image(
                    painter = painterResource(id = imgR),
                    contentDescription = null
                )
            }
        }
    }
}