package com.example.sqlitecrud

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.sqlitecrud.databinding.DatabaseItemsBinding

class DatabaseAdapter(private val user: List<MyUser>): RecyclerView.Adapter<DatabaseAdapter.DatabaseViewHolder>() {
    private lateinit var binding:DatabaseItemsBinding

    inner class DatabaseViewHolder(private val binding: DatabaseItemsBinding): RecyclerView.ViewHolder(binding.root)
    {
        fun bind(dataItem:MyUser)
        {
            with(binding)
            {
                txtName.text=dataItem.name
                txtAge.text=dataItem.age.toString()
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DatabaseViewHolder {
        binding= DatabaseItemsBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return DatabaseViewHolder(binding)
    }

    override fun getItemCount()=user.size


    override fun onBindViewHolder(holder: DatabaseViewHolder, position: Int) {
        holder.bind(user[position])
    }
}