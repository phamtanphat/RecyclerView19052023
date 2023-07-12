package com.example.recyclerview19052023

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private var recyclerView: RecyclerView? = null
    private var workAdapter: WorkAdapter? = null
    private var listWorks: List<Work>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerview)

        listWorks = mutableListOf<Work>().apply {
            add(Work("Title 1", "Do something 1"))
            add(Work("Title 2", "Do something 2"))
            add(Work("Title 3", "Do something 3"))
            add(Work("Title 4", "Do something 4"))
            add(Work("Title 5", "Do something 5"))
        }
        workAdapter = WorkAdapter(this, listWorks ?: mutableListOf())
        recyclerView?.adapter = workAdapter

        workAdapter?.setOnClickListener(object : WorkAdapter.OnClickListener {
            override fun onClick(position: Int) {
                Toast.makeText(this@MainActivity, "Click delete", Toast.LENGTH_SHORT).show()
            }
        })
    }
}