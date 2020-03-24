package com.example.dagger.dagger_lib

import com.example.dagger.core.CoreProvisions

object DaggerLib {

    private lateinit var component: DaggerLibComponent

    val daggerLibObject: DaggerLibObject
        get() = component.getDaggerLibObject()

    fun init(provisions: CoreProvisions) {
        /**
         * By this, we have created DaggerLibComponent. So we have a graph of OUR component. The provisions are
         * available in this component.
         */
        component = DaggerDaggerLibComponent.builder()
            .provisions(provisions)
            .build()

        /**
         * In this module, we are creating objects through dagger. So graph is initialized,
         * DaggerLibObjectInitializer can be created and DaggerLibObject can be created to become part of the graph.
         * So at this moment it's safe to access DaggerLib.daggerLibObject from the outside.
         */
    }
}