package com.template.myhomekg.data.utils

import com.template.myhomekg.data.model.Camera
import com.template.myhomekg.data.model.Door
import com.template.myhomekg.domain.models.CameraModel
import com.template.myhomekg.domain.models.DoorModel

fun List<Camera>.mapToCameraModel() = this.map { camera ->
    CameraModel(
        id = camera.id, name = camera.name, image = camera.image, isFavourite = camera.isFavourite
    )
}

fun List<Door>.mapToDoorModel() = this.map { door ->
    DoorModel(
        id = door.id, name = door.name, image = door.image, isFavourite = door.isFavourite
    )
}

fun CameraModel.convertToCamera() = Camera(
    id = this.id, name = this.name, image = this.image, isFavourite = this.isFavourite
)

fun DoorModel.convertToDoor() = Door(
    id = this.id, name = this.name, image = this.image, isFavourite = this.isFavourite
)