package com.template.myhomekg.domain.repositories

import com.template.myhomekg.domain.models.DoorModel

interface DoorRepository {
    suspend fun getAllDoors(): List<DoorModel>
    suspend fun insertDoor(door: DoorModel)
    suspend fun updateDoor(door: DoorModel)
    suspend fun deleteDoor(door: DoorModel)
}