package com.i3kmsteady.databindingsample.ui

import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.i3kmsteady.databindingsample.R
import com.i3kmsteady.databindingsample.databinding.ActivityBasicBinding
import com.i3kmsteady.databindingsample.entity.User

class BasicActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_basic)
        val binding: ActivityBasicBinding = DataBindingUtil.setContentView(this, R.layout.activity_basic)
        binding.user = User("steady", "13km", 24)
    }
}
