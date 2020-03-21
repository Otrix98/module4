package com.skillbox.module4.oop

object Weapons {

        val rifle = object : AbstractWeapon(30, FireType.Bursting) {
            override fun createAmmo(): Ammo {
                com.skillbox.module4.oop.Ammo.TYPE_A.calcDamage()
                return com.skillbox.module4.oop.Ammo.TYPE_A
            }
        }

        val shotgun = object : AbstractWeapon(8, FireType.Single) {
            override fun createAmmo(): Ammo {
                com.skillbox.module4.oop.Ammo.TYPE_B.calcDamage()
                return com.skillbox.module4.oop.Ammo.TYPE_B
            }
        }

        val pistol = object : AbstractWeapon(10, FireType.Single) {
            override fun createAmmo(): Ammo {
                com.skillbox.module4.oop.Ammo.TYPE_C.calcDamage()
                return com.skillbox.module4.oop.Ammo.TYPE_C
            }
        }

         val sniperRifle = object : AbstractWeapon(10, FireType.Single) {
        override fun createAmmo(): Ammo {
            com.skillbox.module4.oop.Ammo.TYPE_A.calcDamage()
            return com.skillbox.module4.oop.Ammo.TYPE_A
            }
        }
    }
