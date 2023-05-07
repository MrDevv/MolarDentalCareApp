package com.ucv.edu.molardentalcareapp.ui.odontologo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ucv.edu.molardentalcareapp.R
import com.ucv.edu.molardentalcareapp.databinding.ActivityCitaBinding

class CitaActivity : AppCompatActivity() {

    private lateinit var binding: ActivityCitaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCitaBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}