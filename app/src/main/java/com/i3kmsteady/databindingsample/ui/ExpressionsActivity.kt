package com.i3kmsteady.databindingsample.ui

import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.i3kmsteady.databindingsample.R
import com.i3kmsteady.databindingsample.databinding.ActivityExpressionsBinding
import com.i3kmsteady.databindingsample.entity.User

class ExpressionsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityExpressionsBinding = DataBindingUtil.setContentView(this, R.layout.activity_expressions)
        binding.user = User("steady", null, 12)
    }
}
