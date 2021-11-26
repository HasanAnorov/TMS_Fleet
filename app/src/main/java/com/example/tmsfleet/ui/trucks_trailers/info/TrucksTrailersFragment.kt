package com.example.tmsfleet.ui.trucks_trailers.info

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import com.example.tmsfleet.R
import com.example.tmsfleet.databinding.FragmentTrucksTrailersBinding
import com.example.tmsfleet.ui.MainActivity
import com.example.tmsfleet.ui.trucks_trailers.info.adapter.TrucksAdapter
import com.google.android.material.tabs.TabLayoutMediator

class TrucksTrailersFragment : Fragment() {

    private lateinit var binding: FragmentTrucksTrailersBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentTrucksTrailersBinding.inflate(inflater,container,false)

        // status bar text color
        (activity as MainActivity).window.decorView.systemUiVisibility =(View.SYSTEM_UI_FLAG_LIGHT_NAVIGATION_BAR)

        //status bar color
        (activity as MainActivity).window.statusBarColor =
            ContextCompat.getColor(requireContext(), R.color.purple_500)
        (activity as MainActivity).window.navigationBarColor =
            ContextCompat.getColor(requireContext(), R.color.white)


        val viewPager = binding.viewPager
        val tabLayout = binding.tabLayout

        val adapter = TrucksAdapter(childFragmentManager)
        viewPager.adapter = adapter

        tabLayout.setupWithViewPager(viewPager)


        return binding.root
    }

}