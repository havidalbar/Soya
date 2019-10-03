package com.example.soya.Activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.soya.R

class TuntunanDetail2 : AppCompatActivity() {

    private lateinit var buttonKembali: Button;
    private lateinit var buttonLanjut: Button;


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tuntunan2)
        buttonLanjut = findViewById(R.id.buttonLanjut)
        buttonKembali = findViewById(R.id.buttonKembali)

        buttonLanjut.setOnClickListener{
            startActivity(Intent(this, TuntunanDetail3::class.java))
        }
        buttonKembali.setOnClickListener{
            startActivity(Intent(this, DaftarSebagai::class.java))
        }
    }
}
