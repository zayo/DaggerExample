package com.example.dagger

import android.app.Application
import com.example.dagger.dagger_lib.DaggerLib
import com.example.dagger.lib.Lib

class App : Application() {

    init {
        INSTANCE = this
    }

    val component: AppComponent by lazy {
        DaggerAppComponent.builder()
            .context(this)
            .build().also {
                DaggerLib.init(it)
                Lib.init(it)
            }
    }

    companion object {
        @JvmStatic
        lateinit var INSTANCE : App
    }
}