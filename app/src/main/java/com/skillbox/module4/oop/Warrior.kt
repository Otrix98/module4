package com.skillbox.module4.oop

interface Warrior {
    val isKilled: Boolean
    val dodgeChance: Int
    val isReady: Boolean

    fun attack(enemy: Warrior)
    fun takeDamage (damage: Int)
}