package com.skillbox.module4.oop

class Battle (
    var firstTeam: Team,
    var secondTeam: Team,
    var battleIsOver: Boolean = false
) {
    fun createFirstTeam() {firstTeam.recruting() ;println("${firstTeam}")}
    fun createSecondTeam()  {secondTeam.recruting() ;println("${secondTeam}")}


    fun takeBattleState(): BattleState {println("takeBattleState")
        if (firstTeam.warriorList.isNotEmpty() && secondTeam.warriorList.isNotEmpty())
            return BattleState.Progress(firstTeamHealth = firstTeam.warriorList.sumBy {it.currentHealth},
                secondTeamHealth = secondTeam.warriorList.sumBy { it.currentHealth })
        println("Progress(First team health = ${firstTeam.warriorList.sumBy {it.currentHealth}}," +
                " Second team health = ${secondTeam.warriorList.sumBy { it.currentHealth }})")

        if (firstTeam.warriorList.isEmpty())
            return BattleState.SecondTeamWin
            println("Победила вторая команда")
        if (secondTeam.warriorList.isEmpty())
            return BattleState.FirstTeamWin

        else println("Ничья")
        return BattleState.Drawn

    }


    private fun firefight() : Boolean  {

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

    fun battle(stat: BattleState) {
        println("battle")
        while (firefight() == true)
            println("battle")
        when (stat) {
            BattleState.FirstTeamWin -> println("Победила первая команда")
            BattleState.SecondTeamWin -> println("Победила вторая команда")
            BattleState.Drawn -> println("Ничья")
            is BattleState.Progress -> {
                println("Progress(First team health = ${firstTeam.warriorList.sumBy {it.currentHealth}}," +
                        " Second team health = ${secondTeam.warriorList.sumBy { it.currentHealth }})")
            }
        }

        println("battle ended")
    }


    }



