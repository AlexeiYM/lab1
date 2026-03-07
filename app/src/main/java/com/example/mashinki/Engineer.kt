package com.example.mashinki

sealed interface Engineer {

    val id: Int
    val price: Int
    val experience: Experience
    val reliabilityLevel: Int
    val potentialReliabilityLevel: Int
    val profession: Profession
    val professionLevel: Int
    val potentialProfessionLevel: Int

    class Mechanic(
        override val id: Int,
        override val price: Int,
        override val experience: Experience,
        override val reliabilityLevel: Int,
        override val potentialReliabilityLevel: Int,
        override val professionLevel: Int,
        override val potentialProfessionLevel: Int
    ) : Engineer {
        override val profession: Profession = Profession.MECHANIC
    }

}