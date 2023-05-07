package com.ucv.edu.molardentalcareapp.ui.paciente

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ucv.edu.molardentalcareapp.R
import com.ucv.edu.molardentalcareapp.databinding.ActivityAgendarCitaBinding

class AgendarCitaActivity : AppCompatActivity() {

    private lateinit var binding: ActivityAgendarCitaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAgendarCitaBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}