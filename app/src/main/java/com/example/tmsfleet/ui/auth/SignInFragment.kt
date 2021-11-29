package com.example.tmsfleet.ui.auth

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.example.tmsfleet.R
import com.example.tmsfleet.databinding.FragmentSignInBinding
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat.getColor

import com.example.tmsfleet.ui.MainActivity
import android.app.Activity
import android.content.Context
import android.view.inputmethod.InputMethodManager


class SignInFragment : Fragment() {

    private lateinit var binding: FragmentSignInBinding
    private val loginViewModel: SignInViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSignInBinding.inflate(inflater,container,false)

        // status bar text color
        (activity as MainActivity).window.decorView.systemUiVisibility =(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR or  View.SYSTEM_UI_FLAG_LIGHT_NAVIGATION_BAR)

        //status bar color
        (activity as MainActivity).window.statusBarColor = getColor(requireContext(),R.color.white)
        (activity as MainActivity).window.navigationBarColor = getColor(requireContext(),R.color.white)

        binding.btLogin.setOnClickListener {
            doLogin()
            hideKeyboardFrom(requireContext(),binding.btLogin)
        }

        return binding.root
    }

    private fun hideKeyboardFrom(context: Context, view: View) {
        val imm: InputMethodManager =
            context.getSystemService(Activity.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow(view.windowToken, 0)
    }

    override fun onResume() {
        super.onResume()
        (activity as AppCompatActivity?)!!.supportActionBar!!.hide()
    }

    override fun onStop() {
        super.onStop()
        (activity as AppCompatActivity?)!!.supportActionBar!!.show()
    }

    private fun doLogin() {
//        loginViewModel.doLogin(
//            binding.etEmail.toString().trim(),
//            binding.etPassword.text.toString()
//        )

        if (binding.etEmail.text.toString().length<4 || binding.etPassword.text.toString().length<4){
            Toast.makeText(requireContext(), "Fields length must be grater than 4", Toast.LENGTH_SHORT).show()
        }else{
//            val activityNavigator = ActivityNavigator( this)
//            activityNavigator.navigate(
//                activityNavigator.createDestination().setIntent(
//                    Intent(
//                        this,
//                        TrucksTrailersActivity::class.java
//                    )
//                ), null, null, null
//            )
            findNavController().popBackStack(R.id.signInFragment,true)
            findNavController().navigate(R.id.trucksTrailersFragment)
        }
    }
}