package com.example.areca

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.Toast
import androidx.cardview.widget.CardView
import com.example.areca.R

class HomeActivityActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_homepage)

        // register all the ImageButtons with their appropriate IDs
        val logOutB: ImageButton = findViewById(R.id.logoutB)
        val profileB: ImageButton = findViewById(R.id.profileB)

        // register all the Buttons with their appropriate IDs
       // val editProfileB: Button = findViewById(R.id.editProfileB)

        // register all the card views with their appropriate IDs
//        val contributeCard: CardView = findViewById(R.id.contributeCard)
//        val designCard: CardView = findViewById(R.id.desi)
//        val learnCard: CardView = findViewById(R.id.learnCard)
//        val profileCard: CardView = findViewById(R.id.profileCard)
//        val helpCard: CardView = findViewById(R.id.helpCard)
//        val settingsCard: CardView = findViewById(R.id.settingsCard)


        // handle each of the image buttons with the OnClickListener
//        editProfileB.setOnClickListener {
//            Toast.makeText(this, "Back Button", Toast.LENGTH_SHORT).show()
//        }
        logOutB.setOnClickListener {
            Toast.makeText(this, "Logout Button", Toast.LENGTH_SHORT).show()
        }
        profileB.setOnClickListener {
            Toast.makeText(this, "Profile Image", Toast.LENGTH_SHORT).show()
        }


        // handle each of the buttons with the OnClickListener
        logOutB.setOnClickListener {
            Toast.makeText(this, "LOGOUT", Toast.LENGTH_SHORT).show()
        }
//        editProfileB.setOnClickListener {
//            Toast.makeText(this, "Editing Profile", Toast.LENGTH_SHORT).show()
//        }


        // handle each of the cards with the OnClickListener
//        contributeCard.setOnClickListener {
//            Toast.makeText(this, "Contribute Articles", Toast.LENGTH_SHORT).show()
//        }
//        profileCard.setOnClickListener {
//            Toast.makeText(this, "Practice Programming", Toast.LENGTH_SHORT).show()
//        }
//        learnCard.setOnClickListener {
//            Toast.makeText(this, "Learn Programming", Toast.LENGTH_SHORT).show()
//        }
//        designCard.setOnClickListener {
//            Toast.makeText(this, "Filter your Interests", Toast.LENGTH_SHORT).show()
//        }
//        helpCard.setOnClickListener {
//            Toast.makeText(this, "Anything Help you want?", Toast.LENGTH_SHORT).show()
//        }
//        settingsCard.setOnClickListener {
//            Toast.makeText(this, "Change the settings", Toast.LENGTH_SHORT).show()
//        }
    }
}
