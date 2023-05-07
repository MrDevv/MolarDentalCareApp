package com.ucv.edu.molardentalcareapp.ui.dashboard

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.ucv.edu.molardentalcareapp.databinding.ItemServicioBinding
import com.ucv.edu.molardentalcareapp.entity.Operacion

class ServiciosViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    private val binding = ItemServicioBinding.bind(view)

    fun render(operaciones: Operacion, onClick: (Operacion) -> Unit) {
        binding.tvServicio.text = operaciones.descripcion
        binding.cvOperacion.setOnClickListener { onClick(operaciones) }
    }

}