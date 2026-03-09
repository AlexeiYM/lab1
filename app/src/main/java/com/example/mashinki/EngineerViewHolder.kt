package com.example.mashinki

import androidx.recyclerview.widget.RecyclerView
import com.example.mashinki.databinding.EngineerCardBinding

class EngineerViewHolder(private val binding: EngineerCardBinding) : RecyclerView.ViewHolder(binding.root) {
    fun bind(engineer: Engineer) = with(binding) {
        hair.setImageResource(engineer.getHairColor().drawable)
        tShirt.setImageResource(engineer.getFavoriteTShirt().drawable)
        name.text = engineer.getName()
        profession.text = binding.root.context.getString(R.string.profession, engineer.getProfession().text)
        experienceLevel.text = engineer.getExperience().text
        professionLevel.text = engineer.getProfessionLevel().toString()
        professionPotentialLevel.text = engineer.getPotentialProfessionLevel().toString()
        reliabilityLevel.text = engineer.getReliabilityLevel().toString()
        reliabilityPotentialLevel.text = engineer.getPotentialReliabilityLevel().toString()
        price.text = binding.root.context.getString(R.string.money, engineer.getPrice())
    }
}