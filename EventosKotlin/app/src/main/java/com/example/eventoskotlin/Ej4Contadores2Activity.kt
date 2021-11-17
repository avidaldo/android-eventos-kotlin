package com.example.eventoskotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import com.example.eventoskotlin.databinding.ActivityEj4Contadores2Binding
import kotlin.random.Random

class Ej4Contadores2Activity : AppCompatActivity() {

    private lateinit var binding: ActivityEj4Contadores2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEj4Contadores2Binding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.button1.setOnClickListener {
/*            incrementaContador(binding.tvCuenta1, binding.et1.text.toString().toInt())
            incrementaContador(binding.tvCuentaGlobal)*/

            //incrementaContador(binding.tvCuentaGlobal, binding.et1)
            incrementaContador(binding.tvCuentaGlobal, null)
        }


    }

    private fun incrementaContador(tvCuentaX: TextView, etX: EditText? = null) {
        var cuentaX = tvCuentaX.text.toString().toInt()
        //cuentaX += if (etX==null) 6 else etX.text.toString().toInt()
        cuentaX += (etX?.text.toString() ?: "6").toInt()
        tvCuentaX.text = "${cuentaX}"

    }


    private fun incrementaContador(tvCuentaX: TextView, incremento: Int =1) {
        var cuentaX = tvCuentaX.text.toString().toInt()
        cuentaX += incremento
        tvCuentaX.text = "${cuentaX}"
    }


}