package com.example.mashinki

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.mashinki.databinding.FragmentChooseSponsorBinding

class ChooseSponsorFragment : Fragment(R.layout.fragment_choose_sponsor) {
    private var _binding: FragmentChooseSponsorBinding? = null
    private val binding get() = _binding!!
    private var chosenSponsor: List<Sponsor> = listOf()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentChooseSponsorBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setSponsors()
        setButtons()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    fun setButtons() = with(binding) {
        next.setOnClickListener {
            findNavController().navigate(
                ChooseSponsorFragmentDirections.actionChooseSponsorFragmentToCreateTeamFragment()
            )
        }
        cardFirst.root.setOnClickListener {
            chosenSponsor = listOf(Sponsor.RedBull)
            cardFirst.root.setBackgroundColor(requireContext().getColor(R.color.white_gray))
            cardSecond.root.setBackgroundColor(requireContext().getColor(R.color.white))
            cardThird.root.setBackgroundColor(requireContext().getColor(R.color.white))
            next.isEnabled = true
            next.setBackgroundColor(requireContext().getColor(R.color.green))
        }
        cardSecond.root.setOnClickListener {
            chosenSponsor = listOf(Sponsor.Rita)
            cardSecond.root.setBackgroundColor(requireContext().getColor(R.color.white_gray))
            cardFirst.root.setBackgroundColor(requireContext().getColor(R.color.white))
            cardThird.root.setBackgroundColor(requireContext().getColor(R.color.white))
            next.isEnabled = true
            next.setBackgroundColor(requireContext().getColor(R.color.green))
        }
        cardThird.root.setOnClickListener {
            chosenSponsor = listOf(Sponsor.Angry)
            cardThird.root.setBackgroundColor(requireContext().getColor(R.color.white_gray))
            cardSecond.root.setBackgroundColor(requireContext().getColor(R.color.white))
            cardFirst.root.setBackgroundColor(requireContext().getColor(R.color.white))
            next.isEnabled = true
            next.setBackgroundColor(requireContext().getColor(R.color.green))
        }
    }

    fun setSponsors() = with(binding) {
        cardFirst.sponsorName.text = Sponsor.RedBull.sponsorName
        cardFirst.sponsorSpecialty.text = Sponsor.RedBull.sponsorSpecialty
        cardFirst.logo.setImageResource(Sponsor.RedBull.logo)
        cardFirst.award1.text = getString(R.string.money, Sponsor.RedBull.startBudget)
        cardFirst.award2.text = getString(
            R.string.money_range,
            Sponsor.RedBull.raceMinAward,
            Sponsor.RedBull.raceMaxAward
        )
        cardFirst.text3.text =
            getString(R.string.extra_award_guide, Sponsor.RedBull.extraAwardGuide)
        cardFirst.award3.text = getString(R.string.money, Sponsor.RedBull.extraAward)

        cardSecond.sponsorName.text = Sponsor.Rita.sponsorName
        cardSecond.sponsorSpecialty.text = Sponsor.Rita.sponsorSpecialty
        cardSecond.logo.setImageResource(Sponsor.Rita.logo)
        cardSecond.award1.text = getString(R.string.money, Sponsor.Rita.startBudget)
        cardSecond.award2.text = getString(
            R.string.money_range,
            Sponsor.Rita.raceMinAward,
            Sponsor.Rita.raceMaxAward
        )
        cardSecond.text3.text = getString(R.string.extra_award_guide, Sponsor.Rita.extraAwardGuide)
        cardSecond.award3.text = getString(R.string.money, Sponsor.Rita.extraAward)

        cardThird.sponsorName.text = Sponsor.Angry.sponsorName
        cardThird.sponsorSpecialty.text = Sponsor.Angry.sponsorSpecialty
        cardThird.logo.setImageResource(Sponsor.Angry.logo)
        cardThird.award1.text = getString(R.string.money, Sponsor.Angry.startBudget)
        cardThird.award2.text = getString(
            R.string.money_range,
            Sponsor.Angry.raceMinAward,
            Sponsor.Angry.raceMaxAward
        )
        cardThird.text3.text = getString(R.string.extra_award_guide, Sponsor.Angry.extraAwardGuide)
        cardThird.award3.text = getString(R.string.money, Sponsor.Angry.extraAward)
    }
}