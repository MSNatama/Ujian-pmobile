package com.example.utsmobile.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.utsmobile.R
import com.example.utsmobile.data.DataSource

class ItemAdapter() :
        RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {
            private val data = DataSource.dataNBA
            private lateinit var mListener: OnItemClickListener


        interface OnItemClickListener{
            fun onItemClick(postition: Int){

            }
        }

        fun setOnItemClickListener(listener: OnItemClickListener){
            mListener = listener
        }
        class ItemViewHolder(view: View, listener: OnItemClickListener) : RecyclerView.ViewHolder(view) {
            val image: ImageView = view.findViewById(R.id.picture)
            val nameTextView: TextView = view.findViewById(R.id.Item_name)
            val teamTextView: TextView = view.findViewById(R.id.Teams)

            init {
                itemView.setOnClickListener {
                    listener.onItemClick(adapterPosition)
                }
            }
        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
            val adapterLayout = LayoutInflater.from(parent.context)
                .inflate(R.layout.item_list, parent, false)
            return ItemViewHolder(adapterLayout, mListener)
        }

        override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
            val item = data[position]
            holder.image.setImageResource(item.imageResourceId)
            holder.nameTextView.text = item.name
            holder.teamTextView.text = item.team
        }

        override fun getItemCount(): Int {
            return data.size
        }
        }