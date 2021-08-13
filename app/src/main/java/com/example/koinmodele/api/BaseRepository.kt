package com.example.koinmodele.api

import androidx.lifecycle.LiveData
import com.example.testkoin.model.ExampleModel
import com.timelysoft.tsjdomcom.service.ResultStatus

interface BaseRepository {
    fun requestCountryDetails() : LiveData<ResultStatus<ExampleModel>>
}