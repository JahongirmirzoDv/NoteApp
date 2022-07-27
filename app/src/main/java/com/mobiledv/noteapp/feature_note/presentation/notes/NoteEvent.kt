package com.mobiledv.noteapp.feature_note.presentation.notes

import com.mobiledv.noteapp.feature_note.domain.model.Note
import com.mobiledv.noteapp.feature_note.domain.use_case.DeleteNote
import com.mobiledv.noteapp.feature_note.domain.util.NoteOrder

sealed class NoteEvent{
    data class Order(val noteOrder: NoteOrder):NoteEvent()
    data class DeleteNote(val note: Note):NoteEvent()
    object RestoreNote:NoteEvent()
    object ToggleOrderSection:NoteEvent()
}