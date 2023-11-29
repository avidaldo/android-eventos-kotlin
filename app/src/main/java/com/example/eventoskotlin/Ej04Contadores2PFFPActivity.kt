package com.example.eventoskotlin

import android.graphics.Color
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.eventoskotlin.databinding.ActivityEj04VariantePffpBinding

class Ej04Contadores2PFFPActivity : AppCompatActivity() {

    /********************************* Estado *********************************/

     var cuenta1 = 0
         set(value) {
             field = value
             binding.btn1.text = getString(R.string.btn1Text, field)
             binding.tv1.text = field.toString()
         }

     var cuenta2 = 0
         set(value) {
             field = value
             binding.btn2.text = getString(R.string.btn2Text, field)
             binding.tv2.text = field.toString()
         }

     var cuentaG = 0
         set(value) {
             field = value
             binding.tvG.text = field.toString()
         }


     /********************************* Vista *********************************/

     private lateinit var binding: ActivityEj04VariantePffpBinding

     override fun onCreate(savedInstanceState: Bundle?) {
         super.onCreate(savedInstanceState)
         binding = ActivityEj04VariantePffpBinding.inflate(layoutInflater)
         setContentView(binding.root)

         cuenta1 = 0; cuenta2 = 0; cuentaG = 0

         binding.btn1.setOnClickListener {
             binding.et1.text.toString().toIntOrNull()?.also {
                 cuenta1 += it
                 cuentaG += it
             } ?: errorNotNumber()
         }

         binding.btn2.setOnClickListener {
             cuenta2++
             cuentaG++
         }

         binding.reset1.setOnClickListener { cuenta1 = 0 }
         binding.reset2.setOnClickListener { cuenta2 = 0 }
         binding.resetG.setOnClickListener { cuentaG = 0 }
     }

     private fun errorNotNumber() {
         Toast.makeText(this, "No es un número", Toast.LENGTH_SHORT).show()
         binding.et1.text.clear()
         binding.et1.requestFocus()
         binding.et1.background.setTint(Color.RED)
     }

}