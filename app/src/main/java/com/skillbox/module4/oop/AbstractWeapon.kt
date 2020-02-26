package com.skillbox.module4.oop

import com.skillbox.module4.oop.Ammo.*


abstract class AbstractWeapon(
    var maxNuberBulletInStore: Int,
    val FireType: FireType,
    var Ammo: List<Ammo>,
    val ammoAveliable: Boolean
) {
    abstract fun createAmmo(): Ammo

    object Weapons {

        val someWeapon = object : AbstractWeapon(30, FireType.Single, List<Ammo>,   ){
            override fun createAmmo(): Ammo {
                return TYPE_A}



    fun reload ( Ammo: List<Ammo>){
        var listOfAmmo = mutableListOf(maxNuberBulletInStore, this.Ammo)
    }

    fun bulletsForShot():
}