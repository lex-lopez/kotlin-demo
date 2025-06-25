package com.lex.exceptions

class ExceptionThrowing {

    fun checkPercentage(number: Int) =
        if (number in 0..100)
            number
        else
            throw IllegalArgumentException("A percentage value must be" +
                    "between 0 and 100: $number")

    fun parseNumber(number: String) = try {
        Integer.parseInt(number)
    } catch (e: NumberFormatException) {
        println("Exception catched for: ${e.localizedMessage}")
        null
    }

}