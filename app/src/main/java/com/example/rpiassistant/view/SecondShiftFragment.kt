package com.example.rpiassistant.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ArrayAdapter
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.rpiassistant.R
import com.example.rpiassistant.databinding.FragmentSecondShiftBinding


class SecondShiftFragment : Fragment() {
    private lateinit var selectedDepartment: String
    private lateinit var selectedSemester : String
    private lateinit var binding : FragmentSecondShiftBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        binding = FragmentSecondShiftBinding.inflate(layoutInflater)

        val forDepartment = binding.department
        //Create an Array for departments
        val departments = arrayOf("Computer","Electrical","Electronics","Civil","Mechanical","Power","Electromedical")
        val departmentAdapter = ArrayAdapter(requireContext(),android.R.layout.simple_spinner_dropdown_item,departments)
        forDepartment.adapter = departmentAdapter

        //selected department
        forDepartment.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                selectedDepartment = departments[position]
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {

            }

        }

        val forSemester = binding.semester
        //Create an Array for semester
        val semesters = arrayOf("First","Second","Third","Fourth","Fifth","Sixth","Seventh","Eighth")
        val semesterAdapter = ArrayAdapter(requireContext(),android.R.layout.simple_spinner_dropdown_item,semesters)
        forSemester.adapter = semesterAdapter

        //selected semester
        forSemester.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                selectedSemester = semesters[position]
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {

            }

        }

        binding.viewRoutine.setOnClickListener {
            val dept = selectedDepartment
            val sem = selectedSemester
            val bundle = Bundle()
            bundle.putSerializable("department",dept)
            bundle.putSerializable("semester",sem)
            findNavController().navigate(R.id.action_secondShiftFragment_to_SShiftRoutineShowFragment, bundle)

        }
        return binding.root
    }
}