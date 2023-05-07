package com.ucv.edu.molardentalcareapp.ui.paciente

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ucv.edu.molardentalcareapp.R
import com.ucv.edu.molardentalcareapp.databinding.ActivityMisCitasBinding

class MisCitasActivity : AppCompatActivity() {

    private lateinit var binding:ActivityMisCitasBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMisCitasBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }


}