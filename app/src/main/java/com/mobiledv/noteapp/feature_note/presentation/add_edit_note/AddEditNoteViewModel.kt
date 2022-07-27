package com.mobiledv.noteapp.feature_note.presentation.add_edit_note

import androidx.lifecycle.ViewModel
import com.mobiledv.noteapp.feature_note.domain.use_case.NoteUseCases
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class AddEditNoteViewModel @Inject constructor(
    private val noteUseCases: NoteUseCases
) : ViewModel() {

}