package com.example.dagger.lib

import com.example.dagger.core.CoreProvisions
import com.example.dagger.lib.LibObject

internal class LibObjectInitializer(private val provisions: CoreProvisions) {
    internal fun createLibObject() = LibObject(provisions.getAppObject())
}
