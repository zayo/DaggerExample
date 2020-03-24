package com.example.dagger.lib

import com.example.dagger.core.CoreProvisions
import com.example.dagger.dagger_lib.LibObject
import com.example.dagger.dagger_lib.LibObjectInitializer

object Lib {

    private lateinit var initializer: LibObjectInitializer

    val libObject: LibObject
        get() = initializer.createLibObject()

    fun init(provisions: CoreProvisions) {
        initializer = LibObjectInitializer(provisions)
    }
}