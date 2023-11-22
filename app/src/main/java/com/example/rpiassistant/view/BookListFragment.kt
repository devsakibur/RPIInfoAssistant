package com.example.rpiassistant.view

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.OnBackPressedCallback
import androidx.appcompat.widget.SearchView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.rpiassistant.adapter.BookAdapter
import com.example.rpiassistant.databinding.FragmentBookListBinding
import com.example.rpiassistant.model.Book
import com.example.rpiassistant.viewmodel.RpiViewModel
import com.google.firebase.FirebaseApp

class BookListFragment : Fragment() {
private lateinit var binding:FragmentBookListBinding

    private lateinit var bookAdapter: BookAdapter

    @SuppressLint("NotifyDataSetChanged")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentBookListBinding.inflate(layoutInflater)

        FirebaseApp.initializeApp(requireContext())
        val  bookViewModel = ViewModelProvider(this).get(RpiViewModel::class.java)


        val selectedCategory = requireArguments().getString("categoryName")

        val categoryNames = ArrayList<Book>()
        bookAdapter = BookAdapter(categoryNames)
        binding.categoryRecyclerView.adapter = bookAdapter
        binding.categoryRecyclerView.layoutManager = LinearLayoutManager(requireContext())




        if (selectedCategory != null) {
            bookViewModel.getBookNamesByCategory(selectedCategory) { newCategoryNames ->
                categoryNames.clear()
                categoryNames.addAll(newCategoryNames)
                bookAdapter.notifyDataSetChanged()

            }
        }
        binding.searchBook.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String?): Boolean {
                return false
            }

            override fun onQueryTextChange(newText: String?): Boolean {
                bookAdapter.filter(newText.orEmpty()) // Use the adapter reference here
                return true
            }
        })




        requireActivity().onBackPressedDispatcher.addCallback(viewLifecycleOwner, onBackPressedCallback)

        return binding.root
    }


    private val onBackPressedCallback = object : OnBackPressedCallback(true) {
        override fun handleOnBackPressed() {
            findNavController().navigateUp()
        }
    }


}