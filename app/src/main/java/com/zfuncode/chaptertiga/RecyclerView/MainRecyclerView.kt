package com.zfuncode.chaptertiga.RecyclerView

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.zfuncode.chaptertiga.R
import kotlinx.android.synthetic.main.activity_main_recycler_view.*

class MainRecyclerView : AppCompatActivity() {

    lateinit var adapterStudent : StudentAdapter
    lateinit var adapterDiffStudent : StudentAdapterDiffUtil

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_recycler_view)

        val listStudent = arrayListOf(
            StudentData("Eliezer", "72654", R.drawable.ic_home),
            StudentData("Ferdi Sambo", "346273", R.drawable.ic_home),
            StudentData("Yoshua", "43634232", R.drawable.ic_home),
            StudentData("Kuat Maruf", "573463", R.drawable.ic_home),
            StudentData("RIcky Rizal", "36436", R.drawable.ic_home),
        )

        adapterStudent = StudentAdapter(listStudent)
        adapterDiffStudent = StudentAdapterDiffUtil()


        val lm = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
//        val gm = GridLayoutManager(this, 2)
        rvStudent.layoutManager = lm


//        No diff
        btnNodiff.setOnClickListener{
            rvStudent.adapter = adapterStudent
        }

//        update no diff
        btnUpdatenodiff.setOnClickListener{
            listStudent[1] = StudentData("Anisa", "241421",R.drawable.women)
            adapterStudent = StudentAdapter(listStudent)
            rvStudent.setAdapter(adapterStudent)
            adapterStudent.notifyDataSetChanged()

            adapterStudent.onClick = {
                val pindah = Intent(this, DetailStudent::class.java)
                pindah.putExtra("detail", it)
                startActivity(pindah)
            }

        }

//        with DiffUtil
        btnDiff.setOnClickListener{
            adapterDiffStudent = StudentAdapterDiffUtil()
            rvStudent.adapter = adapterDiffStudent
            adapterDiffStudent.submitData(listStudent)
            adapterDiffStudent.onClick = {
                val pindah = Intent(this, DetailStudent::class.java)
                pindah.putExtra("detail", it)
                startActivity(pindah)
            }
        }

//        update with DiffUtil
        btnUpdateDiff.setOnClickListener(){
            val list : MutableList<StudentData> = listStudent.toMutableList()
            list[2] = StudentData("irvan","241214",R.drawable.women)
            adapterDiffStudent = StudentAdapterDiffUtil()
            adapterDiffStudent.differ.submitList(list)
            rvStudent.adapter = adapterDiffStudent
            adapterDiffStudent.onClick = {
                val pindah = Intent(this, DetailStudent::class.java)
                pindah.putExtra("detail", it)
                startActivity(pindah)
            }
        }



        adapterStudent.onClick = {
            val pindah = Intent(this, DetailStudent::class.java)
            pindah.putExtra("detail", it)
            startActivity(pindah)
        }
    }
}