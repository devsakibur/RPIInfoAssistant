package com.example.rpiassistant.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.rpiassistant.databinding.ActivityLibraryBinding
import com.google.firebase.FirebaseApp

class LibraryActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLibraryBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLibraryBinding.inflate(layoutInflater)
        setContentView(binding.root)
        FirebaseApp.initializeApp(this)

    }
}