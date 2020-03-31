package com.skillbox.module4.oop

import javax.crypto.SealedObject

sealed class BattleState() {
    class Progress (val firstTeamHealth: Int, val secondTeamHealth: Int  ) : BattleState()
    object FirstTeamWin: BattleState()
    object SecondTeamWin: BattleState()
    object Drawn: BattleState()

}