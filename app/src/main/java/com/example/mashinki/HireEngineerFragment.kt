package com.example.mashinki

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.mashinki.databinding.FragmentHireEngineerBinding

class HireEngineerFragment : Fragment(R.layout.fragment_hire_engineer) {
    private var _binding: FragmentHireEngineerBinding? = null
    private val binding get() = _binding!!
    private val engineerAdapter = EngineerAdapter()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentHireEngineerBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        bindButtons()
        with(binding.recyclerEngineers) {
            layoutManager = LinearLayoutManager(context)
            adapter = engineerAdapter
            addItemDecoration(VerticalSpaceItemDecoration(10))
            engineerAdapter.setNewData(DefaultLists.getDefaultEngineersList())
        }
    }

    fun bindButtons() = with(binding) {
        back.setOnClickListener { findNavController().popBackStack() }
    }
}