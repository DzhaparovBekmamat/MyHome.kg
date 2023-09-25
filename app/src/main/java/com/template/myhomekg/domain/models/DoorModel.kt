package com.template.myhomekg.domain.models

data class DoorModel(
    val id: Int, val name: String?, val image: String?, var isFavorite: Boolean = false
)