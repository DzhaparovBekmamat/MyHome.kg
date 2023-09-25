package com.template.myhomekg.domain.repositories

import com.template.myhomekg.domain.models.CameraModel


interface CameraRepository {
    suspend fun getAllCameras(): List<CameraModel>
    suspend fun insertCamera(camera: CameraModel)
    suspend fun updateCamera(camera: CameraModel)
    suspend fun deleteCamera(camera: CameraModel)
}