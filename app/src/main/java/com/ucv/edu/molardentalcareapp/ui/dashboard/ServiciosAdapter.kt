package com.ucv.edu.molardentalcareapp.ui.dashboard

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ucv.edu.molardentalcareapp.R
import com.ucv.edu.molardentalcareapp.entity.Operacion

class ServiciosAdapter(
    private val operaciones: ArrayList<Operacion> = arrayListOf(),
    private val onClick:(Operacion) -> Unit
    ) :
    RecyclerView.Adapter<ServiciosViewHolder>() {

    fun enviarDatos(operaciones: ArrayList<Operacion>){
        this.operaciones.addAll(operaciones)
//        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ServiciosViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_servicio, parent, false)
        return ServiciosViewHolder(view)
    }

    override fun getItemCount(): Int {
        return operaciones.size
    }

    override fun onBindViewHolder(holder: ServiciosViewHolder, position: Int) {
        holder.render(operaciones[position], onClick)
    }

}