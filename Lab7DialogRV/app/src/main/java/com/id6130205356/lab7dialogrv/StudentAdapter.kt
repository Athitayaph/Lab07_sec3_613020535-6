package com.id6130205356.lab7dialogrv

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.id6130205356.lab7dialogrv.R

class StudentAdapter(val item : List<Student>, val context: Context): RecyclerView.Adapter<ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view_item = LayoutInflater.from(parent.context).inflate(R.layout.std_item_layout,parent, false)
        return ViewHolder(view_item)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.tvID.text = item[position].id
        holder.tvName.text = item[position].name
        holder.tvAge.text = item[position].age.toString()
    }

    override fun getItemCount(): Int {
        return item.size
    }
}