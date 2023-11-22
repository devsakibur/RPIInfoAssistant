package com.example.rpiassistant

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.OnBackPressedCallback
import androidx.navigation.fragment.findNavController
import com.example.rpiassistant.databinding.FragmentFShiftRoutineShowBinding

class FShiftRoutineShowFragment : Fragment() {

    private lateinit var binding:FragmentFShiftRoutineShowBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        binding= FragmentFShiftRoutineShowBinding.inflate(layoutInflater)


        val department = requireArguments().getString("department")
        val semester = requireArguments().getString("semester")

        if (department.equals("Computer")){
            when(semester){
                "First"-> {
                    binding.routineA.setImageResource(R.drawable.routin_a)
                    binding.routineB.setImageResource(R.drawable.routine_b)
                }
                "Second"-> {
                    binding.routineA.setImageResource(R.drawable.routin_a)
                    binding.routineB.setImageResource(R.drawable.routine_b)
                }
                "Third"-> {
                    binding.routineA.setImageResource(R.drawable.routin_a)
                    binding.routineB.setImageResource(R.drawable.routine_b)
                }
                "Fourth"-> {
                    binding.routineA.setImageResource(R.drawable.routin_a)
                    binding.routineB.setImageResource(R.drawable.routine_b)
                }
                "Fifth"-> {
                    binding.routineA.setImageResource(R.drawable.routin_a)
                    binding.routineB.setImageResource(R.drawable.routine_b)
                }
                "Sixth"-> {
                    binding.routineA.setImageResource(R.drawable.routin_a)
                    binding.routineB.setImageResource(R.drawable.routine_b)
                }
                "Seventh"-> {
                    binding.routineA.setImageResource(R.drawable.routin_a)
                    binding.routineB.setImageResource(R.drawable.routine_b)
                }
                "Eighth"-> {
                    binding.routineA.setImageResource(R.drawable.routin_a)
                    binding.routineB.setImageResource(R.drawable.routine_b)
                }
            }
        }else if (department.equals("Electrical")){
            when(semester){
                "First"-> {
                    binding.routineA.setImageResource(R.drawable.routin_a)
                    binding.routineB.setImageResource(R.drawable.routine_b)
                }
                "Second"-> {
                    binding.routineA.setImageResource(R.drawable.routin_a)
                    binding.routineB.setImageResource(R.drawable.routine_b)
                }
                "Third"-> {
                    binding.routineA.setImageResource(R.drawable.routin_a)
                    binding.routineB.setImageResource(R.drawable.routine_b)
                }
                "Fourth"-> {
                    binding.routineA.setImageResource(R.drawable.routin_a)
                    binding.routineB.setImageResource(R.drawable.routine_b)
                }
                "Fifth"-> {
                    binding.routineA.setImageResource(R.drawable.routin_a)
                    binding.routineB.setImageResource(R.drawable.routine_b)
                }
                "Sixth"-> {
                    binding.routineA.setImageResource(R.drawable.routin_a)
                    binding.routineB.setImageResource(R.drawable.routine_b)
                }
                "Seventh"-> {
                    binding.routineA.setImageResource(R.drawable.routin_a)
                    binding.routineB.setImageResource(R.drawable.routine_b)
                }
                "Eighth"-> {
                    binding.routineA.setImageResource(R.drawable.routin_a)
                    binding.routineB.setImageResource(R.drawable.routine_b)
                }
            }
        }else if (department.equals("Electronics")){
            when(semester){
                "First"-> {
                    binding.routineA.setImageResource(R.drawable.routin_a)
                    binding.routineB.setImageResource(R.drawable.routine_b)
                }
                "Second"-> {
                    binding.routineA.setImageResource(R.drawable.routin_a)
                    binding.routineB.setImageResource(R.drawable.routine_b)
                }
                "Third"-> {
                    binding.routineA.setImageResource(R.drawable.routin_a)
                    binding.routineB.setImageResource(R.drawable.routine_b)
                }
                "Fourth"-> {
                    binding.routineA.setImageResource(R.drawable.routin_a)
                    binding.routineB.setImageResource(R.drawable.routine_b)
                }
                "Fifth"-> {
                    binding.routineA.setImageResource(R.drawable.routin_a)
                    binding.routineB.setImageResource(R.drawable.routine_b)
                }
                "Sixth"-> {
                    binding.routineA.setImageResource(R.drawable.routin_a)
                    binding.routineB.setImageResource(R.drawable.routine_b)
                }
                "Seventh"-> {
                    binding.routineA.setImageResource(R.drawable.routin_a)
                    binding.routineB.setImageResource(R.drawable.routine_b)
                }
                "Eighth"-> {
                    binding.routineA.setImageResource(R.drawable.routin_a)
                    binding.routineB.setImageResource(R.drawable.routine_b)
                }
            }
        }else if (department.equals("Civil")){
            when(semester){
                "First"-> {
                    binding.routineA.setImageResource(R.drawable.routin_a)
                    binding.routineB.setImageResource(R.drawable.routine_b)
                }
                "Second"-> {
                    binding.routineA.setImageResource(R.drawable.routin_a)
                    binding.routineB.setImageResource(R.drawable.routine_b)
                }
                "Third"-> {
                    binding.routineA.setImageResource(R.drawable.routin_a)
                    binding.routineB.setImageResource(R.drawable.routine_b)
                }
                "Fourth"-> {
                    binding.routineA.setImageResource(R.drawable.routin_a)
                    binding.routineB.setImageResource(R.drawable.routine_b)
                }
                "Fifth"-> {
                    binding.routineA.setImageResource(R.drawable.routin_a)
                    binding.routineB.setImageResource(R.drawable.routine_b)
                }
                "Sixth"-> {
                    binding.routineA.setImageResource(R.drawable.routin_a)
                    binding.routineB.setImageResource(R.drawable.routine_b)
                }
                "Seventh"-> {
                    binding.routineA.setImageResource(R.drawable.routin_a)
                    binding.routineB.setImageResource(R.drawable.routine_b)
                }
                "Eighth"-> {
                    binding.routineA.setImageResource(R.drawable.routin_a)
                    binding.routineB.setImageResource(R.drawable.routine_b)
                }
            }
        }else if (department.equals("Mechanical")){
            when(semester){
                "First"-> {
                    binding.routineA.setImageResource(R.drawable.routin_a)
                    binding.routineB.setImageResource(R.drawable.routine_b)
                }
                "Second"-> {
                    binding.routineA.setImageResource(R.drawable.routin_a)
                    binding.routineB.setImageResource(R.drawable.routine_b)
                }
                "Third"-> {
                    binding.routineA.setImageResource(R.drawable.routin_a)
                    binding.routineB.setImageResource(R.drawable.routine_b)
                }
                "Fourth"-> {
                    binding.routineA.setImageResource(R.drawable.routin_a)
                    binding.routineB.setImageResource(R.drawable.routine_b)
                }
                "Fifth"-> {
                    binding.routineA.setImageResource(R.drawable.routin_a)
                    binding.routineB.setImageResource(R.drawable.routine_b)
                }
                "Sixth"-> {
                    binding.routineA.setImageResource(R.drawable.routin_a)
                    binding.routineB.setImageResource(R.drawable.routine_b)
                }
                "Seventh"-> {
                    binding.routineA.setImageResource(R.drawable.routin_a)
                    binding.routineB.setImageResource(R.drawable.routine_b)
                }
                "Eighth"-> {
                    binding.routineA.setImageResource(R.drawable.routin_a)
                    binding.routineB.setImageResource(R.drawable.routine_b)
                }
            }
        }else if (department.equals("Power")){
            when(semester){
                "First"-> {
                    binding.routineA.setImageResource(R.drawable.routin_a)
                    binding.routineB.setImageResource(R.drawable.routine_b)
                }
                "Second"-> {
                    binding.routineA.setImageResource(R.drawable.routin_a)
                    binding.routineB.setImageResource(R.drawable.routine_b)
                }
                "Third"-> {
                    binding.routineA.setImageResource(R.drawable.routin_a)
                    binding.routineB.setImageResource(R.drawable.routine_b)
                }
                "Fourth"-> {
                    binding.routineA.setImageResource(R.drawable.routin_a)
                    binding.routineB.setImageResource(R.drawable.routine_b)
                }
                "Fifth"-> {
                    binding.routineA.setImageResource(R.drawable.routin_a)
                    binding.routineB.setImageResource(R.drawable.routine_b)
                }
                "Sixth"-> {
                    binding.routineA.setImageResource(R.drawable.routin_a)
                    binding.routineB.setImageResource(R.drawable.routine_b)
                }
                "Seventh"-> {
                    binding.routineA.setImageResource(R.drawable.routin_a)
                    binding.routineB.setImageResource(R.drawable.routine_b)
                }
                "Eighth"-> {
                    binding.routineA.setImageResource(R.drawable.routin_a)
                    binding.routineB.setImageResource(R.drawable.routine_b)
                }
            }
        }else if (department.equals("Electromedical")){
            when(semester){
                "First"-> {
                    binding.routineA.setImageResource(R.drawable.routin_a)
                    binding.routineB.setImageResource(R.drawable.routine_b)
                }
                "Second"-> {
                    binding.routineA.setImageResource(R.drawable.routin_a)
                    binding.routineB.setImageResource(R.drawable.routine_b)
                }
                "Third"-> {
                    binding.routineA.setImageResource(R.drawable.routin_a)
                    binding.routineB.setImageResource(R.drawable.routine_b)
                }
                "Fourth"-> {
                    binding.routineA.setImageResource(R.drawable.routin_a)
                    binding.routineB.setImageResource(R.drawable.routine_b)
                }
                "Fifth"-> {
                    binding.routineA.setImageResource(R.drawable.routin_a)
                    binding.routineB.setImageResource(R.drawable.routine_b)
                }
                "Sixth"-> {
                    binding.routineA.setImageResource(R.drawable.routin_a)
                    binding.routineB.setImageResource(R.drawable.routine_b)
                }
                "Seventh"-> {
                    binding.routineA.setImageResource(R.drawable.routin_a)
                    binding.routineB.setImageResource(R.drawable.routine_b)
                }
                "Eighth"-> {
                    binding.routineA.setImageResource(R.drawable.routin_a)
                    binding.routineB.setImageResource(R.drawable.routine_b)
                }
            }
        }
        requireActivity().onBackPressedDispatcher.addCallback(viewLifecycleOwner, onBackPressedCallback)

        return binding.root
    }


    private val onBackPressedCallback = object : OnBackPressedCallback(true) {
        override fun handleOnBackPressed() {
            findNavController().navigateUp()
        }
    }

}