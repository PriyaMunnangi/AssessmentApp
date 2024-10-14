package com.example.assessment.di

import com.example.assessment.data.repository.HiringRepository
import com.example.assessment.data.repository.HiringRepositoryImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class ServiceModule {

    @Binds
    @Singleton
    abstract fun provideHiringRepository(
         hiringRepositoryImpl: HiringRepositoryImpl
    ): HiringRepository
}