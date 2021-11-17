package com.example.eventoskotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import com.example.eventoskotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button01.setOnClickListener { startActivity(Intent(this, Ej01VariantesCallbackActivity::class.java)) }
        binding.button02.setOnClickListener { startActivity(Intent(this, Ej02ContadoresActivity::class.java)) }
        binding.button03.setOnClickListener { startActivity(Intent(this, Ej03BotonCambiaBotonActivity::class.java)) }
        binding.button04.setOnClickListener { startActivity(Intent(this,
            Ej4Contadores2Activity::class.java)) }



    }
}