package com.example.day1app

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.day1app.Adapter2.Viewholder2

 class  Adapter2:RecyclerView.Adapter<Viewholder2>(){
     class Viewholder2(view: View):RecyclerView.ViewHolder(view){

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Viewholder2 {
        val listitem2= LayoutInflater.from(parent.context).inflate(R.layout.recycler_view_item,parent,false)

        return Viewholder2(listitem2)
    }

     override fun getItemCount(): Int {
         return 4
     }

     override fun onBindViewHolder(holder: Viewholder2, position: Int) {

     }

 }
