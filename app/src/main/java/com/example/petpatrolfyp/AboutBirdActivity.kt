package com.example.petpatrolfyp;

import android.app.Activity;
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class AboutBirdActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.aboutbirds)

        val button17: Button = findViewById<Button>(R.id.birdbreed)
        val button18: Button = findViewById<Button>(R.id.birddiet)

        button17.setOnClickListener {
            val intent = Intent(this, BirdBreedsActivity::class.java)
            startActivity(intent)
        }

        button18.setOnClickListener {
            val intent = Intent(this, BirdDietActivity::class.java)
            startActivity(intent)
        }

    }

}