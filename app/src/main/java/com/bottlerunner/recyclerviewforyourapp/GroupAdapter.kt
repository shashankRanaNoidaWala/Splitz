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
GroupAdapter(var context: Context, var groups: List<Group>): RecyclerView.Adapter<GroupAdapter.GroupViewHolder>(){


    inner class GroupViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GroupViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.group_card, parent, false)
        return GroupViewHolder(view)
    }

    override fun onBindViewHolder(holder: GroupViewHolder, position: Int) {

        holder.itemView.apply {
            val tvGroupName: TextView = this.findViewById(R.id.tvGroupName)
            val tvMembers: TextView=this.findViewById(R.id.tvMembers)
            tvGroupName.text = groups[position].name
            tvMembers.text = (groups[position].to_string())
        }
    }

    override fun getItemCount(): Int {
        return groups.size
    }


}