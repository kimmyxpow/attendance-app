package com.example.attendance_app.views.forgotpass

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.attendance_app.databinding.ActivityForgotPasswordBinding

class ForgotPasswordActivity : AppCompatActivity() {

    private lateinit var binding: ActivityForgotPasswordBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityForgotPasswordBinding.inflate(layoutInflater)
        setContentView(binding.root)

        init()
    }

    private fun init() {
        setSupportActionBar(binding.tbForgotPassword)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }
}