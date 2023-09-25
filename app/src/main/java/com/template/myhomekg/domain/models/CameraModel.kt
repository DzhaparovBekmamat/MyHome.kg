package com.template.myhomekg.domain.models

data class CameraModel(
    val id: Int,
    val name: String?,
    val image: String?,
    var isFavourite: Boolean = false
)
