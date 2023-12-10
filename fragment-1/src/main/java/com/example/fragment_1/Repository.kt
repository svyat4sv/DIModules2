package com.example.fragment_1

import javax.inject.Inject

class Repository @Inject constructor() {

    fun makeNumber() = (0..100000).random()

}
