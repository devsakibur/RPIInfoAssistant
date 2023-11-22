package com.example.rpiassistant.view

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.rpiassistant.adapter.CategoryAdapter
import com.example.rpiassistant.databinding.FragmentLibraryHomeBinding
import com.example.rpiassistant.model.Book
import com.example.rpiassistant.viewmodel.RpiViewModel
import com.google.firebase.FirebaseApp

class LibraryHomeFragment : Fragment() {
private lateinit var binding: FragmentLibraryHomeBinding

    @SuppressLint("NotifyDataSetChanged")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentLibraryHomeBinding.inflate(layoutInflater)
        FirebaseApp.initializeApp(requireContext())
        val bookViewModel = ViewModelProvider(this)[RpiViewModel::class.java]


//        val bookList = listOf(
//            Book("Sakibur Rahman","ki koris re?"),
//            Book("Joy Saha","Tor biye kobe?"),
//            Book("Shuvo","Room e ettu ay to"),
//            Book("Abdul Hakim","congratulations on biya chotovai")
//        )
//        for (book in bookList) {
//            bookViewModel.uploadBook("Users", book)
////            Toast.makeText(requireContext(),"uploaded" , Toast.LENGTH_SHORT).show()
//        }


        val categoryNames = ArrayList<String>()
        val categoryAdapter = CategoryAdapter(categoryNames)
        binding.categoryRecyclerView.adapter = categoryAdapter
        binding.categoryRecyclerView.layoutManager = LinearLayoutManager(requireContext())




        bookViewModel.getCategoryNames { newCategoryNames ->
            categoryNames.clear()
            categoryNames.addAll(newCategoryNames)
            categoryAdapter.notifyDataSetChanged()
        }




        return binding.root

    }

}