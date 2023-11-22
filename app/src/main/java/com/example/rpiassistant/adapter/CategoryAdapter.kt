package com.example.rpiassistant.adapter

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.example.rpiassistant.R

class CategoryAdapter(private val categoryNames: List<String>) :
    RecyclerView.Adapter<CategoryAdapter.ViewHolder>() {

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val categoryNameTextView: TextView = itemView.findViewById(R.id.categoryNameTextView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_category, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val categoryName = categoryNames[position]
        holder.categoryNameTextView.text = categoryName

        holder.itemView.setOnClickListener{
            val bundle = Bundle()
            bundle.putSerializable("categoryName" , categoryName)
            it.findNavController().navigate(R.id.action_libraryHomeFragment_to_bookListFragment , bundle)
        }


    }

    override fun getItemCount(): Int {
        return categoryNames.size
    }
}
