package com.skillbox.module4.oop

class Soldier:  AbstractWarrior ( 800,
    30,
    60,
    Weapons.rifle
){

    override fun takeDamage(damage: Int) {
        currentHealth -= damage
        if (currentHealth <= 0) {
            println("Soldier was killed!")
        }
    }

    override val isKilled: Boolean
        get() {return currentHealth <= 0}



    override fun toString(): String {
        return "Officer"
    }

}
