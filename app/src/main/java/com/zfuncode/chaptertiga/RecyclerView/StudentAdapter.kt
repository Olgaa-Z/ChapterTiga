package com.zfuncode.chaptertiga.RecyclerView

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.zfuncode.chaptertiga.R

class StudentAdapter(val listStudent : ArrayList<StudentData>): RecyclerView.Adapter<StudentAdapter.ViewHolder>() {


    var onClick : ((StudentData) -> Unit)? = null

// ini tempat untuk id yg ada di layput adapter
    class ViewHolder(view : View): RecyclerView.ViewHolder(view) {
        var namaStudent = view.findViewById<TextView>(R.id.txtNamaStudent)
        var nim = view.findViewById<TextView>(R.id.txtNim)
        var imgStudent = view.findViewById<ImageView>(R.id.imgStudent)
        var card = view.findViewById<CardView>(R.id.cardStudent)
    }

//    untuk set layout nya
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StudentAdapter.ViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.item_list_student, parent, false)
        return ViewHolder(view)
    }

//     untuk mengambil data dari constructornya : listStudent
    override fun onBindViewHolder(holder: StudentAdapter.ViewHolder, position: Int) {
        holder.namaStudent.text = listStudent[position].nama
        holder.nim.text = listStudent[position].nim
        holder.imgStudent.setImageResource(listStudent[position].img)
        holder.card.setOnClickListener{
            onClick?.invoke(listStudent[position])
        }

    }

//    ada berapa item yang dimunculkan ke dalam recyclerview
    override fun getItemCount(): Int {
        return listStudent.size
    }

//    fun setData(dataStudent : List<StudentData>){
//        listStudent.clear()
//        listStudent.addAll(dataStudent)
//    }
}