package com.example.nascenia.quartergoal.model.Weather.com.example.nascenia.quartergoal

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Atmosphere {

    @SerializedName("humidity")
    @Expose
    var humidity: String? = null
        get() = field
        set(value) {
            field = value
        }
    @SerializedName("pressure")
    @Expose
    var pressure: String? = null
        get() = field
        set(value) {
            field = value
        }
    @SerializedName("rising")
    @Expose
    var rising: String? = null
        get() = field
        set(value) {
            field = value
        }
    @SerializedName("visibility")
    @Expose
    var visibility: String? = null
        get() = field
        set(value) {
            field = value
        }

}
