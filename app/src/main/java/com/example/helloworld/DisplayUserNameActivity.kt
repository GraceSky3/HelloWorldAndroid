package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.helloworld.databinding.ActivityDisplayUserNameBinding

class DisplayUserNameActivity : AppCompatActivity() {

    enum class Params{
        USERNAME, PASSWORD
    }

    private lateinit var binding: ActivityDisplayUserNameBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDisplayUserNameBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val username = intent.getStringExtra(Params.USERNAME.name)

        //cambiar el valor del la variable usernameText a la variable de la otra actividad
        binding.usernametext.text= username

        //boton para volver para atras
        binding.cerrar.setOnClickListener(){
            finish() //metodo que te deja volver a la ventana anterior

        }
    }
}