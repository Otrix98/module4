package com.skillbox.module4.oop

import android.os.Parcel
import android.os.Parcelable
import com.skillbox.module4.oop.Weapons.pistol
import kotlin.random.Random

abstract class AbstractWarrior (
    val health: Int = 1000,
    override  var dodgeChance: Int = 50,
    val accuracy: Int = 50,
    val gun: AbstractWeapon = pistol,
    var currentHealth: Int = health): Warrior {



    override fun attack(enemy: Warrior) {

        if (gun.ammoAveliable()){
            gun.reload()
        }
        val shots = gun.getAmmo()
        var damage = 0
        for (i in 1 .. shots){
            if (Math.random() < (accuracy/100f) * (1 - enemy.dodgeChance/100f)){
                damage += gun.createAmmo().calcDamage()
            }
        }
        enemy.takeDamage(damage)
    }

        }



