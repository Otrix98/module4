package com.skillbox.module4.oop

class Team (val numberOfWarriors: Int = 0) {

    var warriorList = mutableListOf<AbstractWarrior>()

     fun recruting() {
         val random = Math.random()

         for (i in 1..numberOfWarriors){
             if (random < 50) {
                 warriorList.add(Soldier())
             }
             else if (random < 80) {
                 warriorList.add(Jeggernaut())
             }
             else if (random < 95) {
                 warriorList.add(Officer())
             } else {
                 warriorList.add(Sniper())
             }
         }


    }
}

