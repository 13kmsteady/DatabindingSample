package com.i3kmsteady.databindingsample.ui

import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.i3kmsteady.databindingsample.event.MyHandlers
import com.i3kmsteady.databindingsample.event.Presenter
import com.i3kmsteady.databindingsample.R
import com.i3kmsteady.databindingsample.databinding.ActivityEventBinding
import com.i3kmsteady.databindingsample.entity.Task
import com.i3kmsteady.databindingsample.entity.User

class EventActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityEventBinding = DataBindingUtil.setContentView(this, R.layout.activity_event)
        binding.user = User(getString(R.string.method_references), getString(R.string.event_binding), 24)
        binding.task = Task("MVVM", 1)
        binding.handlers = MyHandlers()
        binding.presenter = Presenter(this)
    }
}
