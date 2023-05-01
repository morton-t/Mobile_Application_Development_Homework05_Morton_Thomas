package com.example.mad_ind05_morton_thomas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import layout.StateDataModel.statesAreas

class StateInformation : AppCompatActivity() {
    var fetchedName: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_state_information)

        //Fetch the state information passed by intent
        fetchedName = intent.getStringExtra("name")
        val fetchedArea = statesAreas.get(fetchedName)

        //Format the name to align with our assets
        val formattedName = fetchedName?.lowercase()?.replace(' ', '_')
        val flagImageName = formattedName + "_flag"
        val stateImageName = "$formattedName"

        print("\n\n $flagImageName \t $stateImageName \n\n")

        //Gets the resources for the views
        val stateTitle: TextView = findViewById(R.id.genericStateNameLabel)
        val stateArea: TextView = findViewById(R.id.stateAreaTextView)
        val stateFlag: ImageView = findViewById(R.id.stateFlagImageView)
        val stateOutline: ImageView = findViewById(R.id.stateOutlineImageView)

        //Get the resources for images by image name

        val flagID = resources.getIdentifier(flagImageName, "drawable", this.packageName)
        val outlineID = resources.getIdentifier(stateImageName, "drawable", this.packageName)

        //Sets the labels and images
        stateTitle.text = fetchedName
        stateArea.text = "$fetchedArea square miles"
        stateFlag.setImageResource(flagID)
        stateOutline.setImageResource(outlineID)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }

    override fun onSupportNavigateUp(): Boolean {
        finish()
        return super.onSupportNavigateUp()
    }
}