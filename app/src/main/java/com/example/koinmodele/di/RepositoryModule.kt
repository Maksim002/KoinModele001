package com.example.koinmodele.di

import com.example.koinmodele.api.BaseRepository
import com.example.koinmodele.api.Repository
import org.koin.dsl.module

// добовление в модуль
val repositoryModule = module {

    single<BaseRepository> {
        Repository(get())
    }

}
