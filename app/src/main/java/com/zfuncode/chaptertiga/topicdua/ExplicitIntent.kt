package com.zfuncode.chaptertiga.topicdua

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.zfuncode.chaptertiga.R
import kotlinx.android.synthetic.main.activity_explicit.*

class ExplicitIntent : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_explicit)

//        ambilDataIntent()
        ambilDataBundle()
    }

    fun ambilDataIntent(){
//        cara ambil data dari activity yang mengirimkan data
        var nama = intent.getStringExtra("nama")
        var tahunLahir = intent.getStringExtra("tahunlahir")

//        set data ke view
        getNama.text = nama
        getUmur.text = "anda lahir pada tahun " + tahunLahir
    }

    fun ambilDataBundle(){
        var nilai = intent.extras
        getNilai.setText(nilai?.getString("nilai"))
    }
}