package com.example.dagger

import com.example.dagger.core.AppObject
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AppObjectModule {

    @Provides
    @Singleton
    fun createAppObject() = AppObject()
}
