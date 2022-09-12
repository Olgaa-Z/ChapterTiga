package com.zfuncode.chaptertiga.topictiga

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.zfuncode.chaptertiga.R
import kotlinx.android.synthetic.main.fragment_satu.*

class FragmentSatu : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_satu, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btnKelas.setOnClickListener{
            val kelas = etKelas.text.toString()
            Toast.makeText(context, kelas, Toast.LENGTH_SHORT).show()
        }
    }
}