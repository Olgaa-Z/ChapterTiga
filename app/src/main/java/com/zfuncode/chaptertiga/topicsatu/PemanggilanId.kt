package com.zfuncode.chaptertiga.topicsatu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar
import com.zfuncode.chaptertiga.R
import kotlinx.android.synthetic.main.activity_pemanggilan_id.*

class PemanggilanId : AppCompatActivity() {

    lateinit var editNama : EditText
    lateinit var txtNama : TextView
    lateinit var btnNama : Button

    lateinit var klikSaya2 : Button
    lateinit var hasilKlik : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pemanggilan_id)

        var klikSaya1 = findViewById(R.id.btnKlikSaya1) as Button
        klikSaya2 = findViewById(R.id.btnKlikSaya2)
        hasilKlik = findViewById(R.id.textKlikSaya)

        editNama= findViewById(R.id.edtNama)
        txtNama = findViewById(R.id.textNama)
        btnNama = findViewById(R.id.btnProsesNama)

        klikSaya1.setOnClickListener{
            hasilKlik.text = "Terima Kasih sudah klik saya :)"
        }

        klikSaya2.setOnClickListener(){
            hasilKlik.text = "ini Hasil klik button 2"
        }

        btnKlikSaya3.setOnClickListener(){
            hasilKlik.text = "Ini hasil Klik Button 3 :) "
        }

        btnNama.setOnClickListener(){
            var ambilNama = editNama.text.toString()
            txtNama.text = ambilNama
        }

        contohToast()
        contohSnackbar()
    }

    fun contohToast(){
        btnToast.setOnClickListener{
            Toast.makeText(this, "ini hasil dari button Toast", Toast.LENGTH_SHORT).show()
        }
    }

    fun contohSnackbar(){
        btnSnackbar.setOnClickListener{
            Snackbar.make(it, "ini contoh button Snackbar", Snackbar.LENGTH_LONG).show()
        }
        btnSnackbar2.setOnClickListener{
            val snack = Snackbar.make(it, "this is the second Snackn=bar example", Snackbar.LENGTH_LONG)
            snack.setAction("Dismiss", View.OnClickListener {
                System.out.println("oke ! dismiss")
            })

            snack.show()
        }

    }
}