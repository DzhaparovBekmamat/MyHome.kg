package com.template.myhomekg.data.remote

import com.template.myhomekg.data.model.Camera
import com.template.myhomekg.data.model.Door
import retrofit2.Call
import retrofit2.http.GET

interface ApiService {
    @GET("/cameras")
    fun getCameras(): Call<Camera>

    @GET("/doors")
    fun getDoors(): Call<Door>
}