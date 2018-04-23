package com.example.nascenia.quartergoal.model.Weather.com.example.nascenia.quartergoal

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Astronomy {

    @SerializedName("sunrise")
    @Expose
    var sunrise: String? = null
        get() = field
        set(value) {
            field = value
        }
    @SerializedName("sunset")
    @Expose
    var sunset: String? = null
        get() = field
        set(value) {
            field = value
        }

}
