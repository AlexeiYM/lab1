package com.example.mashinki

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.mashinki.databinding.MainMenuFragmentBinding

class MainMenuFragment : Fragment() {

    private var _binding: MainMenuFragmentBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = MainMenuFragmentBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        bindButtons(binding)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    private fun bindButtons(binding: MainMenuFragmentBinding) {
        binding.buttonStart.setOnClickListener {
            findNavController().navigate(
                R.id.action_mainMenuFragment_to_startFragment
            )
        }
        binding.buttonHirePilot.setOnClickListener {
            findNavController().navigate(
                R.id.action_mainMenuFragment_to_hirePilotFragment
            )
        }
        binding.buttonHireEngineer.setOnClickListener {
            findNavController().navigate(
                R.id.action_mainMenuFragment_to_hireEngineerFragment
            )
        }
        binding.buttonCheckTeams.setOnClickListener {
            findNavController().navigate(
                R.id.action_mainMenuFragment_to_checkTeamsFragment
            )
        }
        binding.buttonCheckStats.setOnClickListener {
            findNavController().navigate(
                R.id.action_mainMenuFragment_to_checkStatsFragment
            )
        }
        binding.buttonCheckOtherResults.setOnClickListener {
            findNavController().navigate(
                R.id.action_mainMenuFragment_to_checkOtherResultsFragment
            )
        }
        binding.buttonCheckCars.setOnClickListener {
            findNavController().navigate(
                R.id.action_mainMenuFragment_to_checkCarsFragment
            )
        }
        binding.buttonBuyComponents.setOnClickListener {
            findNavController().navigate(
                R.id.action_mainMenuFragment_to_buyComponentsFragment
            )
        }
        binding.buttonAssembleCar.setOnClickListener {
            findNavController().navigate(
                R.id.action_mainMenuFragment_to_assembleCarFragment
            )
        }
        binding.buttonCheckTeam.setOnClickListener {
            findNavController().navigate(
                R.id.action_mainMenuFragment_to_checkTeamFragment
            )
        }
        binding.buttonCheckSponsor.setOnClickListener {
            findNavController().navigate(
                R.id.action_mainMenuFragment_to_checkSponsor
            )
        }
        binding.buttonExit.setOnClickListener {
            requireActivity().finish()
        }
    }
}