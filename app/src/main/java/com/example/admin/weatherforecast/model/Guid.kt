package com.example.nascenia.quartergoal.model.Weather.com.example.nascenia.quartergoal

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Guid {

    @SerializedName("isPermaLink")
    @Expose
    var isPermaLink: String? = null
        get() = field
        set(value) {
            field = value
        }

}
