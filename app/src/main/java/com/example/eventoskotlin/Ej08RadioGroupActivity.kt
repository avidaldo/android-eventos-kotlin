package com.example.eventoskotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.eventoskotlin.databinding.ActivityEj08RadioGroupBinding

//https://developer.android.com/guide/topics/ui/controls/radiobutton


class Ej08RadioGroupActivity : AppCompatActivity() {

    private lateinit var binding: ActivityEj08RadioGroupBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEj08RadioGroupBinding.inflate(layoutInflater)
        setContentView(binding.root)


        // Nuevo Evento
        binding.radioGroup.setOnCheckedChangeListener { _, checkedId ->
            when (checkedId) {
                R.id.silent -> Toast.makeText(this, "Silencio", Toast.LENGTH_SHORT).show()
                R.id.sound -> Toast.makeText(this, "Sonido", Toast.LENGTH_SHORT).show()
                else -> Toast.makeText(this, "Vibración", Toast.LENGTH_SHORT).show()
            }
        }

        binding.chooseBtn.setOnClickListener {
            when (binding.radioGroup.checkedRadioButtonId) {
                binding.sound.id -> binding.tv07.text = "Has elegido 'Sonido'."
                binding.vibration.id -> binding.tv07.text = "Has elegido 'Vibración'."
                else -> binding.tv07.text = "Has elegido 'Silencio'."
            }
        }

    }

}