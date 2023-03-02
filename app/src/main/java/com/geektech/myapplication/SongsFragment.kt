package com.geektech.myapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.isGone
import com.geektech.myapplication.databinding.FragmentSongsBinding
import com.geektech.myapplication.databinding.ItemSongBinding

class SongsFragment : Fragment() {
    private lateinit var binding: FragmentSongsBinding
    private lateinit var adapter: SongAdapter
    private var list = arrayListOf<Songs>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSongsBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        loadData()
        adapter = SongAdapter(list,this::onClick)
        binding.recyclerView.adapter = adapter
    }

    private fun onClick (name:String){
        requireActivity().supportFragmentManager.findFragmentById(R.id.imageFragment)?.view?.isGone= true

        val bundle = Bundle()
        bundle.putString("name", name)
        val fragment = NameSongFragment()
        fragment.arguments = bundle
        requireActivity().supportFragmentManager.beginTransaction().replace(R.id.songsFragment, fragment).commit()

    }

    private fun loadData() {
        list.add(Songs("1","Komarovo", "Игорь Скляр"))
        list.add(Songs("2","Ножевой", "A.V.G"))
        list.add(Songs("2","Кукла", "Artik Asti"))
        list.add(Songs("2","Me gustats tu", "неизвестный исполнитель"))
        list.add(Songs("2","Get Lucky", "неизвестный исполнитель"))
        list.add(Songs("2","Судно", "неизвестный исполнитель"))

    }
}