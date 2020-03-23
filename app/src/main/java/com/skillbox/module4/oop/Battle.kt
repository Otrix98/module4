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


    private fun firefight() : Boolean {

        val shotingWarrior1 = firstTeam.warriorList.firstOrNull { it.isReady }
        val shotingWarrior2 = secondTeam.warriorList.firstOrNull { it.isReady }
        val attackedWarrior1 = firstTeam.warriorList.firstOrNull { !it.isKilled }
        val attackedWarrior2 = secondTeam.warriorList.firstOrNull { !it.isKilled }

        if (attackedWarrior1 == null || attackedWarrior2 == null
            || (shotingWarrior1 == null && shotingWarrior2 == null)) return false
        else shotingWarrior1?.attack(attackedWarrior2)
        shotingWarrior2?.attack(attackedWarrior1)
        return true
        }

    fun battle() {
        while (firefight() == true) {
            firefight()
        }


    }



}