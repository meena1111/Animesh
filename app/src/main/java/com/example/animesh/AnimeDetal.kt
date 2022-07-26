package com.example.animesh

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class AnimeDetal : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_anime_detal)
        val anime = intent.getParcelableExtra<Anime>("anime")
        if (anime!=null){
            val textView : TextView = findViewById(R.id.anime_NameTv)
            val textView2 : TextView = findViewById(R.id.nameHeroTv)
            val textVie3 : TextView = findViewById(R.id.seriesTV)

            textView.text = anime.nameAnime
            textView2.text = anime.nameHero
            textVie3.text  = anime.series

        }
    }
}