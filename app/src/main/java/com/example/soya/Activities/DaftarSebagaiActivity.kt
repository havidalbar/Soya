package com.example.soya.Activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.soya.R

class DaftarSebagaiActivity : AppCompatActivity() {

    private lateinit var buttonAgen: Button;


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_daftar_sebagai)

        buttonAgen = findViewById(R.id.buttton_agenbudidaya)

        buttonAgen.setOnClickListener{
            startActivity(Intent(this, DaftarAgenActivity::class.java))
        }
    }
}
