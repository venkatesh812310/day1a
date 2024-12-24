package com.example.day1app

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class Adapter:RecyclerView.Adapter<Adapter.Viewholder>() {
    class Viewholder(view: View):RecyclerView.ViewHolder(view){

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Viewholder {
        val listitem= LayoutInflater.from(parent.context).inflate(R.layout.main_page,parent,false)

        return Viewholder(listitem)}

    override fun getItemCount(): Int {
        return 7

    }

    override fun onBindViewHolder(holder: Viewholder, position: Int) {


    }
}