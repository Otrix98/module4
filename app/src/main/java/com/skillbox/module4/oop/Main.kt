package com.skillbox.module4.oop

fun main() {
    println("Введите количество воинов в команде:")

    val numberOfWarriors: Int = readLine()!!.toInt()

    fun cr() {
        Battle(firstTeam = Team(numberOfWarriors), secondTeam = Team(numberOfWarriors)).createFirstTeam()
        Battle(firstTeam = Team(numberOfWarriors), secondTeam = Team(numberOfWarriors)).createSecondTeam()
    }
    println("${cr()}")

    println("Начало битвы")

    fun battleStart() = Battle(firstTeam = Team(numberOfWarriors), secondTeam = Team(numberOfWarriors)).takeBattleState()
    println("${battleStart()}")
    fun battleContinue() = Battle(firstTeam = Team(numberOfWarriors), secondTeam = Team(numberOfWarriors)).battle(battleStart())
    println("continue")

    println( "${battleContinue()}")




}
