package com.example.tutorial04

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class EditProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_profile)

        val backToProfileButton = findViewById<Button>(R.id.button7)
        backToProfileButton.setOnClickListener {
            val Intent = Intent(this, ProfileActivity::class.java)
            startActivity(Intent)
        }
    }
}