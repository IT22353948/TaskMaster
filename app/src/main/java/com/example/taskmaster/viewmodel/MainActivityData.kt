package com.example.taskmaster.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.taskmaster.entities.Todo

class MainActivityData: ViewModel() {
    private val _data = MutableLiveData<List<Todo>>()

    val data: LiveData<List<Todo>> = _data

    fun setData(data: List<Todo>){
        _data.value = data
    }

}