package com.example.tbc_course_28.ui.main

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.tbc_course_28.R
import com.example.tbc_course_28.databinding.FragmentMainBinding
import com.example.tbc_course_28.domain.MenuItem
import com.example.tbc_course_28.ui.main.adapter.MenuAdapter

class MainFragment : Fragment() {



    private var _binding: FragmentMainBinding? = null
    private val binding get() = _binding!!

    private val adapter by lazy {
        MenuAdapter(MenuItem.itemInit)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentMainBinding.inflate(inflater, container, false)
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.recyclerView.adapter = adapter
        listeners()
    }


    private fun listeners(){
        adapter.onClick = {
            Toast.makeText(requireContext(), it.name, Toast.LENGTH_SHORT).show()
        }

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}