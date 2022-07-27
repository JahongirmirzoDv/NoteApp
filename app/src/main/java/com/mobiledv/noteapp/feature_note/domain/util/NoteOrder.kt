package com.mobiledv.noteapp.feature_note.domain.util

import com.mobiledv.noteapp.feature_note.domain.model.Note

sealed class NoteOrder(val orderType: OrderType){
    class Title(orderType: OrderType):NoteOrder(orderType)
    class Date(orderType: OrderType):NoteOrder(orderType)
    class Color(orderType: OrderType):NoteOrder(orderType)

    fun copy(orderType: OrderType):NoteOrder{
        return when(this){
            is Title -> Title(orderType)
            is Date -> Date(orderType)
            is Color -> Color(orderType)
        }
    }
}
