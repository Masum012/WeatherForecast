package com.example.admin.weatherforecast

import android.graphics.BitmapFactory
import android.support.design.widget.CollapsingToolbarLayout
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.graphics.Palette
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.LinearLayout
import android.widget.ProgressBar
import android.widget.TextView
import com.example.admin.weatherforecast.adapter.CustomAdapter
import com.example.nascenia.quartergoal.model.Forecast
import com.segunfamisa.kotlin.samples.retrofit.data.kotlin.SearchRepositoryProvider
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers

class MainActivity : AppCompatActivity() {

    var forecast = ArrayList<Forecast>()
    var sunrise: TextView? = null
    var sunset: TextView? = null
    var sunriseLabel: TextView? = null
    var sunsetLabel: TextView? = null
    var temperature: TextView? = null
    var location: TextView? = null
    var progressWheel: ProgressBar? = null

    val compositeDisposable: CompositeDisposable = CompositeDisposable()
    private var collapsingToolbarLayout: CollapsingToolbarLayout? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        sunrise = findViewById(R.id.sunrise_time) as TextView
        sunset = findViewById(R.id.sunset_time) as TextView
        sunriseLabel = findViewById(R.id.sunrise_label) as TextView
        sunsetLabel = findViewById(R.id.sunset_label) as TextView
        temperature = findViewById(R.id.temperature) as TextView
        location = findViewById(R.id.location) as TextView
        progressWheel = findViewById(R.id.progress_wheel) as ProgressBar
        progressWheel!!.visibility = View.VISIBLE
        progressWheel!!.getIndeterminateDrawable().setColorFilter(0xFFcc0000.toInt(),
                android.graphics.PorterDuff.Mode.MULTIPLY)

        val repository = SearchRepositoryProvider.provideSearchRepository()

        compositeDisposable.add(
                repository.searchUsers("Lagos", "Java")
                        .observeOn(AndroidSchedulers.mainThread())
                        .subscribeOn(Schedulers.io())
                        .subscribe ({
                            result ->
                                forecast = (result.query!!.results!!.channel!!.item!!.forecast as ArrayList<Forecast>?)!!
                                sunrise!!.text = result.query!!.results!!.channel!!.astronomy!!.sunrise
                                sunset!!.text = result.query!!.results!!.channel!!.astronomy!!.sunset
                                temperature!!.text = result.query!!.results!!.channel!!.item!!.condition!!.temp + "ºC"
                                location!!.text = result.query!!.results!!.channel!!.location!!.city+ ", "+result.query!!.results!!.channel!!.location!!.region+ ", "+result.query!!.results!!.channel!!.location!!.country

                                sunriseLabel!!.visibility = View.VISIBLE
                                sunsetLabel!!.visibility = View.VISIBLE
                            val rv = findViewById(R.id.recycler_view) as RecyclerView
                            rv.layoutManager = LinearLayoutManager(this, LinearLayout.VERTICAL, false)
                            var adapter = CustomAdapter(forecast,this)
                            rv.adapter = adapter
                            //results.channel.item.forecast
                            progressWheel!!.visibility = View.GONE
                        }, { error ->
                            error.printStackTrace()
                        })
        )

        collapsingToolbarLayout = findViewById(R.id.collapsing_toolbar) as CollapsingToolbarLayout
        collapsingToolbarLayout!!.title = "Weather Forecast"

        dynamicColor()



    }

    private fun dynamicColor() {
        val bitmap = BitmapFactory.decodeResource(resources, R.drawable.nature_one)
        Palette.from(bitmap).generate { palette ->
            collapsingToolbarLayout!!.setContentScrimColor(palette.getMutedColor(resources.getColor(R.color.colorPrimary)))
            collapsingToolbarLayout!!.setStatusBarScrimColor(palette.getMutedColor(resources.getColor(R.color.colorAccent)))
        }
    }


}
