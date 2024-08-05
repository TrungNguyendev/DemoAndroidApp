package com.example.demoandroidapp

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.demoandroidapp.databinding.ActivityPointsHistoryBinding

class PointsHistoryActivity : AppCompatActivity() {
    private lateinit var binding : ActivityPointsHistoryBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityPointsHistoryBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}