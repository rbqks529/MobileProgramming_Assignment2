package com.example.assignment2.uicomponents


import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun ImageWithCheckBox(
    checked: Boolean,
    clothes: String,
    modifier: Modifier = Modifier,
    onCheckedChange: (Boolean) -> Unit
) {
    Row(verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier.width(width = 150.dp)) {
        Checkbox(
            checked = checked,
            onCheckedChange = { onCheckedChange(it) }
        )
        Text(text = clothes)
    }
}

@Preview
@Composable
private fun ImageWithCheckBoxPreview() {
    var checked by rememberSaveable { mutableStateOf(false) }
    ImageWithCheckBox(checked,"arms") {
        checked = it
    }
}