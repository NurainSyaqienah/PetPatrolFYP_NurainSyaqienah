package com.example.petpatrolfyp;

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class ActivityVet : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.vet_activity)

        val button1: Button = findViewById<Button>(R.id.btn_johor)
        val button2: Button = findViewById<Button>(R.id.btn_kedah)
        val button3: Button = findViewById<Button>(R.id.btn_kelantan)
        val button4: Button = findViewById<Button>(R.id.btn_melaka)
        val button5: Button = findViewById<Button>(R.id.btn_negsem)
        val button6: Button = findViewById<Button>(R.id.btn_pahang)
        val button7: Button = findViewById<Button>(R.id.btn_penang)
        val button8: Button = findViewById<Button>(R.id.btn_perak)
        val button9: Button = findViewById<Button>(R.id.btn_perlis)
        val button10: Button = findViewById<Button>(R.id.btn_sabah)
        val button11: Button = findViewById<Button>(R.id.btn_selangor)
        val button12: Button = findViewById<Button>(R.id.btn_srwk)
        val button13: Button = findViewById<Button>(R.id.btn_trg)

        button1.setOnClickListener{
            val intent = Intent(this, JohorActivityVet::class.java)
            startActivity(intent)
        }
        button2.setOnClickListener{
            val intent = Intent(this, KedahActivityVet::class.java)
            startActivity(intent)
        }
        button3.setOnClickListener{
            val intent = Intent(this, KelantanActivityVet::class.java)
            startActivity(intent)
        }
        button4.setOnClickListener{
            val intent = Intent(this, MelakaActivityVet::class.java)
            startActivity(intent)
        }
        button5.setOnClickListener{
            val intent = Intent(this, NegsemActivityVet::class.java)
            startActivity(intent)
        }
        button6.setOnClickListener{
            val intent = Intent(this, PahangActivityVet::class.java)
            startActivity(intent)
        }
        button7.setOnClickListener{
            val intent = Intent(this, PenangActivityVet::class.java)
            startActivity(intent)
        }
        button8.setOnClickListener{
            val intent = Intent(this, PerakActivityVet::class.java)
            startActivity(intent)
        }
        button9.setOnClickListener{
            val intent = Intent(this, PerlisActivityVet::class.java)
            startActivity(intent)
        }
        button10.setOnClickListener{
            val intent = Intent(this, SabahActivityVet::class.java)
            startActivity(intent)
        }
        button11.setOnClickListener{
            val intent = Intent(this, SelangorActivityVet::class.java)
            startActivity(intent)
        }
        button12.setOnClickListener{
            val intent = Intent(this, SrwkActivityVet::class.java)
            startActivity(intent)
        }
        button13.setOnClickListener{
            val intent = Intent(this, TrgActivityVet::class.java)
            startActivity(intent)
        }


    }
}


