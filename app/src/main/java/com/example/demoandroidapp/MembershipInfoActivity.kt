package com.example.demoandroidapp

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.demoandroidapp.databinding.ActivityMembershipInfoBinding

class MembershipInfoActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMembershipInfoBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMembershipInfoBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}