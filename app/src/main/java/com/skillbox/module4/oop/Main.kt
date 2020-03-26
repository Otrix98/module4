package com.skillbox.module4.oop

fun main() {
    println("Введите количество воинов в команде:")
    val numberOfWarriors: Int = readLine()!!.toInt()
    println("Начало битвы")
    fun battleStart() = Battle(firstTeam = Team(numberOfWarriors), secondTeam = Team(numberOfWarriors)).battle()
    println("${battleStart()}")



}
