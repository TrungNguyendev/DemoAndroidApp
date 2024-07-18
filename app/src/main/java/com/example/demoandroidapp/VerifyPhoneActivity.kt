package com.example.demoandroidapp

import android.R
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toolbar
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.AppCompatActivity
import com.example.demoandroidapp.databinding.ActivityVerifyPhoneBinding


class VerifyPhoneActivity : AppCompatActivity() {

    private lateinit var binding: ActivityVerifyPhoneBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        binding = ActivityVerifyPhoneBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnSubmit.setOnClickListener{
            val intent = Intent(this,ResetPasswordActivity::class.java)
            startActivity(intent)
        }
    }
}