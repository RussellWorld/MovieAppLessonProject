package com.example.movieapp.room

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class HistoryEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0,
    val title: String = "",
    val releaseDate: String = "",
    val averageVote: Long = 0,
)