package com.example.soya

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent;
import android.os.Handler;
import android.R.id.home




class MainActivity : AppCompatActivity() {
    private val waktuloading = 4000

    //4000=4 detik

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Handler().postDelayed(Runnable {
            //setelah loading maka akan langsung berpindah ke home activity
            val home = Intent(this@MainActivity, HomeActivity::class.java)
            startActivity(home)
            finish()
        }, waktuloading.toLong())
    }
}
