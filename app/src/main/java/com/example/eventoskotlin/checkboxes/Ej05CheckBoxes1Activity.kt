package com.example.eventoskotlin.checkboxes


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import com.example.eventoskotlin.R
import com.example.eventoskotlin.databinding.ActivityCheckBoxesBinding

// https://developer.android.com/guide/topics/ui/controls/checkbox

class Ej05CheckBoxes1Activity : AppCompatActivity() {

    private lateinit var binding: ActivityCheckBoxesBinding



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCheckBoxesBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Actualizamos el estado de los checkboxes
        binding.cbJamon.isChecked = Sandwich.jamon
        binding.cbLechuga.isChecked = Sandwich.lechuga
        binding.cbQueso.isChecked = Sandwich.queso

        binding.cbJamon.setOnClickListener { onCheckboxClicked(it) }
        binding.cbLechuga.setOnClickListener { onCheckboxClicked(it) }
        binding.cbQueso.setOnClickListener { onCheckboxClicked(it) }

    }

    private fun onCheckboxClicked(view: View) {

        // Actualizamos el estado con el último elemento
        val checked = (view as CheckBox).isChecked
        when (view.id) {
            R.id.cb_jamon -> Sandwich.jamon = checked
            R.id.cb_queso -> Sandwich.queso = checked
            R.id.cb_lechuga -> Sandwich.lechuga = checked
        }

        // Actualizamos el TextView
        binding.tvSandwich.text = Sandwich.toString()
    }


}

