package com.example.eventoskotlin.ejercicios

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.RadioButton
import android.widget.Toast
import com.example.eventoskotlin.R
import com.example.eventoskotlin.databinding.ActivityEjercicio01Binding

class Ejercicio01Activity : AppCompatActivity() {

    private lateinit var binding: ActivityEjercicio01Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEjercicio01Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button02.setOnClickListener {

            val checkedSrSra: Int = binding.rgSrSra.checkedRadioButtonId

            var cadena: String

            // Comprobamos los campos obligatorios

            if (binding.etNombre02.text.isEmpty()) {
                Toast.makeText(this, R.string.error_nombre, Toast.LENGTH_SHORT).show()
            } else if (checkedSrSra == -1) {
                Toast.makeText(this, R.string.error_tratamiento, Toast.LENGTH_SHORT).show()
            } else {
                val stringSrSra = findViewById<RadioButton>(checkedSrSra).text.toString()
                cadena =
                    "${resources.getString(R.string.hola)} $stringSrSra ${binding.etNombre02.text}\n"

                val checkedDespedida = binding.rgDespedida02.checkedRadioButtonId
                if (binding.cbDespedida02.isChecked && checkedDespedida != -1) {
                    cadena += (findViewById<View>(checkedDespedida) as RadioButton).text.toString()
                }
                binding.tvSaludo02.text = cadena
            }

        }


        binding.cbDespedida02.setOnCheckedChangeListener { _, isChecked ->
            binding.rgDespedida02.visibility =
                if (isChecked) View.VISIBLE  // Si se ha marcado, se muestra el RadioGroup
                else View.GONE  // Y si se se ha desmarcado, se quita

        }

    }

}