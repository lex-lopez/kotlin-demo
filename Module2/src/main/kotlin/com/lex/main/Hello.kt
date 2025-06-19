package com.lex.main

import com.lex.variables.VariableTypes

fun main() {
    println("Hello ${name()}!")

    // Variable Types
    val variableTypes = VariableTypes()
    variableTypes.showCaseVariableTypes()
}

fun name(): String {
    println("Calling function name...")
    return "Kotlin"
}