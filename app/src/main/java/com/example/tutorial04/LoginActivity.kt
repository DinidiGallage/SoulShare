package com.example.tutorial04

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class LoginActivity : AppCompatActivity() {


    lateinit var edtEmail: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val logInButton2 = findViewById<Button>(R.id.Login)
        logInButton2.setOnClickListener {
            val Intent = Intent(this, HomeActivity::class.java)
            startActivity(Intent)
        }

    }
}