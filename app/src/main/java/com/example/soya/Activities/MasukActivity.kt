package com.example.soya.Activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.widget.Button
import com.example.soya.R


class MasukActivity : AppCompatActivity() {


    private lateinit var buttonMasuk: Button;


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_masuk)

        buttonMasuk = findViewById(R.id.button)

        buttonMasuk.setOnClickListener{
            startActivity(Intent(this, OtpActivity::class.java))
        }


    }


}
