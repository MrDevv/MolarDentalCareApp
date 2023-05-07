package com.ucv.edu.molardentalcareapp.ui.dashboard

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.ucv.edu.molardentalcareapp.R
import com.ucv.edu.molardentalcareapp.data.operacionesOdontologo
import com.ucv.edu.molardentalcareapp.data.operacionesPaciente
import com.ucv.edu.molardentalcareapp.databinding.ActivityDashboardUsuarioBinding
import com.ucv.edu.molardentalcareapp.entity.Operacion
import com.ucv.edu.molardentalcareapp.ui.dashboard.adapter.OperacionesAdapter
import com.ucv.edu.molardentalcareapp.ui.odontologo.CitaActivity
import com.ucv.edu.molardentalcareapp.ui.odontologo.HorarioAtencionActivity
import com.ucv.edu.molardentalcareapp.ui.odontologo.PacienteActivity
import com.ucv.edu.molardentalcareapp.ui.odontologo.ReporteCitasActivity
import com.ucv.edu.molardentalcareapp.ui.paciente.AgendarCitaActivity
import com.ucv.edu.molardentalcareapp.ui.paciente.MisCitasActivity

class DashboardUsuarioActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDashboardUsuarioBinding

    private val operacionesAdapter: OperacionesAdapter by lazy {
        OperacionesAdapter() { servicio -> irAServicio(servicio) }
    }

    companion object {
        private const val KEY: String = "ROL"
        private const val ODONTOLOGO: String = "Odontologo"
        private const val PACIENTE: String = "Paciente"

        fun getIntentDashboard(activity: Activity, rol: String): Intent {
            val intent = Intent(activity, DashboardUsuarioActivity::class.java)
            intent.putExtra(KEY, rol)
            return intent
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDashboardUsuarioBinding.inflate(layoutInflater)
        setContentView(binding.root)
        mostrarServicios()
    }

    private fun mostrarServicios() {
        var rol = intent.extras?.getString("ROL")

        if (rol.equals(ODONTOLOGO)) {
            binding.ivImagenDashboard.setImageResource(R.drawable.ic_dashboard_odontologo)
            binding.tvRol.text = getText(R.string.text_odontologo)
            operacionesAdapter.enviarDatos(operacionesOdontologo)
        } else if (rol.equals(PACIENTE)) {
            binding.ivImagenDashboard.setImageResource(R.drawable.ic_dashboard_paciente)
            binding.tvRol.text = getText(R.string.text_paciente)
            operacionesAdapter.enviarDatos(operacionesPaciente)
        }
        binding.rvServicios.layoutManager = LinearLayoutManager(this)
        binding.rvServicios.adapter = operacionesAdapter
    }

    fun irAServicio(operacion: Operacion) {
        when (operacion.codigo) {
            1 -> startActivity(Intent(this, HorarioAtencionActivity::class.java))
            2 -> startActivity(Intent(this, PacienteActivity::class.java))
            3 -> startActivity(Intent(this, CitaActivity::class.java))
            4 -> startActivity(Intent(this, ReporteCitasActivity::class.java))
            5 -> startActivity(Intent(this, AgendarCitaActivity::class.java))
            6 -> startActivity(Intent(this, MisCitasActivity::class.java))
            else -> Toast.makeText(this, "No existe la vista", Toast.LENGTH_SHORT).show()
        }

    }


}