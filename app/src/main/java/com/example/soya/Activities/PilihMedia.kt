package com.example.soya.Activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.soya.R
import kotlinx.android.synthetic.main.activity_pilih_media.*
import kotlinx.android.synthetic.main.fragment_beranda.*

class PilihMedia : AppCompatActivity() {

    private lateinit var buttonPilihTanah: Button;


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pilih_media)

        buttontanah.setOnClickListener {
            val intent = Intent(this, MediaTanah::class.java)
            startActivity(intent);
        }
        buttonterpal.setOnClickListener {
            val intent = Intent(this, MediaAir::class.java)
            startActivity(intent);
        }
    }
}
