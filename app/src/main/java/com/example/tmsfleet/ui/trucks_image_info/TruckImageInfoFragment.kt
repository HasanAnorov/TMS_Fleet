package com.example.tmsfleet.ui.trucks_image_info

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.tmsfleet.databinding.FragmentTruckImageInfoBinding

class TruckImageInfoFragment : Fragment() {

    private lateinit var binding : FragmentTruckImageInfoBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentTruckImageInfoBinding.inflate(inflater,container,false)

        return binding.root
    }
}