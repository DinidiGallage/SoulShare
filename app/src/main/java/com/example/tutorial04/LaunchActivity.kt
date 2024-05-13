package com.example.tutorial04

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class LaunchActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_launch)

        val logInButton = findViewById<Button>(R.id.button3)
        logInButton.setOnClickListener {
            val Intent = Intent(this, LoginActivity::class.java)
            startActivity(Intent)
        }

        val signUpButton = findViewById<Button>(R.id.button4)
        signUpButton.setOnClickListener {
            val Intent = Intent(this, SignUpActivity::class.java)
            startActivity(Intent)
        }

    }
}
