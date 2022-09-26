package com.example.eventoskotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.eventoskotlin.databinding.ActivityEj03BotonCambiaBotonBinding

class Ej03BotonCambiaBotonActivity : AppCompatActivity() {

    private lateinit var binding: ActivityEj03BotonCambiaBotonBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEj03BotonCambiaBotonBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.button32.setOnClickListener {
            Toast.makeText(this, "Todo bien", Toast.LENGTH_SHORT).show()
        }

        binding.button31.setOnClickListener {
            binding.button32.setOnClickListener {
                Toast.makeText(this, "He sido parasitado", Toast.LENGTH_SHORT).show()
            }
        }



    }
}