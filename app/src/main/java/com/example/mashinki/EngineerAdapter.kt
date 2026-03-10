package com.example.mashinki

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.mashinki.databinding.EngineerCardBinding
import com.google.android.material.snackbar.Snackbar

class EngineerAdapter(private val buyCallback: (Crew) -> Boolean) :
    RecyclerView.Adapter<EngineerViewHolder>() {

    private val data = mutableListOf<Engineer>()

    fun setNewData(newData: List<Engineer>) {
        data.clear()
        data.addAll(newData)
        notifyDataSetChanged()
    }

    fun getData() = data

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): EngineerViewHolder {
        val binding = EngineerCardBinding.inflate(LayoutInflater.from(parent.context))
        return EngineerViewHolder(binding).apply {
            binding.buy.setOnClickListener {
                handleBuyClick(adapterPosition, binding.root)
            }
        }
    }

    private fun handleBuyClick(position: Int, anyView: View) {
        if (buyCallback(data[position])) {
            data.remove(data[position])
            notifyItemRemoved(position)
        } else Snackbar.make(
            anyView,
            anyView.context.getString(R.string.no_money_for_crew), Snackbar.LENGTH_SHORT
        ).show()
    }

    override fun onBindViewHolder(
        holder: EngineerViewHolder,
        position: Int
    ) {
        holder.bind(data[position])
    }

    override fun getItemCount() = data.size
}