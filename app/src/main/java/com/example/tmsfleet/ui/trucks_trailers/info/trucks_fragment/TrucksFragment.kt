package com.example.tmsfleet.ui.trucks_trailers.info.trucks_fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.tmsfleet.databinding.FragmentTrucksBinding

class TrucksFragment : Fragment() {

    private lateinit var binding : FragmentTrucksBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentTrucksBinding.inflate(inflater,container,false)



        return binding.root
    }


}