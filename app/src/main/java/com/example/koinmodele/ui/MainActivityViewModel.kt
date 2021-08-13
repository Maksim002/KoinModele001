package com.example.android_di_koin_example.ui

import androidx.lifecycle.*
import com.example.koinmodele.api.BaseRepository
import com.example.testkoin.model.ExampleModel
import com.timelysoft.tsjdomcom.service.ResultStatus

class MainActivityViewModel constructor(private val baseRep : BaseRepository): ViewModel() {

    fun requestCountry() : LiveData<ResultStatus<ExampleModel>> {
        return baseRep.requestCountryDetails()
    }
}