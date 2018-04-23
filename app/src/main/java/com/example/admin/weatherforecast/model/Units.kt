package com.example.nascenia.quartergoal.model.Weather.com.example.nascenia.quartergoal

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Units {

    @SerializedName("distance")
    @Expose
    var distance: String? = null
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
    @SerializedName("speed")
    @Expose
    var speed: String? = null
        get() = field
        set(value) {
            field = value
        }
    @SerializedName("temperature")
    @Expose
    var temperature: String? = null
        get() = field
        set(value) {
            field = value
        }

}
