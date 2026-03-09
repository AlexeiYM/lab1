package com.example.mashinki

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.mashinki.databinding.EngineerCardBinding

class EngineerAdapter : RecyclerView.Adapter<EngineerViewHolder>() {

    private val data = mutableListOf<Engineer>()

    fun setNewData(newData: List<Engineer>) {
        data.clear()
        data.addAll(newData)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): EngineerViewHolder {
        val binding = EngineerCardBinding.inflate(LayoutInflater.from(parent.context))
        return EngineerViewHolder(binding)
    }

    override fun onBindViewHolder(
        holder: EngineerViewHolder,
        position: Int
    ) {
        holder.bind(data[position])
    }

    override fun getItemCount() = data.size
}