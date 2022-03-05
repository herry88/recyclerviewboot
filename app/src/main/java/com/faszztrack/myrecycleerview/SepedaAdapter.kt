package com.faszztrack.myrecycleerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter

internal class SepedaAdapter(private var sepedaList: List<ModelSepeda>):
    Adapter<SepedaAdapter.MyViewHolder>() {
    inner class MyViewHolder(view:View) :RecyclerView.ViewHolder(view) {
        var nama: TextView = view.findViewById(R.id.nama)
        var jenis :TextView = view.findViewById(R.id.jenis)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_row, parent, false)
        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val sepeda = sepedaList[position]
        holder.nama.text = sepeda.getNama()
        holder.jenis.text = sepeda.getJenis()
    }

    override fun getItemCount(): Int {
       return sepedaList.size
    }

}
