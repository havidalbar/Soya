package com.example.soya.Activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.FrameLayout
import androidx.fragment.app.Fragment
import com.example.soya.Fragments.*
import com.example.soya.R
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.activity_tuntunan.*

class TuntunanActivity : AppCompatActivity() {

    private var fragment_tuntunan_container: FrameLayout? = null

    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.navigasi_tuntunan -> {
                val fragment = TuntunanFragment.newInstance()
                addFragment(fragment)
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigasi_konsultasi -> {
                val fragment = KonsultasiFragment()
                addFragment(fragment)
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigasi_pantau -> {
                val fragment = PantauFragment()
                addFragment(fragment)
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigasi_forum -> {
                val fragment = ForumFragment()
                addFragment(fragment)
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigasi_hasil -> {
                val fragment = HasilFragment()
                addFragment(fragment)
                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }

    private fun addFragment(fragment: Fragment) {
        supportFragmentManager
            .beginTransaction()
            .setCustomAnimations(
                R.anim.design_bottom_sheet_slide_in,
                R.anim.design_bottom_sheet_slide_out
            )
            .replace(R.id.fragment_tuntunan_container, fragment, fragment.javaClass.getSimpleName())
            .commit()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tuntunan)
        bn_navigasi_tuntunan.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)
        val fragment = TuntunanFragment.newInstance()
        addFragment(fragment)
    }
}
