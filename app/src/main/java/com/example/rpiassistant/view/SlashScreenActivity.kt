package com.example.rpiassistant.view

import android.animation.Animator
import android.content.Context
import android.content.Intent
import android.net.ConnectivityManager
import android.net.NetworkCapabilities
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.rpiassistant.R
import com.example.rpiassistant.databinding.ActivitySlashScreenBinding

class SlashScreenActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySlashScreenBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySlashScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)





    }








}