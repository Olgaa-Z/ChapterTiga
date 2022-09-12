package com.zfuncode.chaptertiga.topictiga

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.zfuncode.chaptertiga.R
import kotlinx.android.synthetic.main.activity_main_fragment.*

class MainFragmentActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_fragment)


//        supportFragmentManager.beginTransaction().apply {
//            replace(R.id.flFragment, FragmentSatu())
//            commit()
//        }

        btnFr1.setOnClickListener{
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.flFragment, FragmentSatu())
                commit()
            }
        }

        btnFr2.setOnClickListener{
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.flFragment, FragmentDua())
                commit()
            }
        }

    }
}