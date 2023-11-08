package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputBinding
import android.widget.Toast
import com.example.helloworld.databinding.ActivityContactBinding

class ContactActivity : AppCompatActivity() {
    private lateinit var binding: ActivityContactBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityContactBinding.inflate(layoutInflater)
        setContentView(binding.root)

       binding.switch1.setOnClickListener {
           binding.email1.visibility = View.INVISIBLE
           binding.email1.isEnabled =
               binding.switch1.isChecked
       }
        binding.btn.setOnClickListener{_ ->
           when(binding.sexgroup.checkedRadioButtonId){
               binding.male.id ->{
                   Toast.makeText(this,"Sexo: masculino", Toast.LENGTH_SHORT).show()
               }
               binding.female.id ->{
                   Toast.makeText(this,"Sexo: femenino", Toast.LENGTH_SHORT).show()
               }
           }
        }
    }
}