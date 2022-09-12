package com.zfuncode.chaptertiga.RecyclerView

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.zfuncode.chaptertiga.R
import kotlinx.android.synthetic.main.activity_detail_student.*

class DetailStudent : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_student)

        val detail = intent.getSerializableExtra("detail")as StudentData
        Log.d("infodetail", detail.toString())
        nimDetail.text = detail.nim
        namaDetail.text = detail.nama
        imgDetail.setImageResource(detail.img)
    }
}