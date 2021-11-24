package com.droidli.daggercleanarc.data.repository

import com.droidli.daggercleanarc.data.datasource.ExampleLocalDataSource
import com.droidli.daggercleanarc.data.datasource.ExampleRemoteDataSource
import com.droidli.daggercleanarc.data.mapper.ExampleMapper
import com.droidli.daggercleanarc.domain.ExampleRepository
import javax.inject.Inject

class ExampleRepositoryImpl @Inject constructor(
    private val localDataSource: ExampleLocalDataSource,
    private val remoteDataSource: ExampleRemoteDataSource,
    private val mapper: ExampleMapper
) : ExampleRepository {

    override fun method() {
        mapper.map()
        localDataSource.method()
        remoteDataSource.method()
    }
}