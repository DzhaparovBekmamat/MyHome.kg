package com.template.myhomekg.domain.di

import android.content.Context
import androidx.room.Room
import com.template.myhomekg.data.db.dao.CamerasDao
import com.template.myhomekg.data.db.dao.DoorsDao
import com.template.myhomekg.data.db.database.HouseDatabase
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@dagger.Module
@InstallIn(SingletonComponent::class)
object DIModule {
    @Singleton
    @Provides
    fun provideRoomDatabase(@ApplicationContext context: Context): HouseDatabase {
        return Room.databaseBuilder(
            context, HouseDatabase::class.java, "house_database"
        ).build()
    }

    @Provides
    fun provideCameraDao(roomDatabase: HouseDatabase): CamerasDao {
        return roomDatabase.getCameraDao()
    }

    @Provides
    fun provideDoorDao(roomDatabase: HouseDatabase): DoorsDao {
        return roomDatabase.getDoorDao()
    }
}
