package com.template.myhomekg.presentation.ui.cameras

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.template.myhomekg.data.repository.CameraRepositoryImpl
import com.template.myhomekg.domain.models.CameraModel
import com.template.myhomekg.domain.usecases.GetAllCamerasUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class CameraViewModel @Inject constructor(repositoryImpl: CameraRepositoryImpl) :
    ViewModel() {
    private val camerasUseCase = GetAllCamerasUseCase(repositoryImpl)
    val cameraList = MutableLiveData<List<CameraModel>>()

    init {
        getCameras()
    }

    private fun getCameras() {
        viewModelScope.launch {
            camerasUseCase.getResult().collect { response ->
                cameraList.postValue(response)
                Log.d("ololo", "getCameras: $response")
            }
        }
    }
}