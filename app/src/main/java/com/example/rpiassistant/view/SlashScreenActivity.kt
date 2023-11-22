package com.example.rpiassistant.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.rpiassistant.databinding.ActivitySlashScreenBinding

class SlashScreenActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySlashScreenBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySlashScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)





    }








}