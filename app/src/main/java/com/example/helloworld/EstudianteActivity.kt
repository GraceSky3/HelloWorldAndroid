package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.helloworld.databinding.ActivityEstudianteBinding
import com.example.helloworld.databinding.ActivityMenuBinding

class EstudianteActivity : AppCompatActivity() {
    private lateinit var binding: ActivityEstudianteBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEstudianteBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}