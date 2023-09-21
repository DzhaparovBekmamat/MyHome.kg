package com.template.myhomekg.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "cameras")
data class Camera(
    @PrimaryKey val id: Int, val name: String?, val image: String?, var isFavorite: Boolean = false
)
