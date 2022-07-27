package com.mobiledv.noteapp.feature_note.domain.use_case

import com.mobiledv.noteapp.feature_note.domain.model.InvalidNoteException
import com.mobiledv.noteapp.feature_note.domain.model.Note
import com.mobiledv.noteapp.feature_note.domain.repository.NoteRepository

class AddNote(
    private val repository: NoteRepository
) {
    @Throws(InvalidNoteException::class)
    suspend operator fun invoke(note: Note) {
        if (note.title.isBlank()){
            throw InvalidNoteException("empty")
        }
        if (note.content.isBlank()){
            throw InvalidNoteException("empty")
        }
        repository.insertNote(note)
    }
}