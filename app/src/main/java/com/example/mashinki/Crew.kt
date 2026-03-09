package com.example.mashinki

abstract class Crew(
    open val id: Int,
    open val name: String,
    open val owner: String, //временно
    open val psychicLevel: Int,
    open val price: Int
) {
}