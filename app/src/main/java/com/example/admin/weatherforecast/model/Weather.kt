package com.example.nascenia.quartergoal.model.Weather.com.example.nascenia.quartergoal

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Weather {

    @SerializedName("query")
    @Expose
    var query: Query? = null
        get() = field
        set(value) {
            field = value
        }

}
