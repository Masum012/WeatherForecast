package com.example.admin.weatherforecast.adapter

/**
 * Created by nascenia on 4/16/2018.
 */
import android.content.Context
import android.content.Intent
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import com.example.admin.weatherforecast.ForecastActivity
import com.example.admin.weatherforecast.R
import com.example.nascenia.quartergoal.model.Forecast

class CustomAdapter(val userList: ArrayList<Forecast>, val context: Context): RecyclerView.Adapter<CustomAdapter.ViewHolder>() {

    override fun onBindViewHolder(holder: ViewHolder?, position: Int) {
        holder?.txtName?.text = userList[position].high.toString()
        holder?.txtTitle?.text = "Forecast of "+userList[position].date.toString()

        holder?.card?.setOnClickListener {
            val intent = Intent(context, ForecastActivity::class.java)
            var forecast: Forecast = userList[position]
            intent.putExtra("date",forecast.date)
            intent.putExtra("day",forecast.day)
            intent.putExtra("high",forecast.high)
            intent.putExtra("low",forecast.low)
            intent.putExtra("text",forecast.text)
            context.startActivity(intent)

        }

    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ViewHolder {

        val v = LayoutInflater.from(parent?.context).inflate(R.layout.item_layout, parent, false)
        return ViewHolder(v);

    }

    override fun getItemCount(): Int {
        return userList.size
    }

    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val txtName: TextView = itemView.findViewById(R.id.txtName) as TextView
        val txtTitle: TextView = itemView.findViewById(R.id.txtTitle) as TextView
        val card: LinearLayout = itemView.findViewById(R.id.card) as LinearLayout
    }

}


