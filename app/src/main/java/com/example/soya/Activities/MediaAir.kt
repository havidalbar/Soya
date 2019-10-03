package com.example.soya.Activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.soya.R
import android.widget.Button
import android.content.Intent




class MediaAir : AppCompatActivity() {


    private lateinit var buttonLanjutkan: Button;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_media_air)

        buttonLanjutkan = findViewById(R.id.button)

        buttonLanjutkan.setOnClickListener{
            startActivity(Intent(this, Home::class.java))
        }
    }
}
