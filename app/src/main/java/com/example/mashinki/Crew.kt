package com.example.mashinki

abstract class Crew(
    protected val id: Int,
    protected val name: String,
    protected var owner: Team,
    protected var psychicLevel: Int,
    protected val price: Int
) {
    open fun setNewOwner(newOwner: Team): Unit {
        owner = newOwner
    }
    open fun getCrewId() = id
    open fun getCrewName() = name
    open fun getCrewOwner() = owner
    open fun getCrewPsychicLevel() = psychicLevel
    open fun getCrewPrice() = price
}