package com.template.myhomekg.data.db.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.template.myhomekg.data.db.dao.CameraDao
import com.template.myhomekg.data.db.dao.DoorDao
import com.template.myhomekg.data.model.Camera
import com.template.myhomekg.data.model.Door

@Database(entities = [Camera::class, Door::class], version = 1, exportSchema = true)
abstract class HouseDatabase : RoomDatabase() {
    abstract fun getCameraDao(): CameraDao
    abstract fun getDoorDao(): DoorDao
}