package com.example.soya.Fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.soya.R

class ForumFragment : Fragment(){

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_forum, container,false)
    }

    companion object {
        fun newInstance(): ForumFragment{
            val fragment = ForumFragment()
            val args = Bundle()
            fragment.arguments = args
            return fragment
        }
    }
}