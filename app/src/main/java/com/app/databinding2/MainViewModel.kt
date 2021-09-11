package com.app.databinding2

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import java.io.ObjectInput

class MainViewModel(startingTotal : Int) : ViewModel() {

    private var total = 0

    init {
        total = startingTotal
    }

    fun getTotal(): Int{
        return total
    }

    fun  setTotal(input: Int){
        total += input


    }


}