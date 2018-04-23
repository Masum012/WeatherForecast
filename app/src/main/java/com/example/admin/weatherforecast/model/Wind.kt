package com.example.nascenia.quartergoal.model.Weather.com.example.nascenia.quartergoal

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Wind {

    @SerializedName("chill")
    @Expose
    var chill: String? = null
        get() = field
        set(value) {
            field = value
        }
    @SerializedName("direction")
    @Expose
    var direction: String? = null
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

}
