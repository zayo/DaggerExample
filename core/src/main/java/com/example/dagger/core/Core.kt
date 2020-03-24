package com.example.dagger.core

object Core {

    private lateinit var provisions: CoreProvisions

    public fun init(provisions: CoreProvisions){
        this.provisions = provisions
    }
}