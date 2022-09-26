package com.example.eventoskotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.eventoskotlin.databinding.ActivityEj09DobleToggleBinding

class Ej09DobleToggleActivity : AppCompatActivity() {

    private lateinit var binding: ActivityEj09DobleToggleBinding

    private var isChecked = false
        set(value) {
            field = value
            binding.switch1.isChecked = value
            binding.toggleButton.isChecked = value
            binding.tv.visibility =
                if (value) View.INVISIBLE
                else View.VISIBLE
        }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEj09DobleToggleBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.toggleButton.setOnClickListener { isChecked = !isChecked }
        binding.switch1.setOnClickListener { isChecked = !isChecked }

    }

}