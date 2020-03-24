package com.example.dagger.dagger_lib

import com.example.dagger.core.CoreProvisions
import javax.inject.Inject

internal class DaggerLibObjectInitializer
@Inject
internal constructor(private val provisions: CoreProvisions) {
    internal fun createDaggerLibObject() = DaggerLibObject(provisions.getAppObject())
}
