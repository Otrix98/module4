package com.skillbox.module4.oop

class Sniper:  AbstractWarrior ( 700,
    70,
    70,
    Weapons.sniperRifle
){

    override fun takeDamage(damage: Int) {
        currentHealth -= damage
        if (currentHealth <= 0) {
            println("Sniper was killed!")
        }
    }

    override val isKilled: Boolean
        get() {return currentHealth <= 0}



    override fun toString(): String {
        return "Sniper"
    }

}
