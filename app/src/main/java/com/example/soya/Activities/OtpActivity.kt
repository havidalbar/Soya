package com.example.soya.Activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.soya.R
import android.widget.Button
import android.content.Intent




class OtpActivity : AppCompatActivity() {


    private lateinit var buttonVerif: Button;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_otp)

        buttonVerif = findViewById(R.id.button)

        buttonVerif.setOnClickListener{
            startActivity(Intent(this, HomeActivity::class.java))
        }
    }
}
