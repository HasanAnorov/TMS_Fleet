package com.example.tmsfleet.ui.trucks_trailers.info.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.tmsfleet.databinding.TruckListItemBinding
import com.example.tmsfleet.ui.trucks_trailers.info.interfaces.OnTruckIClickListener
import com.example.tmsfleet.ui.trucks_trailers.info.model.TruckModel
import java.io.Serializable

    class TruckAdapter(val listener: OnTruckIClickListener,var folders : List<TruckModel>): RecyclerView.Adapter<TruckAdapter.ViewHolderHomeFragment>() ,
        Serializable {

        inner class ViewHolderHomeFragment(private  var binding: TruckListItemBinding): RecyclerView.ViewHolder(binding.root){
            fun onBind(model: TruckModel){
                binding.truckName.text = model.truckName

                binding.root.setOnClickListener {
                    listener.onTruckItemClickListener(model)
                }

            }
        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderHomeFragment {
            return  ViewHolderHomeFragment(
                TruckListItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
            )
        }

        override fun getItemCount(): Int = folders.size

        override fun onBindViewHolder(holder: ViewHolderHomeFragment, position: Int) {
            holder.onBind(folders[position])
        }
    }

