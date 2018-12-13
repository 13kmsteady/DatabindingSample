package com.i3kmsteady.databindingsample.ui


import android.arch.lifecycle.ViewModelProviders
import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.i3kmsteady.databindingsample.R
import com.i3kmsteady.databindingsample.databinding.ActivitySpinnerBinding

class SpinnerActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_spinner)
        val viewModel = ViewModelProviders
            .of(this)
            .get(SpinnerViewModel::class.java)
        val binding: ActivitySpinnerBinding = DataBindingUtil.setContentView(this, R.layout.activity_spinner)
        binding.let {
            it.viewModel = viewModel
            it.setLifecycleOwner(this)
        }
    }
}
