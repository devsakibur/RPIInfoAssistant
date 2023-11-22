package com.example.rpiassistant.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.OnBackPressedCallback
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.rpiassistant.R
import com.example.rpiassistant.databinding.FragmentShiftBinding

class ShiftFragment : Fragment() {
    private lateinit var binding: FragmentShiftBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        binding = FragmentShiftBinding.inflate(layoutInflater)

        binding.btnFirst.setOnClickListener {
            findNavController().navigate(R.id.action_shiftFragment_to_firstShiftFragment)
        }
        binding.btnSecond.setOnClickListener {
            findNavController().navigate(R.id.action_shiftFragment_to_secondShiftFragment)
        }

        return binding.root
    }





}