package com.example.petpatrolfyp

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class AboutPetActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.aboutpet_activity)
        clickListener();
    }

    public fun clickListener() {
        var imageCat = findViewById<ImageView>(R.id.aboutcat);

        imageCat.setOnClickListener{
            openCatActivity()
        }

        var imageDog = findViewById<ImageView>(R.id.aboutdog);

        imageDog.setOnClickListener{
            openDogActivity()
        }

        var imageHamster = findViewById<ImageView>(R.id.abouthamster);

        imageHamster.setOnClickListener{
            openHamsterActivity()
        }


        var imageRabbit = findViewById<ImageView>(R.id.aboutrabbit);

        imageRabbit.setOnClickListener{
            openRabbitActivity()
        }

        var imageBird = findViewById<ImageView>(R.id.aboutbird);

        imageBird.setOnClickListener{
            openBirdActivity()
        }
    }

    public fun openCatActivity(){
        startActivity(Intent(this@AboutPetActivity, AboutCatActivity::class.java))
    }

    public fun openDogActivity(){
        startActivity(Intent (this@AboutPetActivity, AboutDogActivity::class.java))
    }

    public fun openHamsterActivity(){
        startActivity(Intent (this@AboutPetActivity, AboutHamsterActivity::class.java))
    }


    public fun openRabbitActivity(){
        startActivity(Intent (this@AboutPetActivity, AboutRabbitActivity::class.java))
    }

    public fun openBirdActivity(){
        startActivity(Intent (this@AboutPetActivity, AboutBirdActivity::class.java))
    }
}