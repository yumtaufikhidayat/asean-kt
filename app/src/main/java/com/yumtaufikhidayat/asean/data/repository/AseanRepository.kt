package com.yumtaufikhidayat.asean.data.repository

import com.yumtaufikhidayat.asean.data.source.LocalDataSource
import javax.inject.Inject

class AseanRepository @Inject constructor(
    private val localDataSource: LocalDataSource
) {
    suspend fun insertCountry() = localDataSource.insertCountry()

    fun getAllCountries() = localDataSource.getAllCountries()
}