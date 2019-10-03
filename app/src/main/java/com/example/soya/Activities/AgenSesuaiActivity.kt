package com.example.soya.Activities

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.soya.R
import kotlinx.android.synthetic.main.activity_agen_sesuai.*

class AgenSesuaiActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_agen_sesuai)

        button_lanjut_agen_sesuai.setOnClickListener {
            val intent = Intent(this, AjakanActivity::class.java)
            startActivity(intent);
        }
    }
}
