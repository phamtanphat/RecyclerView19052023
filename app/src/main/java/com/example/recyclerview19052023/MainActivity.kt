package com.example.recyclerview19052023

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private var recyclerView: RecyclerView? = null
    private var workAdapter: WorkAdapter? = null
    private var listWorks: MutableList<Work>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerview)

        listWorks = mutableListOf()
        workAdapter = WorkAdapter(this, listWorks ?: mutableListOf())
        recyclerView?.adapter = workAdapter

        workAdapter?.setOnClickListener(object : WorkAdapter.OnClickListener {
            override fun onClick(position: Int) {
                listWorks?.removeAt(position)
                workAdapter?.notifyItemRemoved(position)
            }
        })
        // Task : Thêm todo mới vào recyclerview và thằng mới nhất sẽ nằm trên cùng
    }
}