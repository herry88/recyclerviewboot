package com.faszztrack.myrecycleerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private val sepedaList = ArrayList<ModelSepeda>()
    private lateinit var  sepedaAdapter:SepedaAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        title = "Belajar Android KOtlin"
        val recyclerView : RecyclerView = findViewById(R.id.recyclerView)
        sepedaAdapter = SepedaAdapter(sepedaList)
        val layoutManager = LinearLayoutManager(applicationContext)
        recyclerView.layoutManager = layoutManager
        recyclerView.itemAnimator = DefaultItemAnimator()
        recyclerView.adapter = sepedaAdapter
        prepareDataSepeda()
    }

    private fun prepareDataSepeda() {
        var sepeda = ModelSepeda("Sepeda AA","BMX")
        sepedaList.add(sepeda)
        sepeda = ModelSepeda("Sepeda BB", "BMX")
        sepedaList.add(sepeda)
        sepedaAdapter.notifyDataSetChanged()
    }
}


