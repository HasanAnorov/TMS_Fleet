package com.example.tmsfleet.ui.truck_sides.left

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.tmsfleet.R
import com.example.tmsfleet.databinding.FragmentFronBinding
import com.example.tmsfleet.databinding.FragmentLeftBinding

class LeftFragment : Fragment() {

    private lateinit var binding: FragmentLeftBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = FragmentLeftBinding.inflate(inflater,container,false)



        return binding.root
    }

}