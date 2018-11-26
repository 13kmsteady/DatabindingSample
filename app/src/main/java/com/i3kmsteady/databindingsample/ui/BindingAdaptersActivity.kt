package com.i3kmsteady.databindingsample.ui

import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.i3kmsteady.databindingsample.R
import com.i3kmsteady.databindingsample.databinding.ActivityBindingAdaptersBinding

class BindingAdaptersActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_binding_adapters)
        val binding: ActivityBindingAdaptersBinding =
            DataBindingUtil.setContentView(this, R.layout.activity_binding_adapters)
        binding.age = 11
    }
}
