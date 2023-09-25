package com.template.myhomekg.data.repository

import com.template.myhomekg.domain.models.CameraModel
import com.template.myhomekg.domain.repositories.CameraRepository

class CamerasRepository : CameraRepository {

    override suspend fun getAllCameras(): List<CameraModel> {
        TODO("Not yet implemented")
    }

    override suspend fun insertCamera(camera: CameraModel) {
        TODO("Not yet implemented")
    }

    override suspend fun updateCamera(camera: CameraModel) {
        TODO("Not yet implemented")
    }

    override suspend fun deleteCamera(camera: CameraModel) {
        TODO("Not yet implemented")
    }
}