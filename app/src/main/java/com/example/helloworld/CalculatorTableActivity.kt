package com.example.helloworld

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.inputmethod.InputBinding
import com.example.helloworld.databinding.ActivityCalculatorTableBinding
import com.example.helloworld.databinding.ActivityCulculatorTableBinding
import com.example.helloworld.databinding.ActivityMenuBinding

class CalculatorTableActivity : AppCompatActivity() {

    private lateinit var binding: ActivityCulculatorTableBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCulculatorTableBinding.inflate((layoutInflater))
        setContentView(binding.root)



    }
}

