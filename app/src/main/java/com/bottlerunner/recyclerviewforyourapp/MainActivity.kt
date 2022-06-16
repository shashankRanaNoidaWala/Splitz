package com.bottlerunner.recyclerviewforyourapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rvTodos = findViewById<RecyclerView>(R.id.rvTodos)
//        val btnAddTodo = findViewById<Button>(R.id.btnAddTodo)
//        val etTodo = findViewById<EditText>(R.id.etTodo)

        var groupList = mutableListOf(
            Group("Bogmalo Russia", mutableListOf(Person("Shashank",10.1),Person("Akshat",15.0))),
            Group("Rangeela", mutableListOf(Person("Adit",10.5),Person("Akshat",15.0))),
            Group("Yellow sp", mutableListOf(Person("Ramu",10.5),Person("Akshat",15.0))),
            Group("Malakkar", mutableListOf(Person("Adit",10.5),Person("Pappu",15.0))),
            Group("Rangeela", mutableListOf(Person("Adit",10.5),Person("Akshat",15.0))),
            Group("RC", mutableListOf(Person("Adit",10.5),Person("Rana",15.0))),
            Group("Rangeela", mutableListOf(Person("Adit",10.5),Person("Akshat",15.0))),
            Group("Yellow sp", mutableListOf(Person("Ramu",10.5),Person("Akshat",15.0))),
            Group("Rangeela", mutableListOf(Person("Adit",10.5),Person("Akshat",15.0))),
            Group("Yellow sp", mutableListOf(Person("Ramu",10.5),Person("Akshat",15.0))),
            Group("Yellow sp", mutableListOf(Person("Ramu",10.5),Person("Akshat",15.0))),
            Group("Yellow sp", mutableListOf(Person("Ramu",10.5),Person("Akshat",15.0))),
        )

        val adapter = GroupAdapter(this, groupList)
        rvTodos.adapter = adapter                                           //and this

        rvTodos.layoutManager = LinearLayoutManager(this)          //What is this

//        btnAddTodo.setOnClickListener {
//            val title =etTodo.text.toString()
//            val todo = Todo(title, false)
//            todoList.add(todo)      //add is always added to the end
//            adapter.notifyItemInserted(todoList.size -1)      // Yeh batata he code ko kii iss jagah hamne updte kiya he, wahan dekhle bhai, har jagah mat dekhiyo
//        }
        //setting up my recycler view fa fa fa fa
    }
}