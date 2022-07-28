package com.mobiledv.noteapp.feature_note.presentation.add_edit_note

data class NoteTExtFieldState(
    val text: String = "",
    var hint: String = "",
    var isHintVisible: Boolean = true
)
