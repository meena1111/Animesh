package com.example.animesh

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import java.util.ArrayList

class AnimeAdapter(private val animeList: ArrayList<Anime>)
    : RecyclerView.Adapter<AnimeAdapter.AnimeViewHolder>(){
    var onItemClick : ((Anime) -> Unit)? = null

    class AnimeViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val textView: TextView = itemView.findViewById(R.id.textView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AnimeViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.anime_item, parent,false)
        return AnimeViewHolder(view)
    }

    override fun onBindViewHolder(holder: AnimeViewHolder, position: Int) {
        val anime = animeList[position]
        holder.textView.text = anime.nameAnime
        holder.textView.text = anime.nameHero
        holder.textView.text = anime.series

        holder.itemView.setOnClickListener{
            onItemClick?.invoke(anime)

        }


    }

    override fun getItemCount(): Int {
        return animeList.size
    }
}