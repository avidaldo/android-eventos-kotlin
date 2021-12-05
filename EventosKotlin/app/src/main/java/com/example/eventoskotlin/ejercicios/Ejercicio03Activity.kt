package com.example.eventoskotlin.ejercicios

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioButton
import android.widget.Toast
import com.example.eventoskotlin.R
import com.example.eventoskotlin.databinding.ActivityEjercicio03Binding



const val EXTRA_DESPEDIDA = "com.example.eventoskotlin.ejercicios.DESPEDIDA"
const val EXTRA_NOMBRE = "com.example.eventoskotlin.ejercicios.NOMBRE"
const val EXTRA_TRATAMIENTO = "com.example.eventoskotlin.ejercicios.TRATAMIENTO"


class Ejercicio03Activity : AppCompatActivity() {

    private lateinit var binding: ActivityEjercicio03Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEjercicio03Binding.inflate(layoutInflater)
        setContentView(binding.root)


        val mensajeRecibido = intent.getStringExtra(EXTRA_DESPEDIDA)
        if (mensajeRecibido != null)
            Toast.makeText(this, mensajeRecibido, Toast.LENGTH_SHORT).show()


        binding.button04.setOnClickListener {
            val checkedSrSra = binding.rgSrSra.checkedRadioButtonId
            val nombre: String = binding.etNombre04.text.toString()
            when {
                nombre.isEmpty() -> errorNoNombre()
                checkedSrSra == -1 -> errorNoTratamiento()
                else -> {
                    val tratamiento = (findViewById<RadioButton>(checkedSrSra)).text.toString()
                    toSecondActivity(tratamiento, nombre)
                }
            }
        }

    }

    private fun errorNoTratamiento() =
        Toast.makeText(this, R.string.error_tratamiento, Toast.LENGTH_SHORT).show()

    private fun errorNoNombre() =
        Toast.makeText(this, R.string.error_nombre, Toast.LENGTH_SHORT).show()


    private fun toSecondActivity(tratamiento: String, nombre: String) {
        val intent = Intent(this, Ejercicio03SecondActivity::class.java)
        intent.putExtra(EXTRA_TRATAMIENTO, tratamiento)
        intent.putExtra(EXTRA_NOMBRE, nombre)
        startActivityForResult(intent, 1)
    }


}