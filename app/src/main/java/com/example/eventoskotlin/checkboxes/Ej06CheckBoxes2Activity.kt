package com.example.eventoskotlin.checkboxes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.eventoskotlin.databinding.ActivityCheckBoxesBinding

class Ej06CheckBoxes2Activity : AppCompatActivity() {

    private lateinit var binding: ActivityCheckBoxesBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCheckBoxesBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Actualizamos el estado de los checkboxes
        binding.cbJamon.isChecked = Sandwich.jamon
        binding.cbLechuga.isChecked = Sandwich.lechuga
        binding.cbQueso.isChecked = Sandwich.queso

        binding.cbJamon.setOnCheckedChangeListener { _, isChecked ->
            Sandwich.jamon = isChecked
            binding.tvSandwich.text = Sandwich.toString()
        }
        binding.cbQueso.setOnCheckedChangeListener { _, isChecked ->
            Sandwich.queso = isChecked
            binding.tvSandwich.text = Sandwich.toString()
        }
        binding.cbLechuga.setOnCheckedChangeListener { _, isChecked ->
            Sandwich.lechuga = isChecked
            binding.tvSandwich.text = Sandwich.toString()
        }
    }


}