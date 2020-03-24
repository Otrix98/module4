package com.skillbox.module4.oop

class Main {
    fun main() {
        println("Введите количество воинов в команде:")
        val numberOfWarriors: Int = readLine()!!.toInt()
        Battle(firstTeam = Team(numberOfWarriors), secondTeam = Team(numberOfWarriors)).battle()

    }
}