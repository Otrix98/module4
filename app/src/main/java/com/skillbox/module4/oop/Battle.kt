package com.skillbox.module4.oop

class Battle(
    var firstTeam: Team,
    var secondTeam: Team
) {

    var state: BattleState = BattleState.Progress

    fun createFirstTeam() {
        firstTeam.recruiting()
        println("" + firstTeam.warriorList.size)
        println("" + firstTeam.warriorList.sumBy { it.currentHealth })
    }

    fun createSecondTeam() {
        secondTeam.recruiting()
        println("" + secondTeam.warriorList.size)
        println("" + secondTeam.warriorList.sumBy { it.currentHealth })
    }

    fun takeBattleState(battle: Battle): BattleState {

        if (battle.secondTeam.warriorList.all { it.isKilled } || (battle.firstTeam.warriorList.all { !it.isReady } &&
                    battle.secondTeam.warriorList.all { !it.isReady }) &&
            (battle.firstTeam.warriorList.sumBy { it.currentHealth } > battle.secondTeam.warriorList.sumBy { it.currentHealth })
        ) {
            state = BattleState.FirstTeamWin
        } else if (battle.firstTeam.warriorList.all { it.isKilled } || (battle.secondTeam.warriorList.all { !it.isReady } &&
                    battle.firstTeam.warriorList.all { !it.isReady }) &&
            (battle.secondTeam.warriorList.sumBy { it.currentHealth } > battle.firstTeam.warriorList.sumBy { it.currentHealth })
        ) {
            state = BattleState.SecondTeamWin
        } else if (battle.firstTeam.warriorList.all { it.isKilled } && battle.secondTeam.warriorList.all { it.isKilled } ||
            (battle.firstTeam.warriorList.all { !it.isReady } &&
                    battle.secondTeam.warriorList.all { !it.isReady }) &&
            (battle.firstTeam.warriorList.sumBy { it.currentHealth } == battle.secondTeam.warriorList.sumBy { it.currentHealth })
        ) {
            state = BattleState.Drawn
        } else {

            return BattleState.Progress
        }
        return state
    }

    private fun firefight(): Boolean {
        val shotingWarrior1 = firstTeam.warriorList.firstOrNull { it.isReady }
        val shotingWarrior2 = secondTeam.warriorList.firstOrNull { it.isReady }
        val attackedWarrior1 = firstTeam.warriorList.firstOrNull { !it.isKilled }
        val attackedWarrior2 = secondTeam.warriorList.firstOrNull { !it.isKilled }

        if (attackedWarrior1 == null || attackedWarrior2 == null ||
            (shotingWarrior1 == null && shotingWarrior2 == null)
        ) {
            return false
        } else {
            shotingWarrior1?.attack(attackedWarrior2)
            shotingWarrior2?.attack(attackedWarrior1)
            return true
        }
    }

    fun battle(battle: Battle) {

        while (firefight() == true) {

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
