package com.example.nascenia.quartergoal.model.Weather.com.example.nascenia.quartergoal

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Channel {

    @SerializedName("units")
    @Expose
    var units: Units? = null
        get() = field
        set(value) {
            field = value
        }
    @SerializedName("title")
    @Expose
    var title: String? = null
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
    @SerializedName("description")
    @Expose
    var description: String? = null
        get() = field
        set(value) {
            field = value
        }
    @SerializedName("language")
    @Expose
    var language: String? = null
        get() = field
        set(value) {
            field = value
        }
    @SerializedName("lastBuildDate")
    @Expose
    var lastBuildDate: String? = null
        get() = field
        set(value) {
            field = value
        }
    @SerializedName("ttl")
    @Expose
    var ttl: String? = null
        get() = field
        set(value) {
            field = value
        }
    @SerializedName("location")
    @Expose
    var location: Location? = null
        get() = field
        set(value) {
            field = value
        }
    @SerializedName("wind")
    @Expose
    var wind: Wind? = null
        get() = field
        set(value) {
            field = value
        }
    @SerializedName("atmosphere")
    @Expose
    var atmosphere: Atmosphere? = null
        get() = field
        set(value) {
            field = value
        }
    @SerializedName("astronomy")
    @Expose
    var astronomy: Astronomy? = null
        get() = field
        set(value) {
            field = value
        }
    @SerializedName("image")
    @Expose
    var image: Image? = null
        get() = field
        set(value) {
            field = value
        }
    @SerializedName("item")
    @Expose
    var item: Item? = null
        get() = field
        set(value) {
            field = value
        }

}
