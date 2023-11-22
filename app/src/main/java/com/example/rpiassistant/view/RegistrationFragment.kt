package com.example.rpiassistant.view

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.activity.OnBackPressedCallback
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.rpiassistant.R
import com.example.rpiassistant.databinding.FragmentRegistrationBinding
import com.google.firebase.FirebaseApp
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.FirebaseDatabase

class RegistrationFragment : Fragment() {
    private lateinit var binding: FragmentRegistrationBinding
    private lateinit var selectedDepartment: String
    private lateinit var selectedShift: String

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentRegistrationBinding.inflate(layoutInflater)

        FirebaseApp.initializeApp(requireContext())

        val forDepartment = binding.department
        //Create an Array for departments
        val departments = arrayOf("Computer","Electrical","Electronics","Civil","Mechanical","Power","Electro-medical")
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
        val semesters = arrayOf("First","Second")
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
                selectedShift = semesters[position]
            }
            override fun onNothingSelected(parent: AdapterView<*>?) {

            }

        }


        binding.signUpBtn.setOnClickListener {
            val email = binding.userEmail.text.toString()
            val password = binding.password.text.toString()
            val confirmPassword = binding.ConformPassword.text.toString()
            val user = binding.username.text.toString()
            val dept = selectedDepartment

            val shift = selectedShift
            val session = binding.session.text.toString()
            val mobile = binding.mobile.text.toString()

//                register(email , password)

            if (email.isNotEmpty() &&
                password.isNotEmpty() &&
                confirmPassword.isNotEmpty() &&
                user.isNotEmpty() &&
                dept.isNotEmpty() &&
                shift.isNotEmpty() &&
                session.isNotEmpty() &&
                mobile.isNotEmpty()
            ){

                if (isEmailValid(email)){
                    if(password == confirmPassword){
                        if (isMobileNumberValid(mobile)){
                            registerUserAndStoreData(email , password , user , dept , shift , session , mobile)
                            Toast.makeText(requireContext() , "Sign Up Successful" , Toast.LENGTH_SHORT).show()

                        }else{
                            Toast.makeText(requireContext() , "Provide Valid Mobile" , Toast.LENGTH_SHORT).show()
                        }
                    }else{
                        Toast.makeText(requireContext() , "Password Didn't Match" , Toast.LENGTH_SHORT).show()
                    }
                }else{
                    Toast.makeText(requireContext() , "Provide Valid Email" , Toast.LENGTH_SHORT).show()
                }

            }else{
                Toast.makeText(requireContext() , "Provide Necessary Information" , Toast.LENGTH_SHORT).show()
            }




            // I will update the following later
           // findNavController().navigate(R.id.action_registrationFragment_to_editProfileFragment)
        }
        binding.signInText.setOnClickListener {
           findNavController().navigate(R.id.action_registrationFragment_to_loginFragment)

        }


        requireActivity().onBackPressedDispatcher.addCallback(viewLifecycleOwner, onBackPressedCallback)

        return binding.root
    }


    private val onBackPressedCallback = object : OnBackPressedCallback(true) {
        override fun handleOnBackPressed() {
            findNavController().navigateUp()
        }
    }

//    private fun register(email: String, password: String) {
//        try{
//            FirebaseAuth.getInstance().createUserWithEmailAndPassword(email, password)
//                .addOnCompleteListener { task ->
//                    if (task.isSuccessful) {
//                        val intent = Intent(activity, MainActivity::class.java)
//                        startActivity(intent)
//                    } else {
//
//                    }
//                }
//        } catch (e:Exception){
//            Log.d("TAG", "register: $e")
//        }
//    }


    // Function to register a user and store data
    private fun registerUserAndStoreData(email: String, password: String, username: String , department : String , shift : String , session :String , mobile : String) {
        val auth = FirebaseAuth.getInstance()
        val database = FirebaseDatabase.getInstance()
        val reference = database.getReference("users")

        auth.createUserWithEmailAndPassword(email, password).addOnCompleteListener { task ->
            if (task.isSuccessful) {
                val user = auth.currentUser
                val userId = user?.uid
                if (userId != null) {
                    val userData = mapOf(
                        "username" to username,
                        "email" to email,
                        "department" to department,
                        "shift" to shift,
                        "session" to session,
                        "mobile" to mobile

                    )
                    reference.child(userId).setValue(userData)

                    val intent = Intent(activity, MainActivity::class.java)
                    startActivity(intent)
                    activity?.finish()
                }

            } else {
                // Handle registration failure
            }
        }
    }


    private fun isEmailValid(email: String): Boolean {
        val emailRegex = Regex("[a-zA-Z0-9._-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}")
        return emailRegex.matches(email)
    }

    private fun isMobileNumberValid(number: String): Boolean {
        val bangladeshiNumberRegex = Regex("^01[0-9]{9}\$")
        return bangladeshiNumberRegex.matches(number)
    }


}