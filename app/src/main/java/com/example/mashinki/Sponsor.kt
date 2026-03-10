package com.example.mashinki

sealed class Sponsor(
    val sponsorName: String,
    val sponsorSpecialty: String,
    val logo: Int,
    val startBudget: Int,
    val raceMinAward: Int,
    val raceMaxAward: Int,
    val extraAward: Int,
    val extraAwardGuide: String
) {
    object RedBull : Sponsor(
        sponsorName = "Красный бык",
        sponsorSpecialty = "Энергетический напиток",
        logo = R.drawable.redbull_final,
        startBudget = 500,
        raceMinAward = 0,
        raceMaxAward = 100,
        extraAward = 100,
        extraAwardGuide = "за 1 место"
    )
    object Rita : Sponsor(
        sponsorName = "Рита",
        sponsorSpecialty = "Спортивная обувь",
        logo = R.drawable.rita,
        startBudget = 400,
        raceMinAward = 20,
        raceMaxAward = 80,
        extraAward = 300,
        extraAwardGuide = "за найм ветерана"
    )
    object Angry : Sponsor(
        sponsorName = "Злой-кола",
        sponsorSpecialty = "Газированный напиток",
        logo = R.drawable.zloy,
        startBudget = 400,
        raceMinAward = 40,
        raceMaxAward = 60,
        extraAward = 70,
        extraAwardGuide = "за топ-4 две гонки подряд"
    )
}