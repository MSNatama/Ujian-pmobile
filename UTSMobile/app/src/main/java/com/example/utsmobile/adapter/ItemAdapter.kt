package com.example.utsmobile.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.utsmobile.R
import com.example.utsmobile.data.DataSource

class ItemAdapter:
        RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {
            private val data = DataSource.sports

        class ItemViewHolder(view: View) : RecyclerView.ViewHolder(view) {
            val image: ImageView = view.findViewById(R.id.picture)
            val nameTextView: TextView = view.findViewById(R.id.Item_name)
            val DescTextView: TextView = view.findViewById(R.id.description)
        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
            val adapterLayout = LayoutInflater.from(parent.context)
                .inflate(R.layout.item_list, parent, false)
            return ItemViewHolder(adapterLayout)
        }

        override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
            val item = data[position]
            holder.image.setImageResource(item.imageResourceId)
            holder.nameTextView.text = item.name
            holder.DescTextView.text = item.desc
        }

        override fun getItemCount(): Int {
            return data.size
        }
        }