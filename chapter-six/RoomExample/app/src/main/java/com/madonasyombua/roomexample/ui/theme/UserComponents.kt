package com.madonasyombua.roomexample.ui.theme

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp


@Composable
fun UserInfoTextField(
    text: String,
    onFieldChange: (String) -> Unit,
    label: @Composable (() -> Unit)? = null
) {
    TextField(
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 10.dp, top = 8.dp, end = 10.dp),
        value = text,
        onValueChange = {
            onFieldChange(it)
        },
        label = label
    )

}

@Composable
fun SaveButton(onClick: () -> Unit, text: String) {
    Button(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 10.dp, start = 10.dp, end = 10.dp),
        onClick = onClick
    ) {
        Text(
            text = text
        )
    }
}
