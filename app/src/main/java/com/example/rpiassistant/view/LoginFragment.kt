package com.example.rpiassistant.view

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.example.rpiassistant.R
import com.example.rpiassistant.databinding.FragmentLoginBinding
import com.google.firebase.FirebaseApp
import com.google.firebase.auth.FirebaseAuth

class LoginFragment : Fragment() {
private lateinit var binding: FragmentLoginBinding
    private val auth = FirebaseAuth.getInstance()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentLoginBinding.inflate(layoutInflater)

        FirebaseApp.initializeApp(requireContext())







        binding.loginBtn.setOnClickListener {
            if (binding.username.text.isNotEmpty() && binding.password.text.isNotEmpty()) {
                val email = binding.username.text.toString()
                val password = binding.password.text.toString()
                login(email, password)
            }else{
                Toast.makeText(requireContext() , "Provide Necessary Information" , Toast.LENGTH_SHORT).show()
            }

        }



        binding.registrationText.setOnClickListener {
            findNavController().navigate(R.id.action_loginFragment_to_registrationFragment)
        }


        return binding.root
    }

    private fun login(email: String, password: String) {
        auth.signInWithEmailAndPassword(email, password)
            .addOnCompleteListener { task ->
                if (task.isSuccessful) {
                    val intent = Intent(activity, MainActivity::class.java)
                    startActivity(intent)
                    activity?.finish()
                } else {
                        Toast.makeText(requireContext() , "Invalid Credentials" , Toast.LENGTH_SHORT).show()
                }
            }
    }








}