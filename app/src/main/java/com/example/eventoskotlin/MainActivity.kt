package com.example.eventoskotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.eventoskotlin.checkboxes.Ej05CheckBoxes1Activity
import com.example.eventoskotlin.checkboxes.Ej06CheckBoxes2Activity
import com.example.eventoskotlin.checkboxes.Ej07CheckBoxes3Activity

import com.example.eventoskotlin.databinding.ActivityMainBinding
import com.example.eventoskotlin.ejercicios.Ejercicio01Activity
import com.example.eventoskotlin.ejercicios.Ejercicio02Activity
import com.example.eventoskotlin.ejercicios.Ejercicio03Activity

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button01.setOnClickListener { startActivity(Intent(this, Ej01VariantesCallbackActivity::class.java)) }
        binding.button02.setOnClickListener { startActivity(Intent(this, Ej02ContadoresActivity::class.java)) }
        binding.button03.setOnClickListener { startActivity(Intent(this, Ej03BotonCambiaBotonActivity::class.java)) }
        binding.button04.setOnClickListener { startActivity(Intent(this, Ej04Contadores2Activity::class.java)) }
        binding.button05.setOnClickListener { startActivity(Intent(this, Ej05CheckBoxes1Activity::class.java)) }
        binding.button06.setOnClickListener { startActivity(Intent(this, Ej06CheckBoxes2Activity::class.java)) }
        binding.button07.setOnClickListener { startActivity(Intent(this, Ej07CheckBoxes3Activity::class.java)) }
        binding.button08.setOnClickListener { startActivity(Intent(this, Ej08RadioGroupActivity::class.java)) }
        binding.button09.setOnClickListener { startActivity(Intent(this, Ej09DobleToggleActivity::class.java)) }
        binding.buttonEjercicio01.setOnClickListener { startActivity(Intent(this, Ejercicio01Activity::class.java)) }
        binding.buttonEjercicio02.setOnClickListener { startActivity(Intent(this, Ejercicio02Activity::class.java)) }
        binding.buttonEjercicio03.setOnClickListener { startActivity(Intent(this, Ejercicio03Activity::class.java)) }



    }
}