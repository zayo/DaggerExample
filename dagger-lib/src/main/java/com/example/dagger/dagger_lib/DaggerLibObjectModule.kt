package com.example.dagger.dagger_lib

import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
internal class DaggerLibObjectModule {

    @Provides
    @Singleton
    internal fun provideDaggerLibObject(initializer: DaggerLibObjectInitializer): DaggerLibObject =
        initializer.createDaggerLibObject()
}