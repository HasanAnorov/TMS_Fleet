package com.example.tmsfleet.ui.new_truck_inspection_report

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import com.example.tmsfleet.R
import com.example.tmsfleet.databinding.FragmentNewTruckInspectionReportBinding

class NewTruckInspectionReportFragment : Fragment() {

    private lateinit var binding: FragmentNewTruckInspectionReportBinding
    private lateinit var spinnerDriver :Spinner
    private lateinit var spinnerTruck :Spinner

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentNewTruckInspectionReportBinding.inflate(inflater,container,false)

        spinnerDriver = binding.spinnerSelectDriver
        spinnerTruck = binding.spinnerSelectTruck

        val drivers :MutableList<String> = arrayListOf()
        val trucks :MutableList<String> = arrayListOf()

        drivers.add(0, "Select Driver")
        drivers.add("James")
        drivers.add("Drake")
        drivers.add("Gill Bates")

        trucks.add(0, "Select Truck")
        trucks.add("Good truck")
        trucks.add("Black Truck")
        trucks.add("Lorem Ipsum")

        val truckAdapter :ArrayAdapter<String> = ArrayAdapter<String>(requireContext(), android.R.layout.simple_list_item_1,trucks)
        truckAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinnerTruck.adapter = truckAdapter

        val driverAdapter :ArrayAdapter<String> = ArrayAdapter<String>(requireContext(), android.R.layout.simple_list_item_1,drivers)
        driverAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinnerTruck.adapter = driverAdapter

        spinnerTruck.onItemSelectedListener = object :AdapterView.OnItemSelectedListener{
            override fun onItemSelected(parent: AdapterView<*>?,view: View?, position: Int, id: Long) {
                if(parent?.getItemAtPosition(position) == "Select Truck"){
                    //do nothing
                }
                else{
                    val item = parent?.getItemAtPosition(position).toString()
                }
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
            }
        }

        spinnerDriver.onItemSelectedListener = object :AdapterView.OnItemSelectedListener{
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                if(parent?.getItemAtPosition(position) == "Select Driver"){
                    //do nothing
                }else{
                    val item = parent?.getItemAtPosition(position).toString()
                }
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {

            }

        }

        return binding.root
    }

}