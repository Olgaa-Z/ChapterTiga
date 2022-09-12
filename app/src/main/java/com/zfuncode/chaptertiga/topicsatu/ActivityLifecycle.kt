package com.zfuncode.chaptertiga.topicsatu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.zfuncode.chaptertiga.R
import kotlinx.android.synthetic.main.activity_lifecycle.*

class ActivityLifecycle : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lifecycle)
        textlifecycle.text = "OnCreate"
    }

    override fun onStart() {
        super.onStart()
        textlifecycle.append("\n onStart")
    }

    override fun onResume() {
        super.onResume()
        textlifecycle.append("\n onResume")
    }

    override fun onPause() {
        super.onPause()
        textlifecycle.append("\n onPause")
    }

    override fun onStop() {
        super.onStop()
        textlifecycle.append("\n onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        textlifecycle.append("\n onDestroy")
    }
}