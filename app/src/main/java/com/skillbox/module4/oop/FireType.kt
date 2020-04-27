package com.skillbox.module4.oop

sealed class FireType(val spendedBullets: Int) {
    object Single : FireType(1)
    object Bursting : FireType(5)
}
