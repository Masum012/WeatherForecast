package com.example.nascenia.quartergoal.model.Weather.com.example.nascenia.quartergoal

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Results {

    @SerializedName("channel")
    @Expose
    var channel: Channel? = null
        get() = field
        set(value) {
            field = value
        }

}
