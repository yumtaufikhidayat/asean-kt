package com.yumtaufikhidayat.asean.di

import android.content.Context
import androidx.room.Room
import com.yumtaufikhidayat.asean.data.local.AseanDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {

    @Singleton
    @Provides
    fun provideDatabase(
        @ApplicationContext mContext: Context
    ) = Room.databaseBuilder(
        context = mContext,
        klass = AseanDatabase::class.java,
        name = "Asean.db"
    ).fallbackToDestructiveMigration().build()

    @Singleton
    @Provides
    fun provideDao(database: AseanDatabase) = database.getAseanDao()
}