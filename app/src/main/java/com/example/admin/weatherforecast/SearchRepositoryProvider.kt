package com.segunfamisa.kotlin.samples.retrofit.data.kotlin

import com.example.admin.weatherforecast.APIInterface.APIInterface


object SearchRepositoryProvider {

    fun provideSearchRepository(): SearchRepository {
        return SearchRepository(APIInterface.Factory.create())
    }

}