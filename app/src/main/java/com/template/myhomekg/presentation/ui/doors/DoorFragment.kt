package com.template.myhomekg.presentation.ui.doors

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.template.myhomekg.databinding.FragmentDoorBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class DoorFragment : Fragment() {
    private lateinit var binding: FragmentDoorBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {
        binding = FragmentDoorBinding.inflate(layoutInflater)
        return binding.root
    }
}