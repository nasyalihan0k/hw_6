package com.geektech.myapplication

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.geektech.myapplication.databinding.ItemSongBinding

class SongAdapter(private val list:ArrayList<Songs>, private val onClick: (name:String) -> Unit) : Adapter<SongAdapter.SongViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SongViewHolder {
        return SongViewHolder(ItemSongBinding.inflate(LayoutInflater.from(parent.context), parent, false))

    }

    override fun onBindViewHolder(holder: SongViewHolder, position: Int) {
        holder.bind(list[position])
    }

    override fun getItemCount(): Int {
        return list.size
    }


    inner class SongViewHolder(private val binding: ItemSongBinding) : ViewHolder(binding.root) {
        fun bind(songs: Songs) {
            binding.number.text = songs.number
            binding.name.text = songs.name
            binding.avtor.text = songs.avtor
            itemView.setOnClickListener {
                onClick(list[adapterPosition].name)
            }
        }
    }
}