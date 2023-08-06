package com.yumtaufikhidayat.asean.data.source

import com.yumtaufikhidayat.asean.data.local.AseanDao
import javax.inject.Inject

class LocalDataSource @Inject constructor(
    private val dao: AseanDao
) {
    suspend fun insertCountry() = dao.insertCountry(InitialDataSource.listOfCountries())

    fun getAllCountries() = dao.getAllCountries()
}