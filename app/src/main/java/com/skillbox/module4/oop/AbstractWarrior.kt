package com.skillbox.module4.oop

import android.os.Parcel
import android.os.Parcelable

abstract class AbstractWarrior() : Warrior{
    val health: Int = 1000,
    var dodgeChance: Int,
    val acuracy: Int,
    val gun: AbstractWeapon,
    var currentHealth: Int = health

    override fun attack(enemy: Warrior) {
        if ()
    }
}