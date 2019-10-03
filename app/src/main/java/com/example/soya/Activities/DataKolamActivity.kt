package com.example.soya.Activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.soya.R
import kotlinx.android.synthetic.main.activity_data_kolam.*

class DataKolamActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_data_kolam)


        button_lanjut_data_kolam.setOnClickListener {
            val intent = Intent(this, RekomendasiIkanActivity::class.java)
            startActivity(intent);
        }
    }
}
