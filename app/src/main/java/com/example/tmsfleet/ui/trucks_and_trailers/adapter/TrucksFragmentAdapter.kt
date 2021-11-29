package com.example.tmsfleet.ui.trucks_and_trailers.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import com.example.tmsfleet.ui.trucks_and_trailers.trailers_fragment.TrailersFragment
import com.example.tmsfleet.ui.trucks_and_trailers.trucks_fragment.TrucksFragment

class TrucksFragmentAdapter(fm:FragmentManager) :FragmentStatePagerAdapter(fm,
    BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {

    override fun getCount(): Int = 2

    override fun getItem(position: Int): Fragment {
        return when(position){
            0 -> TrucksFragment()
            1 -> TrailersFragment()
            else -> TrucksFragment()
        }
    }

    override fun getPageTitle(position: Int): CharSequence {
        return when(position){
            0 -> "Trucks"
            1 -> "Trailers"
            else -> "Trucks"
        }
    }
}