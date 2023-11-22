package com.example.rpiassistant.viewmodel

import androidx.lifecycle.ViewModel
import com.example.rpiassistant.model.Book
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener

class RpiViewModel: ViewModel() {

    private val databaseReference = FirebaseDatabase.getInstance().reference.child("books")

    fun uploadBook(category: String, book: Book) {
        databaseReference.child(category).push().setValue(book)
    }

    fun getCategoryNames(callback: (List<String>) -> Unit) {
        databaseReference.addListenerForSingleValueEvent(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                val categoryNames = snapshot.children.mapNotNull { it.key }
                callback(categoryNames)
            }

            override fun onCancelled(error: DatabaseError) {
                // Handle errors here
            }
        })
    }

    fun getBookNamesByCategory(category: String, callback: (List<Book>) -> Unit) {
        val databaseReference = FirebaseDatabase.getInstance().reference.child("books").child(category)

        databaseReference.addListenerForSingleValueEvent(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                val books = snapshot.children.map { bookSnapshot ->
                    val title = bookSnapshot.child("title").getValue(String::class.java)
                    val author = bookSnapshot.child("author").getValue(String::class.java)
                    Book(title.toString(), author.toString())
                }

                callback(books)
            }

            override fun onCancelled(error: DatabaseError) {
                // Handle errors here
            }
        })
    }






















}