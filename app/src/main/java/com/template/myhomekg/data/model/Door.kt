package com.template.myhomekg.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "doors")
data class Door(
    @PrimaryKey val id: Int, val name: String?, val image: String?
)