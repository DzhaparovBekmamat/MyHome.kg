package com.template.myhomekg.domain.usecases

import com.template.myhomekg.data.repository.DoorRepositoryImpl
import javax.inject.Inject

class GetAllDoorsUseCase @Inject constructor(
    private val repository: DoorRepositoryImpl
) {
    suspend fun getAllDoors() = repository.getAllDoors()
}