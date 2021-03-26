package com.dogancanemek.cognizantassignment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class ListviewActivity : AppCompatActivity() {

    private lateinit var listView: ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_listview)

        listView = findViewById(R.id.listView)

        val avengers = ArrayList<String>()

        avengers.add("Iron Man")
        avengers.add("Captain America")
        avengers.add("Thor")
        avengers.add("Hulk")
        avengers.add("Black Widow")
        avengers.add("Hawkeye")
        avengers.add("Scarlett Witch")
        avengers.add("Vision")
        avengers.add("Falcon")
        avengers.add("Winter Soldier")
        avengers.add("Spider Man")
        avengers.add("Doctor Strange")
        avengers.add("Star Lord")
        avengers.add("Ant Man")
        avengers.add("Wasp")

        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, avengers)
        listView.adapter = adapter

    }
}