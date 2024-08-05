package com.example.demoandroidapp

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.demoandroidapp.databinding.ActivityInforItemRewardsBinding

class InfoItemRewardsActivity : AppCompatActivity() {
    private lateinit var binding : ActivityInforItemRewardsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityInforItemRewardsBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    class InitOrderDemo(name : String){
        val firstName = "First Name User$name"
    }
}