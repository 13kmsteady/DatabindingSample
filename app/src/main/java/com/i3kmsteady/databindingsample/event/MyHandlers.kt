package com.i3kmsteady.databindingsample.event

import android.view.View
import android.widget.Toast

class MyHandlers {

    fun onClickFriend(view: View) {
        Toast.makeText(view.context, "方法引用", Toast.LENGTH_LONG).show()
    }

}