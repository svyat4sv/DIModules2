package com.example.fragment_1

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject


@HiltViewModel
class ViewModel1 @Inject constructor(private val repository: Repository) : ViewModel() {

    val number = MutableStateFlow(0)

    fun makeNum(){
        viewModelScope.launch {
            number.emit(repository.makeNumber())
        }
    }
}