package com.i3kmsteady.databindingsample.ui

import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.i3kmsteady.databindingsample.R
import com.i3kmsteady.databindingsample.databinding.ActivityObservableBinding
import com.i3kmsteady.databindingsample.entity.Person
import com.i3kmsteady.databindingsample.event.Presenter

class ObservableActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityObservableBinding = DataBindingUtil.setContentView(this, R.layout.activity_observable)
        val person = Person()
        person.firstName = "Java"
        person.lastName = "Kotlin"
        binding.person = person
        binding.presenter = Presenter(this)
    }
}
