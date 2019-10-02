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
        rekomendasiIkan.add(RekomendasiIkan("Marjuki","02 Oktober 2019, 19:54","Bagaimana cara membersihkan kolam yang ada ikannya?","1","usermarjuki"))
        rekomendasiIkan.add(RekomendasiIkan("Siska","02 Oktober 2019, 11:42","Bagaimana cara membersihkan kolam yang ada ikannya?","3","usersiska"))
        rekomendasiIkan.add(RekomendasiIkan("Herman","30 September 2019, 18:39","Bagaimana cara membersihkan kolam yang ada ikannya?","5","userherman"))
        rekomendasiIkan.add(RekomendasiIkan("Dodi","28 September 2019, 20:14","Bagaimana cara membersihkan kolam yang ada ikannya?","2","userdodi"))
    }
}
