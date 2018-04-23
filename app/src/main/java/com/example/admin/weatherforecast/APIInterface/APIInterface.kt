package com.example.admin.weatherforecast.APIInterface

import com.example.nascenia.quartergoal.model.Weather.com.example.nascenia.quartergoal.Weather
import retrofit2.http.GET

/**
 * Created by nascenia on 4/16/2018.
 */
interface APIInterface {
    @GET("/v1/public/yql?q=select%20*%20from%20weather.forecast%20where%20woeid%20in%20(select%20woeid%20from%20geo.places(1)%20where%20text%3D%22nome%2C%20ak%22)&format=json&env=store%3A%2F%2Fdatatables.org%2Falltableswithkeys")
    fun searchArtist():  io.reactivex.Observable<Weather>

    companion object Factory {
        fun create(): APIInterface {
            val retrofit = retrofit2.Retrofit.Builder()
                    .addCallAdapterFactory(retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory.create())
                    .addConverterFactory(retrofit2.converter.gson.GsonConverterFactory.create())
                    .baseUrl("https://query.yahooapis.com")
                    .build()

            return retrofit.create(APIInterface::class.java);
        }
    }
}