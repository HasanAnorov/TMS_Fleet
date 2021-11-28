package com.example.tmsfleet.ui.truck_sides.back

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.tmsfleet.R
import com.example.tmsfleet.databinding.FragmentBackBinding
import com.example.tmsfleet.databinding.FragmentLeftBinding

class BackFragment : Fragment() {

    private lateinit var binding: FragmentBackBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentBackBinding.inflate(inflater,container,false)



        return binding.root
    }

}