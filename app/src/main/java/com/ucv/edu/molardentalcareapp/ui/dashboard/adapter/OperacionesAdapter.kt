package com.ucv.edu.molardentalcareapp.ui.dashboard.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ucv.edu.molardentalcareapp.R
import com.ucv.edu.molardentalcareapp.entity.Operacion

class OperacionesAdapter(
    private val operaciones: ArrayList<Operacion> = arrayListOf(),
    private val onClick:(Operacion) -> Unit
    ) :
    RecyclerView.Adapter<OperacionesViewHolder>() {

    fun enviarDatos(operaciones: ArrayList<Operacion>){
        this.operaciones.addAll(operaciones)
//        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): OperacionesViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_operacion, parent, false)
        return OperacionesViewHolder(view)
    }

    override fun getItemCount(): Int {
        return operaciones.size
    }

    override fun onBindViewHolder(holder: OperacionesViewHolder, position: Int) {
        holder.render(operaciones[position], onClick)
    }

}