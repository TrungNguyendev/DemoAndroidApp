package com.example.demoandroidapp

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.widget.Toolbar
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.demoandroidapp.databinding.ActivityResetPasswordBinding

class ResetPasswordActivity : AppCompatActivity() {

    private lateinit var binding: ActivityResetPasswordBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        binding = ActivityResetPasswordBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.bntOk.setOnClickListener{
            val intent = Intent(this@ResetPasswordActivity,OTPResetPasswordActivity::class.java)
            startActivity(intent)
        }
    }
}