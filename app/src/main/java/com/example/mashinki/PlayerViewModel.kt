package com.example.mashinki

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class PlayerViewModel : ViewModel() {

    private val _balance = MutableLiveData(100)
    val balance: LiveData<Int> = _balance

    private val _crewmates = MutableStateFlow<List<Crew>>(emptyList())
    val crewmates: StateFlow<List<Crew>> = _crewmates.asStateFlow()
    private val _availableEngineers = MutableStateFlow(DefaultLists.getDefaultEngineersList())
    val availableEngineers: StateFlow<List<Engineer>> = _availableEngineers.asStateFlow()

    fun purchaseCrew(crew: Crew): Boolean {
        val currentBalance = _balance.value ?: 0
        if (_balance.value!! >= crew.getCrewPrice()) {
            _balance.value = currentBalance - crew.getCrewPrice()
            _crewmates.value += crew
            crew.setNewOwner(Team.PLAYER)
            return true
        } else return false
    }

    fun setNewAvailableEngineersList(newList: List<Engineer>) {
        _availableEngineers.value = newList
    }
}