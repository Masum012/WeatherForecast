package com.example.nascenia.quartergoal.model.Weather.com.example.nascenia.quartergoal

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Location {

    @SerializedName("city")
    @Expose
    var city: String? = null
        get() = field
        set(value) {
            field = value
        }
    @SerializedName("country")
    @Expose
    var country: String? = null
        get() = field
        set(value) {
            field = value
        }
    @SerializedName("region")
    @Expose
    var region: String? = null
        get() = field
        set(value) {
            field = value
        }

}
