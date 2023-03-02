package com.geektech.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportFragmentManager.beginTransaction().add(R.id.imageFragment, ImageFragment()).commit()
        supportFragmentManager.beginTransaction().add(R.id.songsFragment, SongsFragment()).commit()
    }
}