package com.lex.controlStructures

enum class Color {
    BLUE, ORANGE, YELLOW,  RED
}

class Conditionals {

    fun getDescription(color: Color): String =
        when (color) {
            Color.BLUE -> "cold"
            Color.ORANGE, Color.YELLOW -> "mild"
            Color.RED -> "hot"
        }

    fun mixColors(c1: Color, c2: Color) =
        when (setOf(c1,c2)) {
            setOf(Color.RED,Color.YELLOW) -> Color.ORANGE
            setOf(Color.YELLOW, Color.BLUE) -> Color.RED
            else -> "Unknown color"
        }
}