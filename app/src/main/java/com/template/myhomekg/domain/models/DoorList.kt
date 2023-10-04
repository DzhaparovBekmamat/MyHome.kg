package com.template.myhomekg.domain.models

data class DoorList(
    var data: DoorData
)

data class DoorData(
    var doors: List<DoorModel>
)