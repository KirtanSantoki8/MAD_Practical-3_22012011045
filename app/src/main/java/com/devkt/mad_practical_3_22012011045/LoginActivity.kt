package com.devkt.mad_practical_3_22012011045

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class LoginActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val email = intent.getStringExtra("email")
        val pwd = intent.getStringExtra("password")
        val emailIp = findViewById<EditText>(R.id.emailinput)
        val pwdIp = findViewById<EditText>(R.id.pwdinput)
        val loginbtn = findViewById<Button>(R.id.loginbtn)
        loginbtn.setOnClickListener {
            val emailinput = emailIp.text.toString()
            if (emailinput.isBlank()) {
                Toast.makeText(this, "Enter your email", Toast.LENGTH_SHORT).show()
            }
            val pwdinput = pwdIp.text.toString()
            if (pwdinput.isBlank()) {
                Toast.makeText(this, "Enter your password", Toast.LENGTH_SHORT).show()
            }
        }
    }
}