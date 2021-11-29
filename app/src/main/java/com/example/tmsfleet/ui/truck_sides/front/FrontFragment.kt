package com.example.tmsfleet.ui.truck_sides.front

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import com.example.tmsfleet.databinding.FragmentFronBinding

class FrontFragment : Fragment() {

    private lateinit var binding: FragmentFronBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentFronBinding.inflate(inflater,container,false)

        binding.spDamage.prompt = "Damage type"
        binding.spDamage.onItemSelectedListener = object  : AdapterView.OnItemSelectedListener{
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {

            }

            override fun onNothingSelected(p0: AdapterView<*>?) {   }
        }
        return binding.root
    }
}