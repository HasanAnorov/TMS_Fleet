package com.example.tmsfleet.ui.truck_sides

import android.os.Bundle
import android.view.*
import android.widget.Toast
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import com.example.tmsfleet.R
import com.example.tmsfleet.databinding.FragmentTruckSidesBinding
import com.example.tmsfleet.ui.MainActivity
import com.example.tmsfleet.ui.truck_sides.adapter.TruckSidesAdapter

class TruckSidesFragment : Fragment() {

    private lateinit var binding: FragmentTruckSidesBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        setHasOptionsMenu(true)
        binding = FragmentTruckSidesBinding.inflate(inflater,container,false)

        // status bar text color
        (activity as MainActivity).window.decorView.systemUiVisibility =(View.SYSTEM_UI_FLAG_LIGHT_NAVIGATION_BAR)

        //status bar color
        (activity as MainActivity).window.statusBarColor =
            ContextCompat.getColor(requireContext(), R.color.purple_500)
        (activity as MainActivity).window.navigationBarColor =
            ContextCompat.getColor(requireContext(), R.color.white)

        val viewPager = binding.viewPager
        val tabLayout = binding.tabLayout

        val adapter = TruckSidesAdapter(childFragmentManager)
        viewPager.adapter = adapter

        tabLayout.setupWithViewPager(viewPager)
        tabLayout.setSelectedTabIndicatorHeight(0)

        return binding.root
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.menu_save_button,menu)
        super.onCreateOptionsMenu(menu, inflater)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.menu_save_button ->
                Toast.makeText(requireContext(), "Click", Toast.LENGTH_SHORT).show()
            else ->
                Toast.makeText(requireContext(), "Click1", Toast.LENGTH_SHORT).show()
        }
        return super.onOptionsItemSelected(item)
    }
}