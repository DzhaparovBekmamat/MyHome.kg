package com.template.myhomekg.domain.usecases

import com.template.myhomekg.data.repository.CameraRepositoryImpl
import javax.inject.Inject

class GetAllCamerasUseCase @Inject constructor(
    private val repository: CameraRepositoryImpl
) {
    suspend fun getAllDoors() = repository.getAllCameras()

    suspend fun getResult() = repository.getResult()
}