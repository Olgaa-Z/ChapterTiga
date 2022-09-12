package com.zfuncode.chaptertiga.bottomnav

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.zfuncode.chaptertiga.R
import kotlinx.android.synthetic.main.activity_gojek.*

class GojekActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gojek)

        bottom_nav.setOnNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.menuhome -> {
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.fragment_frame, BerandaFragment())
                        .commit()
                    return@setOnNavigationItemSelectedListener true
                }
                R.id.menupesanan ->{
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.fragment_frame, PesananFragment())
                        .commit()
                    return@setOnNavigationItemSelectedListener true
                }
                R.id.menupromo ->{
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.fragment_frame, PromoFragment())
                        .commit()
                    return@setOnNavigationItemSelectedListener true
                }
                R.id.menuchat ->{
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.fragment_frame, ChatFragment())
                        .commit()
                    return@setOnNavigationItemSelectedListener true
                }

            }
            false
        }
    }
}