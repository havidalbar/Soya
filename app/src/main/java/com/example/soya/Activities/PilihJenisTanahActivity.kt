package com.example.soya.Activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.soya.Adapters.ListPilihJenisTanahAdapter
import com.example.soya.R
import kotlinx.android.synthetic.main.activity_pilih_jenis_tanah.*

data class PilihJenisTanah(
    val namaJenisTanah: String,
    val gambarJenisTanah: String
)

class PilihJenisTanahActivity : AppCompatActivity() {

    val pilihJenisTanah: ArrayList<PilihJenisTanah> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pilih_jenis_tanah)

        addRekomendasiIkans()

        rv_jenis_tanah_list.apply {
            layoutManager = LinearLayoutManager(context)
            adapter = ListPilihJenisTanahAdapter(pilihJenisTanah)
        }

        button_lanjut_jenis_tanah.setOnClickListener {
            val intent = Intent(this, MediaAir::class.java)
            startActivity(intent);
        }
    }

    fun addRekomendasiIkans() {
        pilihJenisTanah.add(PilihJenisTanah("Tanah Liat","tanahliat"))
        pilihJenisTanah.add(PilihJenisTanah("Tanah Berpasir","tanahberpasir"))
    }
}
