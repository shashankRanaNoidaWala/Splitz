package com.bottlerunner.recyclerviewforyourapp

class Person(var name:Int, var balance:Double) {

    fun reset(){
        balance = 0.0
    }

    fun gives_money(money:Int){
        balance = balance - money
    }

    fun takes_money(money:Int){
        balance = balance + money
    }
}