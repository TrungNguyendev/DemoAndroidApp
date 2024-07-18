package com.example.demoandroidapp

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.demoandroidapp.databinding.ActivityOtpresetPasswordBinding

class OTPResetPasswordActivity : AppCompatActivity() {

    private lateinit var binding: ActivityOtpresetPasswordBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        binding = ActivityOtpresetPasswordBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnOk.setOnClickListener{
            val intent = Intent(this,NewPasswordActivity::class.java)
            startActivity(intent)
        }
    }
}