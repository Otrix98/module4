package com.skillbox.module4.oop

sealed class BattleState() {
    class progress (val firstTeamHealth: Int, val secondTeamHealth: Int  ) : BattleState()
    class firstTeamWin () : BattleState()
    class secondTeamWin () : BattleState()
    class drawn () : BattleState()

}