package com.example.soya

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent;
import android.os.Handler;

class MainActivity : AppCompatActivity() {
    private val waktuloading = 3000


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Handler().postDelayed(Runnable {
            //setelah loading maka akan langsung berpindah ke home activity
            val welcome = Intent(this, Welcome::class.java)
            startActivity(welcome)
            finish()
        }, waktuloading.toLong())

    }
}