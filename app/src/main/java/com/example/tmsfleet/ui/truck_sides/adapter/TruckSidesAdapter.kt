package com.example.tmsfleet.ui.truck_sides.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import com.example.tmsfleet.ui.truck_sides.back.BackFragment
import com.example.tmsfleet.ui.truck_sides.front.FrontFragment
import com.example.tmsfleet.ui.truck_sides.left.LeftFragment
import com.example.tmsfleet.ui.truck_sides.right.RightFragment

class TruckSidesAdapter(fm: FragmentManager) : FragmentStatePagerAdapter(fm,
    BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT
) {
    override fun getCount(): Int = 4

    override fun getItem(position: Int): Fragment {
        return when(position){
            0 -> FrontFragment()
            1 -> LeftFragment()
            2 -> RightFragment()
            3 -> BackFragment()
            else -> FrontFragment()
        }
    }

    override fun getPageTitle(position: Int): CharSequence {
        return when(position){
            0 -> "Front"
            1 -> "Left"
            2 ->"Right"
            3 ->"Back"
            else -> "Front"
        }
    }

}