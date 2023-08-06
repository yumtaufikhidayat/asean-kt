package com.yumtaufikhidayat.asean.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Profile(
    @PrimaryKey
    val profileName: String,
    val profileJob: String,
    val profileDesc: String,
    val profileEmail: String,
    val profileOffice: String
)