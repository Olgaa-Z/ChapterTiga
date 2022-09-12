package com.zfuncode.chaptertiga.topicsatu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.zfuncode.chaptertiga.R
import kotlinx.android.synthetic.main.activity_case_study1.*

class CaseStudy1 : AppCompatActivity() {

    lateinit var editUmur : EditText
    lateinit var btnProses : Button
    lateinit var hasilRange : TextView
    lateinit var brand : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_case_study1)

        btnProses = findViewById(R.id.btnProsesUmur)
        hasilRange = findViewById(R.id.txtHasilUmur)
        editUmur = findViewById(R.id.edtUmur)

        btnProses.setOnClickListener{

            if (editUmur.text.toString().isEmpty()){
                editUmur.setError("Masukkan umur dahulu ! ")
            }else{
                var umur = editUmur.text.toString().toInt()
                if (umur in 0..13){
                    hasilRange.text = "Anda Masih Anak-anak"
                }else if( umur in 14..20){
                    hasilRange.text = "Anda sudah Remaja"
                } else if(umur in 20..35){
                    hasilRange.text = " Anda sudah Dewasa ! sadar woi !!!"
                }else{
                    hasilRange.text = "sudah lansia"
                }
            }


        }
    }

}