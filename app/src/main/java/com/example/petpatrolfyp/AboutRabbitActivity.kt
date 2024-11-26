package com.example.petpatrolfyp;

import android.app.Activity;
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class AboutRabbitActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.aboutrabbits)

        val button23: Button = findViewById<Button>(R.id.rabbreed)
        val button24: Button = findViewById<Button>(R.id.rabdiet)

        button23.setOnClickListener {
            val intent = Intent(this, RabbitBreedsActivity::class.java)
            startActivity(intent)
        }

        button24.setOnClickListener {
            val intent = Intent(this, RabbitDietActivity::class.java)
            startActivity(intent)
        }

    }

}