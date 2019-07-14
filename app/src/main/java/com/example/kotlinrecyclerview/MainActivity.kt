package com.example.kotlinrecyclerview

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity()
{
    @SuppressLint("WrongConstant")
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerVeiw = findViewById<RecyclerView>(R.id.recycler_view_)
        recyclerVeiw.layoutManager = LinearLayoutManager(this, LinearLayout.VERTICAL, false)
        val adapters = RecyclerViewAdapters()
        recyclerVeiw.adapter = adapters
    }
}
