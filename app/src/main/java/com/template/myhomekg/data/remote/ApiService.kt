package com.template.myhomekg.data.remote

import retrofit2.http.GET

interface ApiService {
    @GET("/cameras")
    fun getCameras() {
    }
}