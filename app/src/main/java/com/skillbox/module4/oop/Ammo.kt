package com.skillbox.module4.oop

import java.util.*

class Ammo (
    val damage: Int,
    val criticalDamageCance: Int,
    val criticalDamageRatio: Int
){
    var currentDamage: Int = 0

    val random = Random().nextInt(100) + 1

    fun criticalDamage (): Int {
         return if (criticalDamageCance >= random) criticalDamageRatio
        else 0
    }

    fun CurrentDamage() {
        currentDamage = damage + criticalDamage() * criticalDamageRatio/10
        println( " damage: ${ currentDamage }")


    }

    }






