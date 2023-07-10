package com.example.recyclerview19052023

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class WorkAdapter(
    var listWorks: List<Work>
) : RecyclerView.Adapter<WorkAdapter.WorkViewHolder>(){

    inner class WorkViewHolder(var view: View): RecyclerView.ViewHolder(view) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WorkViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val view = layoutInflater.inflate(R.layout.layout_item_work, parent, false)
        return WorkViewHolder(view)
    }

    override fun getItemCount() = listWorks.size

    override fun onBindViewHolder(holder: WorkViewHolder, position: Int) {
        TODO("Not yet implemented")
    }
}