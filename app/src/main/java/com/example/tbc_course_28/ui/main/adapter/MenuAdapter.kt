package com.example.tbc_course_28.ui.main.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.example.tbc_course_28.databinding.LinearMenuItemBinding
import com.example.tbc_course_28.domain.MenuItem

typealias onClick = (user: MenuItem) -> Unit

class MenuAdapter(private val content: List<MenuItem>):RecyclerView.Adapter<MenuAdapter.ViewHolder>() {

    lateinit var onClick: onClick

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MenuAdapter.ViewHolder =
        ViewHolder(
            LinearMenuItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        )


    override fun onBindViewHolder(holder: MenuAdapter.ViewHolder, position: Int) {
        holder.bind()
    }

    override fun getItemCount(): Int {
        return content.size
    }

    inner class ViewHolder(private val binding:LinearMenuItemBinding):RecyclerView.ViewHolder(binding.root){

        private lateinit var currentItem: MenuItem


        fun bind(){
            currentItem = content[adapterPosition]
            binding.apply {
                name.text = currentItem.name
                icon.load(currentItem.icon)
            }
            binding.root.setOnClickListener {
                onClick(
                    currentItem
                )
            }
        }
    }
}