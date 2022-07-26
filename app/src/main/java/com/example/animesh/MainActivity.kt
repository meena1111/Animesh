package com.example.animesh

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.util.ArrayList

class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var animeList: ArrayList<Anime>
    private lateinit var animeAdapter: AnimeAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(this)
        animeList = ArrayList()

        animeList.add(Anime("37", "Light","Death note"))
        animeList.add(Anime("60", "Kaneki"," Tokyo ghoul"))
        animeList.add(Anime("87", "Eren","Attack on Titan"))
        animeAdapter = AnimeAdapter(animeList)
        recyclerView.adapter =  animeAdapter

        animeAdapter.onItemClick = {
            val intent = Intent(this, AnimeDetal:: class.java)
            intent.putExtra("anime", it)
            startActivity(intent)
        }

    }
}