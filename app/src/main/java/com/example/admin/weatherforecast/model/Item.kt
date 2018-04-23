package com.example.nascenia.quartergoal.model.Weather.com.example.nascenia.quartergoal

import com.example.nascenia.quartergoal.model.Forecast
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Item {

    @SerializedName("title")
    @Expose
    var title: String? = null
        get() = field
        set(value) {
            field = value
        }
    @SerializedName("lat")
    @Expose
    var lat: String? = null
        get() = field
        set(value) {
            field = value
        }
    @SerializedName("long")
    @Expose
    var long: String? = null
        get() = field
        set(value) {
            field = value
        }
    @SerializedName("link")
    @Expose
    var link: String? = null
        get() = field
        set(value) {
            field = value
        }
    @SerializedName("pubDate")
    @Expose
    var pubDate: String? = null
        get() = field
        set(value) {
            field = value
        }
    @SerializedName("condition")
    @Expose
    var condition: Condition? = null
        get() = field
        set(value) {
            field = value
        }
    @SerializedName("forecast")
    @Expose
    var forecast: List<Forecast>? = null
        get() = field
        set(value) {
            field = value
        }
    @SerializedName("description")
    @Expose
    var description: String? = null
        get() = field
        set(value) {
            field = value
        }
    @SerializedName("guid")
    @Expose
    var guid: Guid? = null
        get() = field
        set(value) {
            field = value
        }

}
