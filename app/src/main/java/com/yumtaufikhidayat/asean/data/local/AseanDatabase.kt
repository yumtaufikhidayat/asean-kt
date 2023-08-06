package com.yumtaufikhidayat.asean.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.yumtaufikhidayat.asean.model.Country
import com.yumtaufikhidayat.asean.model.Profile

@Database(
    entities = [
        Country::class,
        Profile::class
    ],
    version = 1,
    exportSchema = false
)
abstract class AseanDatabase : RoomDatabase() {
    abstract fun getAseanDao(): AseanDao
}