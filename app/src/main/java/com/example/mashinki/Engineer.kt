package com.example.mashinki

class Engineer(
    override val id: Int,
    override val name: String,
    override val owner: String,
    override val psychicLevel: Int,
    override val price: Int,
    val hairColor: HairColor,
    val favoriteTShirt: TShirtColor,
    val experience: Experience,
    val reliabilityLevel: Int,
    val potentialReliabilityLevel: Int,
    val professionLevel: Int,
    val potentialProfessionLevel: Int,
    val profession: Profession = Profession.MECHANIC
) : Crew(
    id, owner, name, psychicLevel, price
)