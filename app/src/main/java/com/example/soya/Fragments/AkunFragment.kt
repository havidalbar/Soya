package com.example.soya.Fragments

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.soya.Activities.Masuk
import com.example.soya.Activities.PilihMedia
import com.example.soya.Activities.Welcome
import com.example.soya.Adapters.ListKolamAdapter
import com.example.soya.R
import kotlinx.android.synthetic.main.fragment_akun.*
import kotlinx.android.synthetic.main.fragment_beranda.*

class AkunFragment : Fragment(){

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_akun, container,false)
    }

    companion object {
        fun newInstance(): AkunFragment{
            val fragment = AkunFragment()
            val args = Bundle()
            fragment.arguments = args
            return fragment
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        button_keluar_akun.setOnClickListener {
            val intent = Intent(context, Welcome::class.java)
            startActivity(intent);
        }
    }
}