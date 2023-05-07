package com.ucv.edu.molardentalcareapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatEditText
import com.ucv.edu.molardentalcareapp.databinding.ActivityMainBinding
import com.ucv.edu.molardentalcareapp.ui.DashboardUsuarioActivity

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initListeners()
    }

    private fun initListeners() {
        binding.btnIngresar.setOnClickListener { validarUsuario() }
    }

    private fun validarUsuario() {
//  Si el usuario no es valido muestra un mensaje

//  Si el usuario es valido ingresa con el rol
        if (binding.etUser.text.toString() == "odont"){
            ingresar("Odontologo")
        }else if (binding.etUser.text.toString() == "pac"){
            ingresar("Paciente")
        }
    }

    private fun ingresar(rol: String) {
        setContentView(R.layout.activity_bievenida)
        startActivity(DashboardUsuarioActivity.getIntentDashboard(this, rol))
    }
}