package com.example.nascenia.quartergoal.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Forecast {

    @SerializedName("code")
    @Expose
    var code: String? = null
        get() = field
        set(value) {
            field = value
        }
    @SerializedName("date")
    @Expose
    var date: String? = null
        get() = field
        set(value) {
            field = value
        }
    @SerializedName("day")
    @Expose
    var day: String? = null
        get() = field
        set(value) {
            field = value
        }
    @SerializedName("high")
    @Expose
    var high: String? = null
        get() = field
        set(value) {
            field = value
        }
    @SerializedName("low")
    @Expose
    var low: String? = null
        get() = field
        set(value) {
            field = value
        }
    @SerializedName("text")
    @Expose
    var text: String? = null
        get() = field
        set(value) {
            field = value
        }

}
