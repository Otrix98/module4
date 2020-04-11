package com.skillbox.module4.oop

import javax.crypto.SealedObject

sealed class BattleState() {
    object Progress: BattleState()
    object FirstTeamWin: BattleState()
    object SecondTeamWin: BattleState()
    object Drawn: BattleState()

}