package com.example.nascenia.quartergoal.model.Weather.com.example.nascenia.quartergoal

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Query {

    @SerializedName("count")
    @Expose
    var count: Int? = null
        get() = field
        set(value) {
            field = value
        }
    @SerializedName("created")
    @Expose
    var created: String? = null
        get() = field
        set(value) {
            field = value
        }
    @SerializedName("lang")
    @Expose
    var lang: String? = null
        get() = field
        set(value) {
            field = value
        }
    @SerializedName("results")
    @Expose
    var results: Results? = null
        get() = field
        set(value) {
            field = value
        }

}
