package com.template.myhomekg.data.repository

import com.template.myhomekg.data.retrofit.RetrofitService
import com.template.myhomekg.data.utils.convertToDoor
import com.template.myhomekg.data.utils.mapToDoorModel
import com.template.myhomekg.domain.models.DoorModel
import com.template.myhomekg.domain.repositories.DoorRepository
import com.template.myhomekg.domain.utils.Resource
import com.template.myhomekg.data.db.dao.DoorDao
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class DoorRepositoryImpl @Inject constructor(
    private val doorDao: DoorDao
) : DoorRepository {

    override suspend fun getAllDoors(): Flow<Resource<List<DoorModel>>> {
        return flow {
            emit(Resource.Loading())
            try {
                val data = doorDao.getAllDoors().mapToDoorModel()
                emit(Resource.Success(data))
            } catch (e: Exception) {
                emit(Resource.Error(e.message ?: "Message is empty"))
            }
        }
    }

    override suspend fun getResult(): Flow<List<DoorModel>> {
        return flow {
            val data = RetrofitService.apiService.getDoors().body()?.data?.doors
            if (data != null) {
                emit(data)
            }
        }
    }

    override suspend fun insertDoor(door: DoorModel) {
        doorDao.insertDoor(door.convertToDoor())
    }

    override suspend fun updateDoor(door: DoorModel) {
        doorDao.updateDoor(door.convertToDoor())
    }

    override suspend fun deleteDoor(door: DoorModel) {
        doorDao.deleteDoor(door.convertToDoor())
    }
}