package com.droidli.daggercleanarc.presentation

import com.droidli.daggercleanarc.domain.ExampleUseCase
import javax.inject.Inject

class ExampleViewModel @Inject constructor(
    private val useCase: ExampleUseCase
) {

    fun method() {
        useCase()
    }
}