package com.lex.functions

class FunctionsWithArgs {

    fun displaySeparator(character: Char = '*', size: Int = 10) {
        repeat(size) {
            print(character)
        }
        println()
    }
}