package com.zfuncode.chaptertiga.topicdua

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.zfuncode.chaptertiga.R

class IntentActivity : AppCompatActivity() {
    lateinit var editTextNama : EditText
    lateinit var editTextTahun : EditText
    lateinit var btnExplicit : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent)

//        inisialisasi variable global
        editTextNama = findViewById(R.id.edtNamaintent)
        editTextTahun = findViewById(R.id.edtTahunLahir)
        btnExplicit = findViewById(R.id.btnExplicit)

//        pemanggilan function
        contohExplicitIntent()


    }

//    blok kodingan untuk explicit Intnet seklaigus bawa data ke activity lain
//    key - value
    fun contohExplicitIntent(){
        btnExplicit.setOnClickListener{
            var nama = editTextNama.text.toString()
            var tahunlahir = editTextTahun.text.toString()
            val pindah = Intent(this, ExplicitIntent::class.java)
            pindah.putExtra("nama", nama)
            pindah.putExtra("tahunlahir", tahunlahir)
            startActivity(pindah)
        }
    }

    fun contohImplicitIntent(){

    }
}