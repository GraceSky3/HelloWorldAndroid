package com.example.helloworld

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.helloworld.databinding.ActivityMenuBinding

class MenuActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMenuBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMenuBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //Actividad de contact
        binding.sendemail.setOnClickListener {
            val contactActivityIntent = Intent(this, ContactActivity::class.java)
            startActivity(contactActivityIntent)
        }

        //Actividad text view
        binding.textviewA.setOnClickListener {
            val textViewActivityIntent = Intent(this, TextViewActivity::class.java)
            startActivity(textViewActivityIntent)
        }

        //Actividad calculadora
        binding.calculator.setOnClickListener {
            val calculatorTableActivityIntent = Intent(this, CalculatorTableActivity::class.java)
            startActivity(calculatorTableActivityIntent)
        }
    }
}
