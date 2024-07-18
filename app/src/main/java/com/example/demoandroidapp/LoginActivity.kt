package com.example.demoandroidapp

import android.annotation.SuppressLint
import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.demoandroidapp.databinding.ActivityLoginBinding
import com.example.demoandroidapp.databinding.ActivityRegisterBinding

class LoginActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")

    lateinit var binding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        Thread.sleep(3000)
        installSplashScreen()
        enableEdgeToEdge()
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.login_activity)) { v, insets ->
//            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
//            insets
//        }
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)
        onClick(binding.btnLogin)

        binding.twForgotPassword.setOnClickListener{
            val intent = Intent(this,ResetPasswordActivity::class.java)
            startActivity(intent)
        }
        binding.twRegisterLogin.setOnClickListener{
            val intent = Intent(this,RegisterActivity::class.java)
            startActivity(intent)
        }
    }
    private fun onClick(button: View) {
        button.setOnClickListener{
            val intent = Intent(this@LoginActivity,RegisterActivity::class.java)
            startActivity(intent)
        }
    }
}