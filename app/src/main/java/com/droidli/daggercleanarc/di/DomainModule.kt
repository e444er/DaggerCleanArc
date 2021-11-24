package com.droidli.daggercleanarc.di

import com.droidli.daggercleanarc.data.repository.ExampleRepositoryImpl
import com.droidli.daggercleanarc.domain.ExampleRepository
import dagger.Binds
import dagger.Module

@Module
abstract class DomainModule {

    @Binds
    abstract fun bindRepository(impl: ExampleRepositoryImpl): ExampleRepository
}