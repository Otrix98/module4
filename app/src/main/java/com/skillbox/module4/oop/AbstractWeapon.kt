package com.skillbox.module4.oop

import com.skillbox.module4.oop.Ammo.*
import java.lang.Exception


abstract class AbstractWeapon(
    var maxNuberBulletInStore: Int,
    val FireType: FireType,
    val ammoType: Ammo

) {
    abstract fun createAmmo(): Ammo

    var Ammo = mutableListOf<Ammo>()


    /* fun ammoAveliable(): Boolean {
        if (Ammo.isEmpty()) return (true)
        else return (false)
    }*/

    fun reload() {
        for (i in 1..maxNuberBulletInStore) {
            Ammo.add(createAmmo())
        }
    }

    class NoAmmoException : Exception() {}

    fun getAmmo(): Int {
        try {
            noAmmoException()
        } catch (t: NoAmmoException) {
            reload()

        } finally {

            for (i in 1..FireType.spendedBullets) {
                Ammo.removeAt(Ammo.size - 1)
            }
            return FireType.spendedBullets
        }
    }

    fun noAmmoException() {
        if (Ammo.isEmpty())
        throw NoAmmoException ()
    }




}