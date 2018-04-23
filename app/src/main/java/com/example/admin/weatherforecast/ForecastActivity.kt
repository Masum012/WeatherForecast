package com.example.admin.weatherforecast

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ForecastActivity : AppCompatActivity() {
    var date: TextView? = null
    var day: TextView? = null
    var highTemperature: TextView? = null
    var lowTemperature: TextView? = null
    var forecast: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forecast)

        date = findViewById(R.id.date) as TextView
        day = findViewById(R.id.day) as TextView
        highTemperature = findViewById(R.id.high_temperature) as TextView
        lowTemperature = findViewById(R.id.low_temperature) as TextView
        forecast = findViewById(R.id.forecast) as TextView

        date!!.text = intent.extras.get("date") as CharSequence?
        day!!.text = intent.extras.get("day") as CharSequence?
        highTemperature!!.text = intent.extras.get("high")  as CharSequence?
        lowTemperature!!.text = intent.extras.get("low") as CharSequence?
        forecast!!.text =intent.extras.get("text") as CharSequence?
        highTemperature!!.append("ºC")
        lowTemperature!!.append("ºC")
    }
}

