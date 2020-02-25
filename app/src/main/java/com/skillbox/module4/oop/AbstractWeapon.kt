package com.skillbox.module4.oop


abstract class AbstractWeapon(
    var maxNuberBulletInStore: Int,
    val FireType: String,
    var Ammo: List<Ammo>,
    val ammoAveliable: Boolean
) {
    abstract fun createBullet(): Ammo

    fun reload ( Ammo: List<Ammo>){
        var listOfAmmo = mutableListOf(maxNuberBulletInStore )
    }
}