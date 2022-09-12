package com.zfuncode.chaptertiga.topicdua

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.zfuncode.chaptertiga.R
import kotlinx.android.synthetic.main.activity_second.*

class ParsingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val dataMhs = intent.getParcelableExtra("mhspar") as MhsParcelable?
        val datMhs2 = intent.getSerializableExtra("mhsser") as MhsSerializable

        if (dataMhs != null){
            txtParsing.text = dataMhs.name
        }else if (datMhs2 != null){
            txtParsing.text = datMhs2.nama
        }

    }

    fun getParcelable(){

    }
    fun getSerializable(){

    }
}