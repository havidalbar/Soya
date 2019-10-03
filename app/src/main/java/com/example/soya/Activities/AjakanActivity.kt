package com.example.soya.Activities

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.soya.R
import kotlinx.android.synthetic.main.activity_ajakan.*

class AjakanActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ajakan)

        button_lanjut_ajakan.setOnClickListener {
            val intent = Intent(this, MediaAir::class.java)
            startActivity(intent);
        }
    }
}
