package com.mobiledv.noteapp.feature_note.presentation.notes

import com.mobiledv.noteapp.feature_note.domain.model.Note
import com.mobiledv.noteapp.feature_note.domain.util.NoteOrder

sealed class NotesEvent{
    data class Order(val noteOrder: NoteOrder):NotesEvent()
    data class DeleteNotes(val note: Note):NotesEvent()
    object RestoreNotes:NotesEvent()
    object ToggleOrderSection:NotesEvent()
}