package com.example.eventoskotlin.checkboxes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CompoundButton
import com.example.eventoskotlin.R
import com.example.eventoskotlin.databinding.ActivityCheckBoxesBinding


class Ej07CheckBoxes3Activity : AppCompatActivity(), CompoundButton.OnCheckedChangeListener {

    private lateinit var binding: ActivityCheckBoxesBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCheckBoxesBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Actualizamos el estado de los checkboxes
        binding.cbJamon.isChecked = Sandwich.jamon
        binding.cbLechuga.isChecked = Sandwich.lechuga
        binding.cbQueso.isChecked = Sandwich.queso

        binding.cbJamon.setOnCheckedChangeListener(this)
        binding.cbQueso.setOnCheckedChangeListener(this)
        binding.cbLechuga.setOnCheckedChangeListener(this)
    }


    override fun onCheckedChanged(buttonView: CompoundButton, isChecked: Boolean) {
        when (buttonView.id) {
            R.id.cb_jamon -> Sandwich.jamon = isChecked
            R.id.cb_queso -> Sandwich.queso = isChecked
            R.id.cb_lechuga -> Sandwich.lechuga = isChecked
        }
        binding.tvSandwich.text = Sandwich.toString()
    }

}