package com.zfuncode.chaptertiga.RecyclerView

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.zfuncode.chaptertiga.R

class StudentAdapterDiffUtil(): RecyclerView.Adapter<StudentAdapterDiffUtil.ViewHolder>() {

    var onClick : ((StudentData) -> Unit)? = null

    private var diffCallback = object :DiffUtil.ItemCallback<StudentData>(){
        override fun areItemsTheSame(oldItem: StudentData, newItem: StudentData): Boolean {
            return  oldItem.nama == newItem.nama
        }

        override fun areContentsTheSame(oldItem: StudentData, newItem: StudentData): Boolean {
            return oldItem.hashCode() == newItem.hashCode()
        }
    }

     val differ = AsyncListDiffer(this, diffCallback)

    fun submitData(value : ArrayList<StudentData>){
        differ.submitList(value)
    }

    class ViewHolder(itemView : View): RecyclerView.ViewHolder(itemView) {
        var namaStudent = itemView.findViewById<TextView>(R.id.txtNamaStudent)
        var nim = itemView.findViewById<TextView>(R.id.txtNim)
        var imgStudent = itemView.findViewById<ImageView>(R.id.imgStudent)
        var card = itemView.findViewById<CardView>(R.id.cardStudent)
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): StudentAdapterDiffUtil.ViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.item_list_student, parent, false)
        return ViewHolder(view)
    }



    override fun onBindViewHolder(holder: StudentAdapterDiffUtil.ViewHolder, position: Int) {
        val data = differ.currentList[position]
        holder.namaStudent.text = data.nama
        holder.nim.text = data.nim
        holder.imgStudent.setImageResource(data.img)
        holder.card.setOnClickListener{
            onClick?.invoke(data)
        }
    }

    override fun getItemCount(): Int {
        return differ.currentList.size
    }
}