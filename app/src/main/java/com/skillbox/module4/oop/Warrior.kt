package com.skillbox.module4.oop

interface Warrior {
    val isKilled: Boolean
    val dodgeChance: Int

    fun attack(enemy: Warrior)
    fun takeDamage (damage: Int)
}