package com.example.tmsfleet.ui.base_info

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.tmsfleet.R
import com.example.tmsfleet.databinding.FragmentBaseInfoBinding

class BaseInfoFragment : Fragment() {

    private lateinit var binding: FragmentBaseInfoBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentBaseInfoBinding.inflate(inflater,container,false)



        return binding.root
    }
}