package com.mobiledv.noteapp.feature_note.presentation.util

sealed class Screen(val route: String) {
    object NotesScreen : Screen("notes_scrren")
    object AddEditNoteScreen : Screen("add_edit")
}