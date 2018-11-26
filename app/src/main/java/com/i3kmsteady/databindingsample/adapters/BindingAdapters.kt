package com.i3kmsteady.databindingsample.adapters

import android.databinding.BindingAdapter
import android.view.View

@BindingAdapter("isGone")
fun bindIsGone(view: View, age: Int) {
    if (age > 13) {
        view.visibility = View.VISIBLE
    } else {
        view.visibility = View.GONE
    }
}