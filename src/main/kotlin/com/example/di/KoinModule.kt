package com.example.di

import com.example.repository.SailorMoonRepository
import com.example.repository.SailorMoonRepositoryImpl
import org.koin.dsl.module

val koinModule = module {
    single<SailorMoonRepository>{
        SailorMoonRepositoryImpl()
    }
}

