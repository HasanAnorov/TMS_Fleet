package com.example.tmsfleet.ui.truck_sides.right

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.tmsfleet.R
import com.example.tmsfleet.databinding.FragmentRightBinding

class RightFragment : Fragment() {

    private lateinit var binding:FragmentRightBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentRightBinding.inflate(inflater,container,false)

        return binding.root
    }
}