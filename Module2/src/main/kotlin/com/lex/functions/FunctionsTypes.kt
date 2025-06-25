@file:JvmName("Util")

package com.lex.functions

//Top-level function
fun topLevel() = 1

class FunctionsTypes {

    //Member function
    fun max(a: Int, b: Int): Int {
        return if (a>b) a else b
    }

    //Expression body function
    fun expressionBodyMax(a: Int, b: Int) = if (a>b) a else b

    //Local function
    fun other(): Int {
        fun local() = 3
        return local()
    }
}