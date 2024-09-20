package com.example.basicstate.viewmodel

import android.util.Log
import androidx.compose.runtime.toMutableStateList
import androidx.lifecycle.ViewModel
import com.example.basicstate.data.WellnessTask

class WellnessViewModel : ViewModel() {
    private val _tasks = getWellnessTasks().toMutableStateList()
    val tasks: List<WellnessTask>
        get() = _tasks

    fun remove(item: WellnessTask) {
        Log.d("WellnessViewModel", "remove $item")
        _tasks.remove(item)
    }
}


private fun getWellnessTasks() = List(30) { i -> WellnessTask(i, "Task #$i") }