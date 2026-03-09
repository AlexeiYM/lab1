package com.example.mashinki

import androidx.recyclerview.widget.RecyclerView
import com.example.mashinki.databinding.EngineerCardBinding

class EngineerViewHolder(private val binding: EngineerCardBinding) : RecyclerView.ViewHolder(binding.root) {
    fun bind(engineer: Engineer) = with(binding) {
        hair.setImageResource(engineer.hairColor.drawable)
        tShirt.setImageResource(engineer.favoriteTShirt.drawable)
        name.text = engineer.name
        profession.text = binding.root.context.getString(R.string.profession, engineer.profession.text)
        experienceLevel.text = engineer.experience.text
        professionLevel.text = engineer.professionLevel.toString()
        professionPotentialLevel.text = engineer.potentialProfessionLevel.toString()
        reliabilityLevel.text = engineer.reliabilityLevel.toString()
        reliabilityPotentialLevel.text = engineer.potentialReliabilityLevel.toString()
        price.text = binding.root.context.getString(R.string.money, engineer.price)
    }
}