package com.example.tmsfleet.ui.trucks_and_trailers.trucks_fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.tmsfleet.databinding.FragmentTrucksBinding
import com.example.tmsfleet.ui.trucks_and_trailers.adapter.TruckAdapter
import com.example.tmsfleet.ui.trucks_and_trailers.interfaces.OnTruckIClickListener
import com.example.tmsfleet.ui.trucks_and_trailers.model.TruckModel
import androidx.fragment.app.FragmentTransaction
import androidx.lifecycle.ViewModelProvider
import com.example.tmsfleet.R
import com.example.tmsfleet.ui.new_truck_inspection_report.NewTruckInspectionReportFragment
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class TrucksFragment : Fragment(), OnTruckIClickListener {

    private lateinit var binding : FragmentTrucksBinding
    private lateinit var adapter: TruckAdapter
    private lateinit var viewModel: TrucksViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentTrucksBinding.inflate(inflater,container,false)

        initViewModel()

        val truck :ArrayList<TruckModel> = arrayListOf(
            TruckModel("THO 3452 - 2020-10-24 - Check In"),
            TruckModel("MRZ 2345 - 2020-11-30 - Check Out")
        )

        val adapter = TruckAdapter(this,truck)
        binding.recyclerView.adapter =adapter

        binding.fabAdd.setOnClickListener {
            val productDetailFragment: Fragment = NewTruckInspectionReportFragment()
            val transaction: FragmentTransaction = childFragmentManager.beginTransaction()
            transaction.addToBackStack(null)
            transaction.replace(R.id.trucksFragment, productDetailFragment).commit()
        }

        return binding.root
    }

    override fun onTruckItemClickListener(truckModel: TruckModel) {
        Toast.makeText(requireContext(), "Truck name : ${truckModel.truckName}", Toast.LENGTH_SHORT).show()
    }

    private  fun initViewModel(){

        viewModel = ViewModelProvider(requireActivity()).get(TrucksViewModel::class.java)
        viewModel.getLiveData().observe(requireActivity(), { listData ->

            if (listData!= null){
                //  adapter = TruckAdapter(this,listData.body()!!)
                //binding.recyclerView.adapter = adapter
            }else{
                Toast.makeText(requireContext(), "Something went wrong !", Toast.LENGTH_SHORT).show()
            }

        })
        viewModel.loadData()

    }

}