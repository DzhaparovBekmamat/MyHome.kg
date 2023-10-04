package com.template.myhomekg.data.repository

import com.template.myhomekg.data.retrofit.RetrofitService
import com.template.myhomekg.data.utils.convertToCamera
import com.template.myhomekg.data.utils.mapToCameraModel
import com.template.myhomekg.domain.models.CameraModel
import com.template.myhomekg.domain.repositories.CameraRepository
import com.template.myhomekg.domain.utils.Resource
import com.template.myhomekg.data.db.dao.CameraDao
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class CameraRepositoryImpl @Inject constructor(
    private val cameraDao: CameraDao
) : CameraRepository {

    override suspend fun getAllCameras(): Flow<Resource<List<CameraModel>>> {
        return flow {
            emit(Resource.Loading())
            try {
                val data = cameraDao.getAllCameras().mapToCameraModel()
                emit(Resource.Success(data))
            } catch (e: Exception) {
                emit(Resource.Error(e.message ?: "Message is empty"))
            }
        }
    }

    override suspend fun getResult(): Flow<List<CameraModel>> {
        return flow {
            val data = RetrofitService.apiService.getCameras().body()?.data?.cameras
            if (data != null) {
                emit(data)
            }
        }
    }

    override suspend fun insertCamera(camera: CameraModel) {
        cameraDao.insertCamera(camera.convertToCamera())
    }

    override suspend fun updateCamera(camera: CameraModel) {
        cameraDao.updateCamera(camera.convertToCamera())
    }

    override suspend fun deleteCamera(camera: CameraModel) {
        cameraDao.deleteCamera(camera.convertToCamera())
    }
}