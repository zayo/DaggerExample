package com.example.dagger.dagger_lib

import com.example.dagger.core.CoreProvisions

internal class LibObjectInitializer(private val provisions: CoreProvisions) {
    internal fun createLibObject() = LibObject(provisions.getAppObject())
}
