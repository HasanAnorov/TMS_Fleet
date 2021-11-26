package com.example.tmsfleet.ui.driver_details

import android.graphics.Bitmap
import android.os.Bundle
import android.view.*
import android.widget.Toast
import android.widget.Toolbar
import androidx.fragment.app.Fragment
import com.example.tmsfleet.R
import com.example.tmsfleet.databinding.FragmentDriverDetailsBinding
import com.example.tmsfleet.ui.MainActivity
import com.github.gcacace.signaturepad.views.SignaturePad
import java.io.File
import java.io.IOException

class DriverDetailsFragment : Fragment() {

    private lateinit var binding: FragmentDriverDetailsBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentDriverDetailsBinding.inflate(inflater,container,false)
        setHasOptionsMenu(true)

        val toolbar = view?.findViewById<Toolbar>(R.id.toolbar)



        val mSignaturePad : SignaturePad = binding.signature
        mSignaturePad.setOnSignedListener(object:SignaturePad.OnSignedListener{
            override fun onStartSigning() {

            }

            override fun onSigned() {
//                val signatureBitmap = mSignaturePad.signatureBitmap
//
//                if (addJpgSignatureToGallery(signatureBitmap)){
//                    Toast.makeText(requireContext(), "Signature saved into gallery", Toast.LENGTH_SHORT).show()
//                }else{
//                    Toast.makeText(requireContext(), "Unable to store the signature", Toast.LENGTH_SHORT).show()
//                }
//
//                if (addSvgSignatureToGallery(signatureBitmap)){
//                    Toast.makeText(requireContext(), "SVG Signature saved into gallery", Toast.LENGTH_SHORT).show()
//                }else{
//                    Toast.makeText(requireContext(), "Unable to store SVG signature", Toast.LENGTH_SHORT).show()
//                }

            }

            override fun onClear() {

            }

        })

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
                Toast.makeText(requireContext(), "Click", Toast.LENGTH_SHORT).show()
        }
        return super.onOptionsItemSelected(item)
    }


}