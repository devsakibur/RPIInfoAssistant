package com.example.rpiassistant.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.rpiassistant.R
import com.example.rpiassistant.databinding.FragmentLoginBinding
import com.example.rpiassistant.databinding.FragmentRegistrationBinding

class RegistrationFragment : Fragment() {
private lateinit var binding: FragmentRegistrationBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentRegistrationBinding.inflate(layoutInflater)

        binding.loginBtn.setOnClickListener {
            findNavController().navigate(R.id.action_registrationFragment_to_editProfileFragment)
        }
        binding.button4.setOnClickListener {
            findNavController().navigate(R.id.action_registrationFragment_to_loginFragment)
        }


        return binding.root
    }

}