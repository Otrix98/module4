package com.skillbox.module4.oop

import com.skillbox.module4.oop.Ammo.*


abstract class AbstractWeapon(
    var maxNuberBulletInStore: Int,
    val FireType: FireType,
    val ammoType: Ammo

){
    abstract fun createAmmo(): Ammo

    var Ammo = mutableListOf<Ammo>()


    fun ammoAveliable(): Boolean {
        if (Ammo.isEmpty()) return (true)
        else return (false)
    }

    fun reload() {
        Ammo.add(maxNuberBulletInStore, ammoType)
    }



    fun getAmmo() : Int {
        for (i in 1 .. FireType.spendedBullets){
            Ammo.removeAt(Ammo.size-1)
        }
        return FireType.spendedBullets
    }


}