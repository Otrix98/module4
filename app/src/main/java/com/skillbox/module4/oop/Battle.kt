package com.skillbox.module4.oop

import com.skillbox.module4.oop.Ammo as Ammo


fun main () {
    val standart = Ammo(50, 50, 60)
    standart.criticalDamage()
    standart.CurrentDamage()

    val piercing = Ammo( 60, 70, 80)
    piercing.criticalDamage()
    piercing.CurrentDamage()

    val Incendiary = Ammo( 80, 30, 90)
    Incendiary.criticalDamage()
    Incendiary.CurrentDamage()

}
