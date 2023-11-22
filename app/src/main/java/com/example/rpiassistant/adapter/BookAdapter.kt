package com.example.rpiassistant.adapter

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.rpiassistant.R
import com.example.rpiassistant.model.Book
import java.util.*

class BookAdapter(private var books: List<Book>) : RecyclerView.Adapter<BookAdapter.ViewHolder>() {

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val titleTextView: TextView = itemView.findViewById(R.id.titleTextView)
        val authorTextView: TextView = itemView.findViewById(R.id.authorTextView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_book, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val book = books[position]
        holder.titleTextView.text = book.title
        holder.authorTextView.text = book.author
    }

    override fun getItemCount(): Int {
        return books.size
    }

    @SuppressLint("NotifyDataSetChanged")
    fun filter(query: String) {
        books = books.filter {
                contact -> contact.author.contains(query, ignoreCase = true)
                || contact.title.contains(query , ignoreCase = true)
        }
        notifyDataSetChanged()
    }


}
