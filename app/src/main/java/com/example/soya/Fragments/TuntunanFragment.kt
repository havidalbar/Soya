package com.example.soya.Fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.soya.Adapters.ListTuntunanAdapter
import com.example.soya.R
import kotlinx.android.synthetic.main.fragment_tuntunan.*

data class TuntunanBudidaya(
    val judulTuntunan: String,
    val deskripsiTuntunan: String,
    val gambarTuntunan: String
)

class TuntunanFragment : Fragment() {

    val tuntunanBudidayas: ArrayList<TuntunanBudidaya> = ArrayList()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_tuntunan, container,false)
    }

    companion object {
        fun newInstance(): TuntunanFragment{
            val fragment = TuntunanFragment()
            val args = Bundle()
            fragment.arguments = args
            return fragment
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        addTuntunanBudidayas()

        rv_tuntunan_budidaya_list.apply {
            layoutManager = LinearLayoutManager(activity)
            adapter = ListTuntunanAdapter(tuntunanBudidayas)
        }
    }


    fun addTuntunanBudidayas() {
        tuntunanBudidayas.add(TuntunanBudidaya("Pemilihan Bibit Ikan","Tuntunan mengelola air yang akan digunakan di kolam anda","tuntunanbibit"))
        tuntunanBudidayas.add(TuntunanBudidaya("Pemberian Pakan Ikan","Tuntunan mengelola air yang akan digunakan di kolam anda","tuntunanpakan"))
        tuntunanBudidayas.add(TuntunanBudidaya("Pembersihan Kolam Ikan","Tuntunan mengelola air yang akan digunakan di kolam anda","tuntunanpembersihankolam"))
        tuntunanBudidayas.add(TuntunanBudidaya("Pengelolaan Air","Tuntunan mengelola air yang akan digunakan di kolam anda","tuntunanpengelolaanair"))
    }

}