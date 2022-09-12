package com.zfuncode.chaptertiga.topicsatu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.zfuncode.chaptertiga.R
import kotlinx.android.synthetic.main.activity_topic_satu.*

class TopicSatu : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_topic_satu)

        btnCallId.setOnClickListener(){
            startActivity(Intent(this, PemanggilanId::class.java))
        }

        btnActivityLifecycle.setOnClickListener{
            startActivity(Intent(this, ActivityLifecycle::class.java))
        }

        btnCs1.setOnClickListener(){
            startActivity(Intent(this,CaseStudy1::class.java ))
        }
    }
}