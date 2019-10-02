package com.example.soya

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Welcome : AppCompatActivity() {

    private lateinit var buttonMasuk: Button;
    private lateinit var buttonDaftar: Button;


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)
        buttonMasuk = findViewById(R.id.buttonmasuk)
        buttonDaftar = findViewById(R.id.buttondaftar)

        buttonMasuk.setOnClickListener{
            startActivity(Intent(this, MasukActivity::class.java))
        }
        buttonDaftar.setOnClickListener{
            startActivity(Intent(this, DaftarSebagai::class.java))
        }
    }
}
