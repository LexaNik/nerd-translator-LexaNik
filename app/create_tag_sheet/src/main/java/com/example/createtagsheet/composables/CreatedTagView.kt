package com.example.createtagsheet.composables

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.example.createtagsheet.CreateTagSheetViewModel

@Composable
fun CreatedTagView(createTagSheetViewModel: CreateTagSheetViewModel) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
    ) {
        CreatedTagHeader()
        AdditionalHint()
        DoneButton(createTagSheetViewModel)
    }
}
