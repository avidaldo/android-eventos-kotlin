package com.example.eventoskotlin.checkboxes

/**
 *  Objeto que representa el sandwich
 */
object Sandwich {
    var jamon = false
    var queso = false
    var lechuga = false

    override fun toString(): String {
        // Construimos el string
        var stringSandwich: String

        // Si están los 3 ingredientes:
        if (jamon && queso && lechuga) stringSandwich =
            "Tu sandwich será de jamón, queso y lechuga."
        else if (jamon) {
            stringSandwich = "Tu sandwich será de jamon"
            stringSandwich += if (queso) " y queso." else if (lechuga) " y lechuga." else "."
        } else if (queso) {
            stringSandwich = "Tu sandwich será de queso"
            stringSandwich += if (lechuga) " y lechuga." else "."
        } else if (lechuga) {
            stringSandwich = "Tu sandwich será de lechuga."
        } else stringSandwich = ""

        return stringSandwich
    }
}