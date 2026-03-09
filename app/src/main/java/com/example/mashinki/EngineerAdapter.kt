package com.example.mashinki

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.mashinki.databinding.EngineerCardBinding

class EngineerAdapter(private val buyCallback: (Crew) -> Boolean) : RecyclerView.Adapter<EngineerViewHolder>() {

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
        return EngineerViewHolder(binding).apply {
            binding.buy.setOnClickListener {
                handleBuyClick(adapterPosition)
            }
        }
    }

    private fun handleBuyClick(position: Int) {
        buyCallback(data[position])
        data.remove(data[position])
    }

    override fun onBindViewHolder(
        holder: EngineerViewHolder,
        position: Int
    ) {
        holder.bind(data[position])
    }

    override fun getItemCount() = data.size
}