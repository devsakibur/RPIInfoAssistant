package com.example.rpiassistant.view

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.rpiassistant.R
import com.example.rpiassistant.databinding.FragmentMainBinding
import com.google.firebase.FirebaseApp

class MainFragment : Fragment() {
private lateinit var binding: FragmentMainBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentMainBinding.inflate(layoutInflater)
        FirebaseApp.initializeApp(requireContext())

        binding.libraryBtn.setOnClickListener {
              val i = Intent(activity , LibraryActivity::class.java)
              startActivity(i)

        }

        binding.classRoutineBtn.setOnClickListener {
            val i = Intent(activity , RoutineActivity::class.java)
            startActivity(i)
        }

        binding.setting.setOnClickListener {
            findNavController().navigate(R.id.action_mainFragment_to_settingFragment)
        }


        return binding.root
    }

}