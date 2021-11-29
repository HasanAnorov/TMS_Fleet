package com.example.tmsfleet.ui.trucks_and_trailers.trailers_fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.tmsfleet.databinding.FragmentTrailersBinding

class TrailersFragment : Fragment() {

    private lateinit var binding: FragmentTrailersBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentTrailersBinding.inflate(inflater, container, false)

        return binding.root
    }
}