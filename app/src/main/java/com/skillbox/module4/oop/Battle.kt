package com.skillbox.module4.oop

class Battle (
    var firstTeam: Team,
    var secondTeam: Team
) {

    var state : BattleState = BattleState.Progress

    fun createFirstTeam() {
        firstTeam.recruting()
        println("" + firstTeam.warriorList.size)
        println("" + firstTeam.warriorList.sumBy { it.currentHealth })
    }
    fun createSecondTeam()  {
        secondTeam.recruting()
        println("" + secondTeam.warriorList.size)
        println("" + secondTeam.warriorList.sumBy { it.currentHealth})
    }


    fun takeBattleState(battle: Battle): BattleState {
        println("takeBattleState")

        if (battle.firstTeam.warriorList.isNotEmpty() && battle.secondTeam.warriorList.isEmpty() ) {
            println("Победила первая команда")
            state = BattleState.FirstTeamWin
        }

        else if (battle.firstTeam.warriorList.isEmpty() && battle.secondTeam.warriorList.isNotEmpty() ) {
            println("Победила вторая команда")
            state = BattleState.SecondTeamWin
        }

        else if
                     (battle.firstTeam.warriorList.isNotEmpty() && battle.secondTeam.warriorList.isNotEmpty()) {
            state = BattleState.Progress
        }
        else {
            println("Ничья")
            return BattleState.Drawn
        }
        return state
    }


    private fun firefight() : Boolean  {
        val shotingWarrior1 = firstTeam.warriorList.firstOrNull { it.isReady }
        val shotingWarrior2 = secondTeam.warriorList.firstOrNull { it.isReady }
        val attackedWarrior1 = firstTeam.warriorList.firstOrNull { !it.isKilled }
        val attackedWarrior2 = secondTeam.warriorList.firstOrNull { !it.isKilled }

        if (attackedWarrior1 == null || attackedWarrior2 == null
            || (shotingWarrior1 == null && shotingWarrior2 == null)) {
            println("false")
            return false}

        else {
            println("else")
            shotingWarrior1?.attack(attackedWarrior2)
            shotingWarrior2?.attack(attackedWarrior1)
            return true
        }
    }



    fun battle(battle: Battle) {

        while (firefight() == true) {
            println("battle")

            when (takeBattleState(battle)) {
                is BattleState.FirstTeamWin -> println("Победила первая команда")
                is BattleState.SecondTeamWin -> println("Победила вторая команда")
                is BattleState.Drawn -> println("Ничья")
                is BattleState.Progress -> {
                    println("Progress(First team health = " + battle.firstTeam.warriorList.sumBy { it.currentHealth } +
                            ", Second team health = " + battle.secondTeam.warriorList.sumBy { it.currentHealth })
                }
            }
        }

            println("battle ended")
    }
}



