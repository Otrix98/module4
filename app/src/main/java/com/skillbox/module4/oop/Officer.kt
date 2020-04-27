package com.skillbox.module4.oop

class Officer : AbstractWarrior(1000,
    60,
    70,
    Weapons.pistol
    ) {

        override fun takeDamage(damage: Int) {
            currentHealth -= damage
            if (currentHealth <= 0) {
                println("Officer was killed!")
            }
        }

        override var isKilled: Boolean = false
            get() { return currentHealth <= 0 }

        override fun toString(): String {
            return "Officer"
        }
    }
