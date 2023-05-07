package com.ucv.edu.molardentalcareapp.ui.odontologo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ucv.edu.molardentalcareapp.databinding.ActivityPacienteBinding

class PacienteActivity : AppCompatActivity() {

    private lateinit var binding: ActivityPacienteBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPacienteBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}