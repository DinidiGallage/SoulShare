package com.example.tutorial04

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        val backButton = findViewById<Button>(R.id.button6)
        backButton.setOnClickListener {
            val Intent = Intent(this, HomeActivity::class.java)
            startActivity(Intent)
        }

        val editButton = findViewById<Button>(R.id.button5)
        editButton.setOnClickListener {
            val Intent = Intent(this, EditProfileActivity::class.java)
            startActivity(Intent)
        }

    }
}