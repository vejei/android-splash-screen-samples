package com.example.themeactivity

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // 不调用setContentView()

        startActivity(Intent(this, MainActivity::class.java))
        finish()
    }
}