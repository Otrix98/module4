package com.skillbox.module4.oop

import javax.crypto.SealedObject

sealed class BattleState() {
    class progress (val firstTeamHealth: Int, val secondTeamHealth: Int  ) : BattleState()
    class firstTeamWin () : BattleState()
    class secondTeamWin () : BattleState()
    class drawn () : BattleState()

    fun state(battle: BattleState) {
        when (battle) {
            is BattleState.progress -> println(
                "Progress(First team health = ${battle.firstTeamHealth}," +
                        " Second team health = ${battle.secondTeamHealth})")
            is BattleState.secondTeamWin -> println("Победила вторая команда")
            is BattleState.firstTeamWin -> println("Победила первая команда")
            is BattleState.drawn -> println("Ничья")

        }
    }

}