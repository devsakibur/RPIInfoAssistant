package com.example.rpiassistant.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.activity.OnBackPressedCallback
import androidx.navigation.fragment.findNavController
import com.example.rpiassistant.R
import com.example.rpiassistant.databinding.FragmentSShiftRoutineShowBinding
import com.google.android.gms.tasks.OnCompleteListener
import com.google.firebase.storage.FirebaseStorage
import com.google.firebase.storage.StorageReference
import com.squareup.picasso.Picasso

class SShiftRoutineShowFragment : Fragment() {
private lateinit var binding: FragmentSShiftRoutineShowBinding
    private val storageRef: StorageReference = FirebaseStorage.getInstance().reference.child("images/my_image.jpg")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,savedInstanceState: Bundle?): View {
        binding = FragmentSShiftRoutineShowBinding.inflate(layoutInflater)

        val department = requireArguments().getString("department")
        val semester = requireArguments().getString("semester")


        val a = binding.routineA
        val b =  binding.routineB




        if (department.equals("Computer")){
            when(semester){
                "First"-> {
                    loadImageFromStorage("routines/second_shift/computer/dice_1.png", a)
                    loadImageFromStorage("routines/second_shift/computer/dice_2.png", b)
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
        }else if (department.equals("Electro-medical")){
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



    private fun loadImageFromStorage(filePath: String, imageView: ImageView) {
        val storageRef: StorageReference = FirebaseStorage.getInstance().reference.child(filePath)

        storageRef.downloadUrl.addOnCompleteListener(OnCompleteListener { task ->
            if (task.isSuccessful) {
                val imageUrl = task.result.toString()

                // Using Picasso library for image loading
                Picasso.get().load(imageUrl).into(imageView)
            } else {
                // Handle failure
            }
        })
    }











}