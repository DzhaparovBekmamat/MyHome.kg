package com.template.myhomekg.domain.repositories

import androidx.lifecycle.MutableLiveData
import com.template.myhomekg.domain.utils.Resource
import com.template.myhomekg.data.model.Door
import com.template.myhomekg.domain.models.DoorModel
import kotlinx.coroutines.flow.Flow

interface DoorRepository {
    suspend fun getAllDoors(): Flow<Resource<List<DoorModel>>>

    fun getResult(): MutableLiveData<List<Door>>

    suspend fun insertDoor(door: DoorModel): Unit

    suspend fun updateDoor(door: DoorModel): Unit

    suspend fun deleteDoor(door: DoorModel): Unit
}