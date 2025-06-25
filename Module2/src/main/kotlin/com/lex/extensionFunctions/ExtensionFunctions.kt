package com.lex.extensionFunctions


fun String.lastChar() = get(length - 1)

fun String.repeatTimes(n: Int): String {
    val sb = StringBuilder(n * length)
    for (i in 1..n) {
        sb.append(this)
    }
    return sb.toString()
}
