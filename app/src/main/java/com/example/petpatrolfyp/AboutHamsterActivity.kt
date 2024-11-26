package com.example.petpatrolfyp;

import android.app.Activity;
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class AboutHamsterActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.abouthamsters)

        val button21: Button = findViewById<Button>(R.id.hambreed)
        val button22: Button = findViewById<Button>(R.id.hamdiet)

        button21.setOnClickListener {
            val intent = Intent(this, HamsterBreedsActivity::class.java)
            startActivity(intent)
        }

        button22.setOnClickListener {
            val intent = Intent(this, HamsterDietActivity::class.java)
            startActivity(intent)
        }

    }

}