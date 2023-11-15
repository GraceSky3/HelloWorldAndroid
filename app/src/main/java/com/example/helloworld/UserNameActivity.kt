package com.example.helloworld

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.helloworld.databinding.ActivityUserNameBinding

class UserNameActivity : AppCompatActivity() {
    private lateinit var binding: ActivityUserNameBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityUserNameBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //boton para usuario
        binding.opendisplayusernameactivity.setOnClickListener {
            if (binding.username.text.isEmpty()){ //si esta vacio
                Toast.makeText(this,"Debe introducir un nombre de usuario",
                    Toast.LENGTH_SHORT).show()
            }else{
                val intent = Intent( //si ha metido el usario vamos a abrir la otra actividad
                    this,  //ubicar la clase
                    DisplayUserNameActivity::class.java
                )
                //el extra va a modificar el valor del username
                intent.putExtra(
                    DisplayUserNameActivity.Params.USERNAME.name,
                    binding.username.text.toString()
                )
                startActivity(intent) //arranca la actividad

            }

        }
    }
}

