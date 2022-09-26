package com.example.eventoskotlin.ejercicios

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.RadioButton
import android.widget.Toast
import com.example.eventoskotlin.R
import com.example.eventoskotlin.databinding.ActivityEjercicio03SecondBinding

class Ejercicio03SecondActivity : AppCompatActivity() {

    private lateinit var binding: ActivityEjercicio03SecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEjercicio03SecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val nombre = intent.extras?.getString(EXTRA_NOMBRE)
        val tratamiento = intent.extras?.getString(EXTRA_TRATAMIENTO)

        binding.tvSaludo04.setText("$tratamiento $nombre")



        binding.cbDespedida04.setOnCheckedChangeListener { _, isChecked ->
            binding.rgDespedida04.visibility =
                if (isChecked) View.VISIBLE  // Si se ha marcado, se muestra el RadioGroup
                else View.GONE  // Y si se se ha desmarcado, se quita
        }

        binding.btnVolver04.setOnClickListener {
            val intent = Intent(this, Ejercicio03Activity::class.java)
            val checkedDespedida = binding.rgDespedida04.checkedRadioButtonId
            if (!binding.cbDespedida04.isChecked) startActivity(intent)
            else {
                if (checkedDespedida == -1) errorNoDespedida()
                else {
                    val despedida = findViewById<RadioButton>(checkedDespedida).text.toString()
                    startActivity(intent.putExtra(EXTRA_DESPEDIDA, "$despedida, $nombre."))
                }
            }
        }

    }

    private fun errorNoDespedida() {
        Toast.makeText(this, R.string.error_despedida, Toast.LENGTH_SHORT).show()
    }

}