package com.example.hashgenerator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import com.example.hashgenerator.databinding.ActivitySpalshBinding

class SplashActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySpalshBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySpalshBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        val secondsDelayed = 3
        Handler().postDelayed({
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }, (secondsDelayed * 1000).toLong())
    }
}