package com.lex.controlStructures

import com.lex.models.Cat
import com.lex.models.Dog
import com.lex.models.Pet

class PetService {
    private fun getMyFavoritePet(): Pet {
        return if (Math.random() < 0.5) Cat else Dog
    }

    fun getPetGreeting(): String =
        when (val pet = getMyFavoritePet()) {
            is Cat -> pet.meow() // smart casts to Cat
            is Dog -> pet.woof() // smart casts to Dog
        }
}