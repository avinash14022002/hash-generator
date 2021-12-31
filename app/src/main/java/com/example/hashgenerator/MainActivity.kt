package com.example.hashgenerator

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.Navigation.findNavController

class MainActivity : AppCompatActivity() {
    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTheme(R.style.Theme_HashGenerator)
        setContentView(R.layout.activity_main)

        setFullscreen()

        navController = findNavController(R.id.fragment)
        setupActionBarWithNavController(navController)
    }

    private fun setFullscreen() {
        hideActionBar()
    }

    override fun onSupportNavigateUp(): Boolean {
        return navController.navigateUp() || super.onSupportNavigateUp()
    }
}