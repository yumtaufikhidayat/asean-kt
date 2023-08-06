package com.yumtaufikhidayat.asean.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.yumtaufikhidayat.asean.model.Country

@Database(
    entities = [Country::class],
    version = 1,
    exportSchema = false
)
abstract class AseanDatabase : RoomDatabase() {
    abstract fun getAseanDao(): AseanDao
}