package com.example.soya.Fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.soya.Adapters.ListKolamAdapter
import com.example.soya.R
import kotlinx.android.synthetic.main.fragment_beranda.*

data class KolamIkan(
    val jenisIkan: String,
    val namaAgen: String,
    val luasKolam: String,
    val lokasiKolam: String,
    val gambarIkan: String
)

class BerandaFragment : Fragment(){

    val kolamIkans: ArrayList<KolamIkan> = ArrayList()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_beranda, container,false)
    }

    companion object {
        fun newInstance(): BerandaFragment{
            val fragment = BerandaFragment()
            val args = Bundle()
            fragment.arguments = args
            return fragment
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        addKolamIkans()

        rv_kolam_list.apply {
            layoutManager = LinearLayoutManager(activity)
            adapter = ListKolamAdapter(kolamIkans)
        }
    }


    fun addKolamIkans() {
        kolamIkans.add(KolamIkan("Ikan Mas","Andi Ivan","200","Malang","ikanmas"))
        kolamIkans.add(KolamIkan("Ikan Nila","Antoni Iqbal","170","Malang","ikannila"))
        kolamIkans.add(KolamIkan("Ikan Lele","Iwan Nugroho","120","Malang","ikanlele"))
        kolamIkans.add(KolamIkan("Ikan Nila","Gunawan Adi","140","Malang","ikannila"))
    }

}