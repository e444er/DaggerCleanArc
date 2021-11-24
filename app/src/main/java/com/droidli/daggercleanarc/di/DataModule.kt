package com.droidli.daggercleanarc.di

import com.droidli.daggercleanarc.data.datasource.ExampleLocalDataSource
import com.droidli.daggercleanarc.data.datasource.ExampleLocalDataSourceImpl
import com.droidli.daggercleanarc.data.datasource.ExampleRemoteDataSource
import com.droidli.daggercleanarc.data.datasource.ExampleRemoteDataSourceImpl
import dagger.Binds
import dagger.Module

@Module
interface DataModule {


    @Binds
    fun bindLocalData(impl: ExampleLocalDataSourceImpl): ExampleLocalDataSource {
        return impl
    }

    @Binds
    fun bindRemoteData(impl: ExampleRemoteDataSourceImpl): ExampleRemoteDataSource {
        return impl
    }
}