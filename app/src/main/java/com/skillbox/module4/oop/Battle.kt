package com.skillbox.module4.oop

class Battle (
    var firstTeam: Team,
    var secondTeam: Team
) {
    fun createFirstTeam() {
        firstTeam.recruting()
        println("${firstTeam}")
        println("" + firstTeam.warriorList.size)
        println("" + firstTeam.warriorList.sumBy { it.currentHealth })
    }
    fun createSecondTeam()  {
        secondTeam.recruting()
        println("${secondTeam}")
        println("" + secondTeam.warriorList.size)
        println("" + secondTeam.warriorList.sumBy { it.currentHealth})
    }


    fun takeBattleState(state: Battle): BattleState {println("takeBattleState")

        if (state.firstTeam.warriorList.isNotEmpty() && state.secondTeam.warriorList.isEmpty() ) {
            println("Победила первая команда")
            return BattleState.FirstTeamWin
        }

        else if (state.firstTeam.warriorList.isEmpty() && state.secondTeam.warriorList.isNotEmpty() ) {
            println("Победила вторая команда")
            return BattleState.SecondTeamWin
        }

        else if

        (state.firstTeam.warriorList.isNotEmpty() && state.secondTeam.warriorList.isNotEmpty()) {
            return BattleState.Progress(firstTeamHealth = firstTeam.warriorList.sumBy { it.currentHealth },
                secondTeamHealth = secondTeam.warriorList.sumBy { it.currentHealth })
        }

        else {
            println("Ничья")
            return BattleState.Drawn
        }

    }


    private fun firefight() : Boolean  {

        val shotingWarrior1 = firstTeam.warriorList.firstOrNull { it.isReady }
        val shotingWarrior2 = secondTeam.warriorList.firstOrNull { it.isReady }
        val attackedWarrior1 = firstTeam.warriorList.firstOrNull { !it.isKilled }
        val attackedWarrior2 = secondTeam.warriorList.firstOrNull { !it.isKilled }

        if (attackedWarrior1 == null || attackedWarrior2 == null
            || (shotingWarrior1 == null && shotingWarrior2 == null))  return false

        else {shotingWarrior1?.attack(attackedWarrior2)
        shotingWarrior2?.attack(attackedWarrior1)
        return true}
        }



    fun battle(state: Battle) {
        var y = takeBattleState(state)


        while (firefight() == true) {
            println("battle")

            when (takeBattleState(state)) {
                BattleState.FirstTeamWin -> println("Победила первая команда")
                BattleState.SecondTeamWin -> println("Победила вторая команда")
                BattleState.Drawn -> println("Ничья")
                is BattleState.Progress  -> {
                    println("Progress(First team health = " + state.firstTeam.warriorList.sumBy { it.currentHealth } +
                            ", Second team health = " + state.secondTeam.warriorList.sumBy { it.currentHealth })

                }
            }
        }


        println("battle ended")
    }


    }



