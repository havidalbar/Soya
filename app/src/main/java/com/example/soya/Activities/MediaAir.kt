package com.example.soya.Activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.soya.R
import android.widget.Button
import android.content.Intent
import kotlinx.android.synthetic.main.activity_media_air.*


class MediaAir : AppCompatActivity() {


    private lateinit var buttonLanjutkan: Button;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_media_air)

        button_lanjut_faktor_air.setOnClickListener{
            startActivity(Intent(this, DataKolamActivity::class.java))
        }
    }
}
