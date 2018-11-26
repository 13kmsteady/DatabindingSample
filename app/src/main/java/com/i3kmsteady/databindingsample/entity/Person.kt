package com.i3kmsteady.databindingsample.entity

import android.databinding.BaseObservable
import android.databinding.Bindable
import com.i3kmsteady.databindingsample.BR

class Person : BaseObservable() {

    @get:Bindable
    var firstName: String = ""
        set(value) {
            field = value
            notifyPropertyChanged(BR.firstName)
        }

    @get:Bindable
    var lastName: String = ""
        set(value) {
            field = value
            notifyPropertyChanged(BR.firstName)
        }
}