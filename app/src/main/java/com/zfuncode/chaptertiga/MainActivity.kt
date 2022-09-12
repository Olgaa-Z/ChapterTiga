package com.zfuncode.chaptertiga

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.zfuncode.chaptertiga.topicdua.TopicDua
import com.zfuncode.chaptertiga.topicsatu.TopicSatu
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnTopicSatu.setOnClickListener(){
            startActivity(Intent(this, TopicSatu::class.java))
        }

        btnTopicDua.setOnClickListener{
            startActivity(Intent(this, TopicDua::class.java))
        }





    }
}