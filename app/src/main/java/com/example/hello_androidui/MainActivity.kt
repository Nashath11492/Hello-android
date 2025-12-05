package com.example.hello_androidui

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Find the button by its ID
        val clickButton: Button = findViewById(R.id.btnClickMe)

        // Set click listener on the button
        clickButton.setOnClickListener {
            // Show toast message when button is clicked
            Toast.makeText(
                this,
                "Hello! Button Clicked!",
                Toast.LENGTH_SHORT
            ).show()
        }
    }
}