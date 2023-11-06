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


        binding.animationView.playAnimation()
        binding.animationView.addAnimatorListener(object : Animator.AnimatorListener{
            override fun onAnimationStart(p0: Animator) {

            }

            override fun onAnimationEnd(p0: Animator) {
                startActivity(Intent(this@SlashScreenActivity , MainActivity::class.java))
                finish()
            }

            override fun onAnimationCancel(p0: Animator) {

            }

            override fun onAnimationRepeat(p0: Animator) {

            }
        })




        if (isInternetAvailable(this)){



        }else{
            Toast.makeText(this , "No Internet Connection" , Toast.LENGTH_SHORT).show()

        }



    }





    fun isInternetAvailable(context: Context): Boolean {
        val connectivityManager =
            context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager

        val network = connectivityManager.activeNetwork
        val capabilities = connectivityManager.getNetworkCapabilities(network)
        return (capabilities != null) && (capabilities.hasTransport(NetworkCapabilities.TRANSPORT_WIFI) || capabilities.hasTransport(
            NetworkCapabilities.TRANSPORT_CELLULAR
        ))
    }


}