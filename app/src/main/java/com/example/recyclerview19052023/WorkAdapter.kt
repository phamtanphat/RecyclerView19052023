package com.example.recyclerview19052023

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class WorkAdapter(
    private var context: Context,
    private var listWorks: List<Work>
) : RecyclerView.Adapter<WorkAdapter.WorkViewHolder>(){

    private var onClickListener: OnClickListener? = null

    inner class WorkViewHolder(var view: View): RecyclerView.ViewHolder(view) {
        private var txtTile: TextView = view.findViewById(R.id.text_view_title)
        private var txtDescription: TextView = view.findViewById(R.id.text_view_description)
        private var imgDelete: ImageView = view.findViewById(R.id.image_view_delete)

        init {
            imgDelete.setOnClickListener {
                onClickListener?.onClick(adapterPosition)
            }
        }

        fun bind(work: Work) {
            txtTile.text = work.title
            txtDescription.text = work.description
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WorkViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val view = layoutInflater.inflate(R.layout.layout_item_work, parent, false)
        return WorkViewHolder(view)
    }

    override fun getItemCount() = listWorks.size

    override fun onBindViewHolder(holder: WorkViewHolder, position: Int) {
        holder.bind(listWorks[position])
    }

    fun setOnClickListener(onClickListener: OnClickListener) {
        this.onClickListener = onClickListener
    }

    interface OnClickListener {
        fun onClick(position: Int)
    }
}