package com.example.kotlinrecyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class RecyclerViewAdapters : RecyclerView.Adapter<RecyclerViewAdapters.ViewHolder>()
{
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder
    {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.items_recyclerview, parent, false)
        return ViewHolder(v)
    }

    override fun getItemCount(): Int
    {
        return 1000;
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int)
    {
    }

    class ViewHolder(itemVeiw: View) : RecyclerView.ViewHolder(itemVeiw)
    {
    }
}