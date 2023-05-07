package com.ucv.edu.molardentalcareapp.ui.dashboard.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.ucv.edu.molardentalcareapp.R
import com.ucv.edu.molardentalcareapp.databinding.ItemOperacionBinding
import com.ucv.edu.molardentalcareapp.entity.Operacion

class OperacionesViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    private val binding = ItemOperacionBinding.bind(view)

    fun render(operaciones: Operacion, onClick: (Operacion) -> Unit) {
        binding.tvServicio.text = operaciones.descripcion
        binding.cvOperacion.setOnClickListener { onClick(operaciones) }
        setIconoOperacion(operaciones.codigo)
    }

    fun setIconoOperacion(codigo: Int) {
        when (codigo) {
            1 -> binding.ivIconoOperacion.setImageResource(R.drawable.ic_horarios_atencion)
            2 -> binding.ivIconoOperacion.setImageResource(R.drawable.ic_paciente)
            3 -> binding.ivIconoOperacion.setImageResource(R.drawable.ic_citas)
            4 -> binding.ivIconoOperacion.setImageResource(R.drawable.ic_reporte_citas)
            5 -> binding.ivIconoOperacion.setImageResource(R.drawable.ic_nueva_cita)
            6 -> binding.ivIconoOperacion.setImageResource(R.drawable.ic_mis_citas)
            else -> binding.ivIconoOperacion.setImageResource(R.drawable.ic_error404)
        }
    }

}