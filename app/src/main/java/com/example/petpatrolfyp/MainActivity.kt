package com.example.petpatrolfyp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        clickListener();

    }

    public fun clickListener() {
        var imageAbout = findViewById<ImageView>(R.id.aboutpets);

        imageAbout.setOnClickListener{
            openAboutActivity()
        }

        var imageAdopt = findViewById<ImageView>(R.id.aboutadopt);

        imageAdopt.setOnClickListener{
            openAdoptActivity()
        }

        var imageVet = findViewById<ImageView>(R.id.aboutvet);

        imageVet.setOnClickListener{
            openActivityVet()
        }


        var imageUser = findViewById<ImageView>(R.id.aboutuser);

        imageUser.setOnClickListener{
            openUserActivity()
        }

        var imageContact = findViewById<ImageView>(R.id.aboutcontact);

        imageContact.setOnClickListener{
            openContactActivity()
        }
    }

    public fun openAboutActivity(){
        startActivity(Intent(this@MainActivity, AboutPetActivity::class.java))
    }

    public fun openAdoptActivity(){
        startActivity(Intent (this@MainActivity, AboutAdoptActivity::class.java))
    }

    public fun openActivityVet(){
        startActivity(Intent (this@MainActivity, ActivityVet::class.java))
    }

    public fun openEntActivity(){
        startActivity(Intent (this@MainActivity, AboutEntActivity::class.java))
    }

    public fun openUserActivity(){
        startActivity(Intent (this@MainActivity, AboutUserActivity::class.java))
    }

    public fun openContactActivity(){
        startActivity(Intent (this@MainActivity, AboutContactActivity::class.java))
    }
}
