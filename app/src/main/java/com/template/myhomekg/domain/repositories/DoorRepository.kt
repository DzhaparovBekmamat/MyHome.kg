package com.template.myhomekg.domain.repositories

import com.template.myhomekg.domain.models.DoorModel
import com.template.myhomekg.domain.utils.Resource
import kotlinx.coroutines.flow.Flow

interface DoorRepository {

    suspend fun getAllDoors(): Flow<Resource<List<DoorModel>>>

    suspend fun getResult(): Flow<List<DoorModel>>

    suspend fun insertDoor(door: DoorModel)

    suspend fun updateDoor(door: DoorModel)

    suspend fun deleteDoor(door: DoorModel)
}