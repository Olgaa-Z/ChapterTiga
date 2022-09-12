package com.zfuncode.chaptertiga.bottomnav

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.zfuncode.chaptertiga.R


class ChatFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_chat, container, false)
    }

//    override fun onCreateView(
//        inflater: LayoutInflater, container: ViewGroup?,
//        savedInstanceState: Bundle?
//    ): View? {
//        // Inflate the layout for this fragment
//        val view =  inflater.inflate(R.layout.fragment_layar_satu, container, false)
//        view.gotoscreen2.setOnClickListener { view.findNavController().navigate(R.id.action_layarSatu_to_layarDua)}
//
//        return view
//    }

}