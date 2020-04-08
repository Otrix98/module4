package com.skillbox.module4.oop

fun main() {

    var battle: Battle

    println("Введите количество воинов в команде:")

    val numberOfWarriors: Int = readLine()!!.toInt()

    println("Начало битвы")

    battle = Battle(firstTeam = Team(numberOfWarriors), secondTeam = Team(numberOfWarriors))

    battle.createFirstTeam()
    battle.createSecondTeam()
    battle.battle(battle)










}
