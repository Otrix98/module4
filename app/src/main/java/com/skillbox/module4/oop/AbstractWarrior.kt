package com.skillbox.module4.oop

import android.os.Parcel
import android.os.Parcelable
import kotlin.random.Random

abstract class AbstractWarrior() : Warrior {
    val health: Int = 1000,
    var dodgeChance: Int,
    val acuracy: Int,
    val gun: AbstractWeapon,
    var currentHealth: Int = health



    override fun attack(enemy: Warrior) {
        if (gun.ammoAveliable()) gun.reload()
        else (val shots = gun.getAmmo())
        var damage = 0
        for (i in 1 .. shots){
            if (acuracy >= enemy.dodgeChance) damage+= gun.


        }






    }
}