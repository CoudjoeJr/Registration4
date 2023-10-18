package com.example.registration4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class BirdLensActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bird_lens)

        supportActionBar?.hide()

        Handler().postDelayed({
            val intent = Intent(this@BirdLensActivity, BirdingHotspot::class.java)
            startActivity(intent)
            finish()
        }, 3000)
    }
}