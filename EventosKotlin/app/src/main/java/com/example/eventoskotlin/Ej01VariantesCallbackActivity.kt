package com.example.eventoskotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.example.eventoskotlin.databinding.ActivityEj01VariantesCallbackBinding


class Ej01VariantesCallbackActivity : AppCompatActivity() {

    protected lateinit var binding: ActivityEj01VariantesCallbackBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEj01VariantesCallbackBinding.inflate(layoutInflater)
        setContentView(binding.root)

        /* Listener anónimo con función anónima*/
        binding.button11.setOnClickListener(
            View.OnClickListener(fun(v: View?) {
                Toast.makeText(this, "Hola desde " + (v as Button).text, Toast.LENGTH_SHORT)
                    .show()
                binding.textView.text = "Has pulsado " + (v as Button).text
            })
        )

        /* Listener anónimo que recibe lambda */
        binding.button12.setOnClickListener(
            View.OnClickListener { v: View? ->
                Toast.makeText(this, "Hola desde " + (v as Button).text, Toast.LENGTH_SHORT)
                    .show()
                binding.textView.text = "Has pulsado " + (v as TextView).text
                /* También se puede castear a TextView ya que es la clase padre de Button donde
                se introduce el atributo text (Button es un tipo de TextView) */
            }
        )

        /* Recibiendo directamente la lambda como parámetro del setOnClickListener */
        binding.button13.setOnClickListener { v: View? ->
            Toast.makeText(this, "Hola desde " + (v as Button).text, Toast.LENGTH_SHORT)
                .show()
            binding.textView.text = "Has pulsado " + v.text
            /* Como ya ha sido casteado previamente, no es necesario volver a hacerlo */
        }

        /* El tipo del parámetro puede ser inferido por el compilador */
        binding.button14.setOnClickListener { v ->
            Toast.makeText(this, "Hola desde " + (v as Button).text, Toast.LENGTH_SHORT)
                .show()
            binding.textView.text = "Has pulsado " + v.text
        }

        /* Cuando hay un solo parámetro de entrada, puede omitirse y utilizar la palabra reservada "it"  */
        binding.button15.setOnClickListener {
            Toast.makeText(this, "Hola desde " + (it as Button).text, Toast.LENGTH_SHORT)
                .show()
            binding.textView.text = "Has pulsado " + it.text
        }

    }

}