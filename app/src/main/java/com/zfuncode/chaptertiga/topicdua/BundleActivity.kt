package com.zfuncode.chaptertiga.topicdua

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.zfuncode.chaptertiga.R
import kotlinx.android.synthetic.main.activity_bundle.*

class BundleActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bundle)

        btnSaveBundle.setOnClickListener{
            val nilai = edtNilai.text.toString()
            val pindah = Intent(this, ExplicitIntent::class.java)
            val bundle = Bundle()
            bundle.putString("nilai", nilai)
//            Bundle().putString("nilai",nilai) kalo pake ini langsung cuman 1 yg bisa kekirim
            pindah.putExtras(bundle)
            startActivity(pindah)
        }
    }


}