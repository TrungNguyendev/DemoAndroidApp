package com.example.demoandroidapp

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.demoandroidapp.databinding.ActivityGroupShopBinding

class GroupShopActivity : AppCompatActivity() {
    private lateinit var binding : ActivityGroupShopBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityGroupShopBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}