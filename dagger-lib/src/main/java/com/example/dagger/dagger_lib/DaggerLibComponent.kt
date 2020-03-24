package com.example.dagger.dagger_lib

import com.example.dagger.core.CoreProvisions
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

/**
 * Notice, that all dagger usage in this module is internal. :app, nor :core doesn't know it exists inside.
 */
@Singleton
@Component(
    modules = [DaggerLibObjectModule::class],
    dependencies = [CoreProvisions::class]
)
internal interface DaggerLibComponent {

    fun getDaggerLibObject(): DaggerLibObject

    @Component.Builder
    interface Builder {
        fun provisions(provisions: CoreProvisions): Builder

        fun build(): DaggerLibComponent
    }
}