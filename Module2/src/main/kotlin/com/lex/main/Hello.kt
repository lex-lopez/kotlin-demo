package com.lex.main

fun main() {
    println("Hello ${name()}!")
}

fun name(): String {
    println("Calling function name...")
    return "Kotlin"
}