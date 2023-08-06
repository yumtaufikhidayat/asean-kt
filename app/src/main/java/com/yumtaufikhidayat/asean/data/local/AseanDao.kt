package com.yumtaufikhidayat.asean.data.local

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.yumtaufikhidayat.asean.model.Country
import com.yumtaufikhidayat.asean.model.Profile
import kotlinx.coroutines.flow.Flow

@Dao
interface AseanDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertCountry(listOfCountries: List<Country>)

    @Query("SELECT * FROM country")
    fun getAllCountries(): Flow<List<Country>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertProfile(profile: Profile)

    @Query("SELECT * FROM profile")
    fun getProfile(): Flow<Profile>
}