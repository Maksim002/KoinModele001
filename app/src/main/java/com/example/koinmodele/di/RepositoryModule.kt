package com.example.koinmodele.di

import com.example.koinmodele.api.BaseRepository
import com.example.koinmodele.api.RepositoryImpl
import org.koin.dsl.module

// добовление в модуль
val repositoryModule = module {

    single<BaseRepository> {
        RepositoryImpl(get())
    }

}
