package com.template.myhomekg.data.repository

import com.template.myhomekg.domain.models.DoorModel
import com.template.myhomekg.domain.repositories.DoorRepository

class DoorsRepository : DoorRepository {
    override suspend fun getAllDoors(): List<DoorModel> {
        TODO("Not yet implemented")
    }

    override suspend fun insertDoor(door: DoorModel) {
        TODO("Not yet implemented")
    }

    override suspend fun updateDoor(door: DoorModel) {
        TODO("Not yet implemented")
    }

    override suspend fun deleteDoor(door: DoorModel) {
        TODO("Not yet implemented")
    }
}