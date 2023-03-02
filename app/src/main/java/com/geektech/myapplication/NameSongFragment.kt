package com.geektech.myapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.geektech.myapplication.databinding.FragmentNameSongBinding

class NameSongFragment : Fragment() {

    private lateinit var binding: FragmentNameSongBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentNameSongBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val result = arguments?.getString("name")
        binding.result.text = result
    }
}