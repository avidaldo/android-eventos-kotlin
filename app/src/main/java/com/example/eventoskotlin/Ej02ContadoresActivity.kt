package com.example.eventoskotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.example.eventoskotlin.databinding.ActivityEj02ContadoresBinding
import java.lang.StringBuilder


class Ej02ContadoresActivity : AppCompatActivity() {

    protected lateinit var binding: ActivityEj02ContadoresBinding

    var cont1: Int = 0; var cont2: Int = 0; var cont3: Int = 0; var contGlobal: Int = 0;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEj02ContadoresBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.button21.setOnClickListener { it: View? ->
            Toast.makeText(this, "Pulsado " + (it as Button).text, Toast.LENGTH_SHORT).show()
            cont1++
            it.text = "${getString(R.string.button21)} (${cont1})"
            binding.textView21.text = cont1.toString()
            binding.textView24.text = (++contGlobal).toString()
        }

        binding.button22.setOnClickListener { it: View? ->
            Toast.makeText(this, "Hola desde " + (it as Button).text, Toast.LENGTH_SHORT).show()
            it.text = "${getString(R.string.button22)} (${++cont2})"
            binding.textView22.text = cont2.toString()
            binding.textView24.text = (++contGlobal).toString()
        }


    }


}