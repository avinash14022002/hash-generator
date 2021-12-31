package com.example.hashgenerator

import androidx.appcompat.app.AppCompatActivity

fun AppCompatActivity.hideActionBar() {
    if (supportActionBar != null) {
        supportActionBar!!.hide()
    }
}