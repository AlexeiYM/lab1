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
    open fun getId() = id
    open fun getName() = name
    open fun getOwner() = owner
    open fun getPsychicLevel() = psychicLevel
    open fun getPrice() = price
}