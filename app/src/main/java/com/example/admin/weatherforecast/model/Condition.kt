package com.example.nascenia.quartergoal.model.Weather.com.example.nascenia.quartergoal

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Condition {

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
    @SerializedName("temp")
    @Expose
    var temp: String? = null
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
