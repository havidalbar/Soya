package com.example.soya.Activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.soya.Adapters.ListRekomendasiIkanAdapter
import com.example.soya.R
import kotlinx.android.synthetic.main.activity_rekomendasi_ikan.*

data class RekomendasiIkan(
    val namaIkan: String,
    val jumlahPanen: String,
    val hargaJual: String,
    val tingkatBerhasil: String,
    val gambarIkan: String
)

class RekomendasiIkanActivity : AppCompatActivity() {

    val rekomendasiIkan: ArrayList<RekomendasiIkan> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rekomendasi_ikan)

        addRekomendasiIkans()

        rv_rekomendasi_ikan_list.apply {
            layoutManager = LinearLayoutManager(context)
            adapter = ListRekomendasiIkanAdapter(rekomendasiIkan)
        }
    }

    fun addRekomendasiIkans() {
        rekomendasiIkan.add(RekomendasiIkan("Ikan Lele","500","25.000","Tinggi","ikanlele"))
        rekomendasiIkan.add(RekomendasiIkan("Ikan Nila","330","30.000","Sedang","ikannila"))
        rekomendasiIkan.add(RekomendasiIkan("Ikan Mas","410","40.000","Sedang","ikanmas"))
        rekomendasiIkan.add(RekomendasiIkan("Ikan Gurame","290","60.000","Sedang","ikangurame"))
    }
}
