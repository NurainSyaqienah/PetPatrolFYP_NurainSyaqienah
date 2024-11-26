package com.example.petpatrolfyp;

import android.app.Activity;
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class AboutCatActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.aboutcats)

        val button14: Button = findViewById<Button>(R.id.catbreed)
        val button15: Button = findViewById<Button>(R.id.catdiet)
        val button16: Button = findViewById<Button>(R.id.catfood)

        button14.setOnClickListener {
            val intent = Intent(this, CatBreedsActivity::class.java)
            startActivity(intent)
        }

        button15.setOnClickListener {
            val intent = Intent(this, CatDietActivity::class.java)
            startActivity(intent)
        }

        button16.setOnClickListener {
            val intent = Intent(this, CatFoodActivity::class.java)
            startActivity(intent)
        }

    }
}