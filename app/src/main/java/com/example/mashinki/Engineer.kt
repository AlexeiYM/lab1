package com.example.mashinki

class Engineer(
    id: Int,
    name: String,
    owner: Team,
    psychicLevel: Int,
    price: Int,
    private val hairColor: HairColor,
    private val favoriteTShirt: TShirtColor,
    private var experience: Experience,
    private var reliabilityLevel: Int,
    private val potentialReliabilityLevel: Int,
    private var professionLevel: Int,
    private val potentialProfessionLevel: Int,
    private val profession: Profession = Profession.MECHANIC
) : Crew(
    id, name, owner, psychicLevel, price
) {
    fun getHairColor() = hairColor
    fun getFavoriteTShirt() = favoriteTShirt
    fun getExperience() = experience
    fun getReliabilityLevel() = reliabilityLevel
    fun getPotentialReliabilityLevel() = potentialReliabilityLevel
    fun getProfessionLevel() = professionLevel
    fun getPotentialProfessionLevel() = potentialProfessionLevel
    fun getProfession() = profession
}