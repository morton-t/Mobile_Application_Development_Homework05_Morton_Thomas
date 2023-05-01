package com.example.mad_ind05_morton_thomas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.mad_ind05_morton_thomas.databinding.ActivityMainBinding
import layout.StateDataModel
import layout.StateDataModel.statesCollection

class MainActivity() : AppCompatActivity() {
    var binding: ActivityMainBinding? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //Create a reference to the recycler view
        //val rv: RecyclerView = findViewById(R.id.statesRecyclerView)

        val adapter = RecyclerViewAdapter(StateDataModel.statesCollection)
        binding = ActivityMainBinding.inflate(layoutInflater)
        binding?.statesRecyclerView?.adapter = adapter

        adapter.setOnItemClickListener(object : RecyclerViewAdapter.OnItemClickListener {
            override fun onItemClick(position: Int) {
                //Toast.makeText(this@MainActivity, "Clicked: $position", Toast.LENGTH_LONG).show()

                //Create an intent to send the name of the state to the new activity
                val intent = Intent(this@MainActivity, StateInformation::class.java)
                intent.putExtra("name", statesCollection[position].name)
                startActivity(intent)
            }
        })

        setContentView(binding?.root)

//        var entry = findViewById<View>(R.id.stateName)
//
//        binding?.statesRecyclerView?.setOnClickListener {
//            val intent = Intent(this, StateInformation::class.java)
//            //intent.putExtra("name", entry.text)
//
//            startActivity(intent)
//        }
    }

    override fun onDestroy() {
        super.onDestroy()

        binding = null
    }
}