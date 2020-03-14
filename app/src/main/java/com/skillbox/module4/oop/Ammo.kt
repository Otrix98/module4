package com.skillbox.module4.oop

import java.util.*

enum class Ammo (
    val damage: Int,
    val criticalDamageCance: Int,
    val criticalDamageRatio: Int
){
    TYPE_A (50, 30, 50),
    TYPE_B (70, 40, 60),
    TYPE_C (90, 10, 90);


    var currentDamage: Int =  0

    val random = Random().nextInt(100) + 1

    fun criticalDamage (): Int {
         return if (criticalDamageCance >= random) criticalDamageRatio
        else 0
    }
    fun CurrentDamage () : Int{
        currentDamage = damage + criticalDamage() * criticalDamageRatio/10
        return currentDamage
    }

    }






