package com.zfuncode.chaptertiga.topicdua

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.zfuncode.chaptertiga.R
import kotlinx.android.synthetic.main.activity_topic_dua.*

class TopicDua : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_topic_dua)

        btnIntent.setOnClickListener{
            startActivity(Intent(this, IntentActivity::class.java))
        }

        btnBundle.setOnClickListener{
            startActivity(Intent(this, BundleActivity::class.java))
        }

        btnImplicit.setOnClickListener{
            startActivity(Intent(this, ImplicitIntent::class.java))
        }

        parsingSerializable()
        parsingParcelable()

    }

    fun parsingSerializable(){
        btnSerializable.setOnClickListener{
            val pindah = Intent(this, ParsingActivity::class.java)
            val dataMhs = MhsSerializable("iko","1234567", jruusan = "Informatika")
            pindah.putExtra("mhsser",dataMhs)
            startActivity(pindah)
        }

    }

    fun parsingParcelable(){
        btnParcelable.setOnClickListener{
            val pindah = Intent(this, ParsingActivity::class.java)
            val mhs = MhsParcelable(name = "hendra", nim= "357632", jurusan = "Agroteknologi")
            pindah.putExtra("mhspar", mhs)
            startActivity(pindah)
        }
    }
}