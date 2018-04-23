package com.example.nascenia.quartergoal.model.Weather.com.example.nascenia.quartergoal

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Image {

    @SerializedName("title")
    @Expose
    var title: String? = null
        get() = field
        set(value) {
            field = value
        }
    @SerializedName("width")
    @Expose
    var width: String? = null
        get() = field
        set(value) {
            field = value
        }
    @SerializedName("height")
    @Expose
    var height: String? = null
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
    @SerializedName("url")
    @Expose
    var url: String? = null
        get() = field
        set(value) {
            field = value
        }

}
