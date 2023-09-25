package com.template.myhomekg.presentation.ui.cameras

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.template.myhomekg.databinding.FragmentCameraBinding

class CamerasFragment : Fragment() {
    private lateinit var binding: FragmentCameraBinding
    private val adapter = CamerasAdapter()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {
        binding = FragmentCameraBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initializeView()
    }

    private fun initializeView() {
        binding.recyclerView.adapter = adapter
    }
}