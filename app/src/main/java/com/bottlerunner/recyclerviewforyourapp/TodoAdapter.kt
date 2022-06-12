package com.bottlerunner.recyclerviewforyourapp

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class
TodoAdapter(var context: Context, var groups: List<Group>): RecyclerView.Adapter<GroupAdapter.GroupViewHolder>(){


    inner class GroupViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GroupViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_todo, parent, false)
        return GroupViewHolder(view)
    }

    override fun onBindViewHolder(holder: GroupViewHolder, position: Int) {

        holder.itemView.apply {
            val tvTitle: TextView = this.findViewById(R.id.tvTitle)
            val cbDone: CheckBox = findViewById(R.id.cbDone)
            tvTitle.text = todos[position].title
            cbDone.isChecked = todos[position].checked
        }
    }

    override fun getItemCount(): Int {
        Log.d("Peroblem", "Itme count ${todos.size}")
        return todos.size
    }
}