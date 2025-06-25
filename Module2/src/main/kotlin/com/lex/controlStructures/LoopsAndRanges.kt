package com.lex.controlStructures

class LoopsAndRanges {

    fun printLetters() {
        val list = listOf("a", "b", "c")
        for (s in list) {
            print(s)
        }
        println()

        for ( (index, element) in list.withIndex()) {
            println("$index: $element")
        }
        println()
    }

    fun printMap() {
        val map = mapOf(1 to "one",
            2 to "two",
            3 to "three")

        for ((key, value) in map) {
            println("$key = $value")
        }
        println()
    }

    fun printRanges() {
        // inclusive
        println("\n\nInclusive from 1 to 9")
        for (i in 1..9) { // 123456789
            print(i)
        }

        // exclusive
        println("\n\nExclusive from 1 to 9")
        for (i in 1 until 9) { // 12345678
            print(i)
        }

        // more complex for loop
        println("\n\nFrom 9 down to 1, step by 2")
        for (i in 9 downTo 1 step 2) { // 97531
            print(i)
        }

        // when iterating chars in string, by adding one it will print the next char in the ascii table
        println("\n\nAdding 1 to each char in string \"abc\"")
        for (ch in "abc") { //bcd
            print(ch +1)
        }

        println("\n\nChars from '0' until '9'")
        for (c in '0' until '9') { // 012345678
            print(c)
        }
    }

    fun isLetter(c: Char) = c in 'a'..'z' || c in 'A'..'Z'
    fun isNotDigit(c: Char) = c !in '0'..'9'

    fun recognizeCharacter(c: Char) =
        when (c) {
            in '0'..'9' -> "It's a digit!"
            in 'a'..'z', in 'A'..'Z' -> "It's a letter!"
            else -> "I don't know..."
        }
}