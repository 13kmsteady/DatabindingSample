package com.i3kmsteady.databindingsample.event

import android.content.Context
import android.widget.Toast
import com.i3kmsteady.databindingsample.entity.Person
import com.i3kmsteady.databindingsample.entity.Task
import kotlin.random.Random


class Presenter(val context: Context) {

    fun onSaveClick(task: Task) {
        Toast.makeText(context, task.toString(), Toast.LENGTH_LONG).show()
    }

    fun updateName(person: Person) {
        person.firstName = "Kotlin: " + Random.nextInt()
    }
}