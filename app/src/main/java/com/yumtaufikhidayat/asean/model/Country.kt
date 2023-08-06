package com.yumtaufikhidayat.asean.model

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.parcelize.Parcelize

@Entity
@Parcelize
data class Country(
    @PrimaryKey
    val countryId: Int,
    val countryName: String,
    val countryInternationalName: String,
    val countryFlag: String,
    val countryDescription: String,
    val countryHeadGovernment: String,
    val countryCapital: String,
    val countryIndependenceDay: String,
    val countryLanguage: String,
    val countryCurrency: String,
    val countryLandArea: String
): Parcelable