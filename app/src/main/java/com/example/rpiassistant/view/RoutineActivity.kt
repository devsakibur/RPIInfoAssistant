package com.example.rpiassistant.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.rpiassistant.databinding.ActivityRoutineBinding

class RoutineActivity : AppCompatActivity() {
    private lateinit var binding: ActivityRoutineBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityRoutineBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}