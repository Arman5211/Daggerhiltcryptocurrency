package com.example.daggerhiltcryptocurrency

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class CryptocurrencyAdapter(private val cryptocurrency: List<Cryptocurrency>) : RecyclerView.Adapter<CryptocurrencyAdapter.ViewHolder>()  {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        // Inflating list data from list_item to view
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)
        return ViewHolder(view)
    }
    // Binding cryptocurrency list to ViewHolder
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(cryptocurrency[position])
    }
    override fun getItemCount() = cryptocurrency.size

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(index: Cryptocurrency) {

            Glide.with(itemView.context)
                .load(index.image).dontAnimate()
                .into(itemView.findViewById(R.id.image))

            itemView.findViewById<TextView>(R.id.cryptocurrency).text = index.name
        }
    }
}