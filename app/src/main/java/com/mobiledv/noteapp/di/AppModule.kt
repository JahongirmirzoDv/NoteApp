package com.mobiledv.noteapp.di

import android.app.Application
import android.os.Looper
import androidx.room.Room
import com.mobiledv.noteapp.feature_note.data.data_source.NoteDatabase
import com.mobiledv.noteapp.feature_note.data.repository.NoteRepositoryImpl
import com.mobiledv.noteapp.feature_note.domain.repository.NoteRepository
import com.mobiledv.noteapp.feature_note.domain.use_case.*
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideNoteDatabase(app: Application): NoteDatabase {
        return Room.databaseBuilder(
            app,
            NoteDatabase::class.java,
            "Database"
        )
            .allowMainThreadQueries()
            .build()
    }

    @Provides
    @Singleton
    fun provideNoteRepository(db: NoteDatabase): NoteRepository {
        return NoteRepositoryImpl(db.noteDao)
    }

    @Provides
    fun provideNoteUseCases(repository: NoteRepository):NoteUseCases{
        require(Looper.myLooper() != Looper.getMainLooper()){
            "MAin thread"
        }

        return NoteUseCases(
            getNotes = GetNotes(repository),
            deleteNote = DeleteNote(repository),
            addNote = AddNote(repository),
            getNote = GetNote(repository)
        )
    }
}