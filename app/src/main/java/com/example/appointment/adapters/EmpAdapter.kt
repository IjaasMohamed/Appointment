package com.example.appointment.adapters

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.appointment.models.Model

class EmpAdapter (private val empList: ArrayList<Model> ) :
    RecyclerView.Adapter<EmpAdapter.ViewHolder> () {

    class ViewHolder (ItemView: View) : RecyclerView.ViewHolder(ItemView) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        TODO("Not yet implemented")
    }
}