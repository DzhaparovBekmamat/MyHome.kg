package com.template.myhomekg.domain.models

import com.template.myhomekg.data.model.Camera

data class CameraList(
    var data: Data
)

data class Data(
    var cameras: List<Camera>
)

