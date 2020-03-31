package com.skillbox.module4.oop

class Team (val numberOfWarriors: Int = 0) {

    var warriorList = mutableListOf<AbstractWarrior>()

     fun recruting() {
        for (i in 1..numberOfWarriors)
            if (Math.random() < 50) {
                warriorList.add(Soldier())
            }
        if (Math.random() < 80) {
            warriorList.add(Jeggernaut())
        }
        if (Math.random() < 95) {
            warriorList.add(Officer())
        } else {
            warriorList.add(Sniper())
        }


    }
}

