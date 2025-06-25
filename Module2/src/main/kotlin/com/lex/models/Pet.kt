package com.lex.models

sealed interface Pet

data object Cat : Pet {
    fun meow(): String = "Meow!"
}

data object Dog : Pet {
    fun woof(): String = "Woof!"
}