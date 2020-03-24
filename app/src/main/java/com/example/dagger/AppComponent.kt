package com.example.dagger

import android.content.Context
import com.example.dagger.core.CoreProvisions
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [
    AppObjectModule::class,
    LibObjectsModule::class
])
interface AppComponent : CoreProvisions {

    fun inject(activity: MainActivity)

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun context(context: Context): Builder

        fun build(): AppComponent
    }
}