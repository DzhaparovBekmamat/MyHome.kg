package com.template.myhomekg.data.remote

import com.template.myhomekg.domain.models.CameraList
import com.template.myhomekg.domain.models.DoorModel
import retrofit2.Call
import retrofit2.http.GET

interface ApiService {
    @GET("cameras")
    fun getCameras(): Call<CameraList>

    @GET("/doors")
    fun getDoors(): Call<DoorModel>
}