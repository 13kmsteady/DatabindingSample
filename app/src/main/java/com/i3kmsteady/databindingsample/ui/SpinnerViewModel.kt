package com.i3kmsteady.databindingsample.ui

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel

class SpinnerViewModel : ViewModel() {

    val items = arrayListOf("苍井空", "波多野结衣", "武藤兰", "泷泽萝拉")

    val itemPosition = MutableLiveData<Int>()

    private val selectItem
        get() = itemPosition.value?.let {
            items.get(it)
        }

    fun choose() {
        println("选择的是: $selectItem")
    }
}