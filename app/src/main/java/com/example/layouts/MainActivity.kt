package com.example.layouts

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
         val submit: Button =findViewById(R.id.submitButton)
        val user: EditText =findViewById(R.id.username)

        submit.setOnClickListener {
            val username = user.text.toString()
            if (username.isEmpty()) {
                Toast.makeText(this, "Please enter a username", Toast.LENGTH_SHORT).show();
            }
            else{
                Toast.makeText(this, "Welcome $username", Toast.LENGTH_SHORT).show();
            }

        }




    }
}