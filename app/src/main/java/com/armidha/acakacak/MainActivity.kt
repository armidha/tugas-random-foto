package com.armidha.acakacak

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        acakBtn.setOnClickListener{randomPasangan()}
    }

    fun randomPasangan() {
        val randomCowo = Random().nextInt(5) + 1
        val randomCewe = Random().nextInt(5) + 1

        val listCowok = when (randomCowo) {
            1 -> R.drawable.co1
            2 -> R.drawable.co2
            3 -> R.drawable.co3
            4 -> R.drawable.co4
            else -> R.drawable.co5
        }

        val listCewek = when (randomCewe) {
            1 -> R.drawable.ce1
            2 -> R.drawable.ce2
            3 -> R.drawable.ce3
            4 -> R.drawable.ce4
            else -> R.drawable.ce5
        }
        gambar1.setImageResource(listCowok)
        gambar2.setImageResource(listCewek)
    }
}


