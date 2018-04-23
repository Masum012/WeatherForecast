package com.segunfamisa.kotlin.samples.retrofit.data.kotlin

import com.example.admin.weatherforecast.APIInterface.APIInterface
import com.example.nascenia.quartergoal.model.Weather.com.example.nascenia.quartergoal.Weather

/**
 * Repository method to access search functionality of the api service
 */
class SearchRepository(val apiService: APIInterface) {

    fun searchUsers(location: String, language: String): io.reactivex.Observable<Weather> {
        return apiService.searchArtist()
    }

}