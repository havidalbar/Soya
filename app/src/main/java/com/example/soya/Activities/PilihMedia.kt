package com.example.soya.Activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.soya.R

class PilihMedia : AppCompatActivity() {

    private lateinit var buttonPilihTanah: Button;


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pilih_media)

        buttonPilihTanah = findViewById(R.id.buttontanah)

        buttonPilihTanah.setOnClickListener{
            startActivity(Intent(this, MediaTanah::class.java))
        }
    }
}
