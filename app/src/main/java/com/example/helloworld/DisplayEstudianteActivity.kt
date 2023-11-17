package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.helloworld.databinding.ActivityDisplayEstudianteBinding

class DisplayEstudianteActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDisplayEstudianteBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDisplayEstudianteBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}

