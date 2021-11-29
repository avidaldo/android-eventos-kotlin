package com.example.eventoskotlin

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.example.eventoskotlin.databinding.ActivityEj4Contadores2Binding
import java.lang.NumberFormatException
import kotlin.random.Random

class Ej4Contadores2Activity : AppCompatActivity() {

    private lateinit var binding: ActivityEj4Contadores2Binding


    /* Utilizamos los setters de las propiedades para actualizar automáticamente la UI */

    private var cuenta1 = 0
        set(value) { field=value; binding.tvCuenta1.text = field.toString() }
    private var cuenta2 = 0
        set(value) {  field=value; binding.tvCuenta2.text = field.toString() }
    private var cuentaG = 0
        set(value) { field=value;  binding.tvCuentaGlobal.text = field.toString() }



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEj4Contadores2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button1.setOnClickListener {
            try {
                val incremento = binding.et1.text.toString().toInt()
                alerta(binding.tvIncremento1, false)
                cuenta1 += incremento
                cuentaG += incremento
            } catch (e: NumberFormatException) {  // Si el EditText de incremento no tiene un número
                alerta(binding.tvIncremento1, true)
                Toast.makeText(this, R.string.no_incremento, Toast.LENGTH_SHORT).show()
            }
        }

        binding.button2.setOnClickListener {
            try {
                val incremento = binding.et2.text.toString().toInt()
                alerta(binding.tvIncremento2, false)
                cuenta2 += incremento
                cuentaG += incremento
            } catch (e: NumberFormatException) {
                alerta(binding.tvIncremento2, true)
                Toast.makeText(this, R.string.no_incremento, Toast.LENGTH_SHORT).show()
            }
        }

        binding.ivReset1.setOnClickListener { cuenta1 = 0 }
        binding.ivReset2.setOnClickListener { cuenta2 = 0 }
        binding.ivResetG.setOnClickListener { cuentaG = 0 }

    }

    private fun alerta(tv: TextView, alerta: Boolean) {
        if (alerta) tv.setTextColor(Color.RED)
        else tv.setTextColor(Color.BLACK)
    }

}