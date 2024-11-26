package com.example.petpatrolfyp;

import android.app.Activity;
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class AboutDogActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.aboutdogs)

        val button19: Button = findViewById<Button>(R.id.dogbreed)
        val button20: Button = findViewById<Button>(R.id.dogdiet)

        button19.setOnClickListener {
            val intent = Intent(this, DogBreedsActivity::class.java)
            startActivity(intent)
        }

        button20.setOnClickListener {
            val intent = Intent(this, DogDietActivity::class.java)
            startActivity(intent)
        }

    }

}