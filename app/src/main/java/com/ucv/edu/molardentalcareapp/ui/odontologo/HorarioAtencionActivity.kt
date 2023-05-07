package com.ucv.edu.molardentalcareapp.ui.odontologo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ucv.edu.molardentalcareapp.R
import com.ucv.edu.molardentalcareapp.databinding.ActivityHorarioAtencionBinding

class HorarioAtencionActivity : AppCompatActivity() {

    private lateinit var binding: ActivityHorarioAtencionBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHorarioAtencionBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}