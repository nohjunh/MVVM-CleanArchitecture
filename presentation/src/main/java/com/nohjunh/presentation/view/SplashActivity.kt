package com.nohjunh.presentation.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.nohjunh.presentation.R
import com.nohjunh.presentation.databinding.ActivitySplashBinding

class SplashActivity : AppCompatActivity() {

    private lateinit var binding : ActivitySplashBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}