package com.i3kmsteady.databindingsample

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.i3kmsteady.databindingsample.ui.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnBasic.setOnClickListener {
            startActivity(Intent(this, BasicActivity::class.java))
        }
        btnExpressions.setOnClickListener {
            startActivity(Intent(this, ExpressionsActivity::class.java))
        }
        btnEvent.setOnClickListener {
            startActivity(Intent(this, EventActivity::class.java))
        }
        btnObservable.setOnClickListener {
            startActivity(Intent(this, ObservableActivity::class.java))
        }
        btnAdapters.setOnClickListener {
            startActivity(Intent(this, BindingAdaptersActivity::class.java))
        }
        btnSpinner.setOnClickListener {
            startActivity(Intent(this, SpinnerActivity::class.java))
        }
    }

}
