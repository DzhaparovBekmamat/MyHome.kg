package com.template.myhomekg.domain.repositories

import com.template.myhomekg.domain.utils.Resource
import com.template.myhomekg.domain.models.CameraModel
import kotlinx.coroutines.flow.Flow

interface CameraRepository {
    suspend fun getAllCameras(): Flow<Resource<List<CameraModel>>>

    suspend fun getResult(): Flow<List<CameraModel>>

    suspend fun insertCamera(camera: CameraModel): Unit

    suspend fun updateCamera(camera: CameraModel): Unit

    suspend fun deleteCamera(camera: CameraModel): Unit
}