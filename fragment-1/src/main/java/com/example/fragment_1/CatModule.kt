package com.example.fragment_1

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent


@Module
@InstallIn(ActivityComponent::class)
class CatModule {
    @Provides
    fun makeCat() = Cat()
}