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

    override var isKilled: Boolean = false
        get() {return currentHealth <= 0}



    override fun toString(): String {
        return "Officer"
    }

}
