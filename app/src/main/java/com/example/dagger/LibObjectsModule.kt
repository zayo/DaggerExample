package com.example.dagger

import com.example.dagger.dagger_lib.DaggerLib
import com.example.dagger.lib.Lib
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class LibObjectsModule {

    @Provides
    @Singleton
    fun provideDaggerLibObject() = DaggerLib.daggerLibObject

    @Provides
    @Singleton
    fun provideLibObject() = Lib.libObject
}