package com.example.soya.Activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.soya.R

class DaftarSebagai : AppCompatActivity() {

    private lateinit var buttonAgen: Button;
    private lateinit var buttonPembudidaya: Button;


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_daftar_sebagai)

        buttonAgen = findViewById(R.id.buttton_agenbudidaya)
        buttonPembudidaya = findViewById(R.id.button_pembudidaya)

        buttonAgen.setOnClickListener{
            startActivity(Intent(this, DaftarAgen::class.java))
        }
        buttonPembudidaya.setOnClickListener{
            startActivity(Intent(this, DaftarPembudidaya::class.java))
        }
    }
}
