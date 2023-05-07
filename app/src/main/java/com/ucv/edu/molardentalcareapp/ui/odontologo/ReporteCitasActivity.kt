package com.ucv.edu.molardentalcareapp.ui.odontologo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ucv.edu.molardentalcareapp.databinding.ActivityReporteCitasBinding

class ReporteCitasActivity : AppCompatActivity() {

    private lateinit var binding: ActivityReporteCitasBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityReporteCitasBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}