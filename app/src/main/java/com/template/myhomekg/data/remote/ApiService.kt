package com.template.myhomekg.data.remote

import com.template.myhomekg.domain.models.CameraList
import com.template.myhomekg.domain.models.DoorList
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {
    @GET("cameras")
    suspend fun getCameras(): Response<CameraList>

    @GET("doors")
    fun getDoors(): Response<DoorList>
}