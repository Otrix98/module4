package com.skillbox.module4.oop

import com.skillbox.module4.oop.Ammo.*


abstract class AbstractWeapon(
    var maxNuberBulletInStore: Int,
    val FireType: FireType

){
    abstract fun createAmmo(): Ammo

    var Ammo = mutableListOf<Ammo>()


    fun ammoAveliable(): Boolean {
        return Ammo.isNotEmpty()
    }


    fun reload() {
        Ammo.add(maxNuberBulletInStore, createAmmo())
    }
    fun bulletsForShot():
}