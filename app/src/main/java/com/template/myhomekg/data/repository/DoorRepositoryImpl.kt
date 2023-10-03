package com.template.myhomekg.data.repository

import androidx.lifecycle.MutableLiveData
import com.template.myhomekg.domain.utils.Resource
import com.template.myhomekg.data.db.dao.DoorDao
import com.template.myhomekg.data.model.Door
import com.template.myhomekg.domain.models.DoorModel
import com.template.myhomekg.domain.repositories.DoorRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class DoorRepositoryImpl @Inject constructor(
    private val doorDao: DoorDao
) : DoorRepository {

    override suspend fun getAllDoors(): Flow<Resource<List<DoorModel>>> {
        TODO("Not yet implemented")
    }

    override fun getResult(): MutableLiveData<List<Door>> {
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