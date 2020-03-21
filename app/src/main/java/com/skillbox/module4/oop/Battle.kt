package com.skillbox.module4.oop

class Battle (
    val firstTeam: Team,
    val secondTeam: Team,
    val battleIsOver: Boolean
) {
    fun takeBattleState(): BattleState {
        if (firstTeam.warriorList.isNotEmpty() && secondTeam.warriorList.isNotEmpty())
            return BattleState.progress()
        if (firstTeam.warriorList.isEmpty())
            return BattleState.secondTeamWin()
        if (secondTeam.warriorList.isEmpty())
            return BattleState.firstTeamWin()
        else return BattleState.drawn()
    }

    fun battleProgress(): {
        var newFirstTeam = firstTeam.warriorList.shuffled()
        var newSecondTeam = secondTeam.warriorList.shuffled()

        for (i in newFirstTeam) {
            if (
        }
    }
}