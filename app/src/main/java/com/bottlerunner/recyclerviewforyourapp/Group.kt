package com.bottlerunner.recyclerviewforyourapp

class Group(
    var name:String, var people:MutableList<Person>){

    fun change_name( new_name:String){
        name = new_name
    }

    fun add_person(new_person:Person){
        people.toMutableList()
        people.add(new_person)
    }

    fun remove_person(purged_person:Person){
        people.remove(purged_person)
    }

    fun reset(){
        people = (emptyList<Person>() as MutableList<Person>)
    }
}