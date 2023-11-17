package com.example.helloworld

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.helloworld.databinding.ActivityEstudianteBinding
import com.example.helloworld.databinding.ActivityMenuBinding
//clase para leer estudiante
class EstudianteActivity : AppCompatActivity() {
    private lateinit var binding: ActivityEstudianteBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEstudianteBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.next.setOnClickListener {

            if(binding.nombre.text.isEmpty()){
                Toast.makeText(this, "Debe introducir un nombre", Toast.LENGTH_SHORT).show()
            }else if(binding.apellido.text.isEmpty()){
                 Toast.makeText(this, "Debe introducir un apellido", Toast.LENGTH_SHORT).show()
            }else if(binding.edad.text.isEmpty()){
                Toast.makeText(this, "Debe introducir una edad", Toast.LENGTH_SHORT).show()

            }else{
                val intent = Intent(
                    this,
                    DisplayEstudianteActivity::class.java
                )


                startActivity(intent)
            }


        }
    }


}
/*username?.let{
* binding.usernameTextView.text=usename
* }*/