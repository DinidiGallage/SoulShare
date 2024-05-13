package com.example.tutorial04

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val getStartedButton = findViewById<Button>(R.id.button2)
        getStartedButton.setOnClickListener {
            val Intent = Intent(this, LaunchActivity::class.java)
            startActivity(Intent)
        }
         }
    }
