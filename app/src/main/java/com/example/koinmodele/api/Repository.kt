package com.example.koinmodele.api

import androidx.lifecycle.LiveData
import androidx.lifecycle.liveData
import com.example.android_di_koin_example.api.ApiServise
import com.example.testkoin.model.ExampleModel
import com.timelysoft.tsjdomcom.service.ResultStatus
import kotlinx.coroutines.Dispatchers

//Несмог отсюда запустить проект запрос
class Repository(private val apiServise: ApiServise): BaseRepository {
    override fun requestCountryDetails(): LiveData<ResultStatus<ExampleModel>> {
        val result  = liveData<ResultStatus<ExampleModel>>(Dispatchers.IO) {
            try {
                val response = apiServise.news()
                when {
                    response.isSuccessful -> {
                        if (response.body() != null) {
                            emit(ResultStatus.success(response.body()))
                        } else {
                            emit(ResultStatus.error("Ошибка при получении данных"))
                        }
                    }
                    else -> {
                        emit(ResultStatus.error("Не известная ошибка"))
                    }
                }
            } catch (e: Exception) {
                emit(ResultStatus.netwrok("Проблеммы с подключением интернета", null))
            }
        }
        return result
    }
}