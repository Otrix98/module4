package com.skillbox.module4.oop

class Jeggernaut:  AbstractWarrior ( 1500,
    50,
    50,
    Weapons.shotgun
){

    override fun takeDamage(damage: Int) {
        currentHealth -= damage
        if (currentHealth <= 0) {
            println("Jeggernaut was killed!")
        }
    }

    override val isKilled: Boolean
        get() {return currentHealth <= 0}



    override fun toString(): String {
        return "Jeggernaut"
    }

}