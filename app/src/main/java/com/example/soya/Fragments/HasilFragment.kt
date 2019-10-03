package com.example.soya.Fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.soya.R

class HasilFragment: Fragment(){

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_hasil, container,false)
    }

    companion object {
        fun newInstance(): HasilFragment{
            val fragment = HasilFragment()
            val args = Bundle()
            fragment.arguments = args
            return fragment
        }
    }
}