package com.example.mashinki

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class PlayerViewModel : ViewModel() {

    private val _balance = MutableStateFlow(100)
    val balance: StateFlow<Int> = _balance.asStateFlow()

    private val _crewmates = MutableStateFlow<List<Crew>>(emptyList())
    val crewmates: StateFlow<List<Crew>> = _crewmates.asStateFlow()

    fun purchaseCrew(crew: Crew): Boolean {
        if(_balance.value >= crew.getPrice()) {
            _balance.value -= crew.getPrice()
            _crewmates.value += crew
            crew.setNewOwner(Team.PLAYER)
            return true
        } else return false
    }

}