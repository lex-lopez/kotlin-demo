package com.lex.variables

class VariableTypes {
    private val greeting = "Hi!" // Infer type  :String
    private val number = 0 // Infer type : Int

    private var string = 1 //infer type :Int
    //string = "abs" //will result in error since we cannot change the inferred type

    private fun modifyMutableList() {
        val languages = mutableListOf("Java")
        languages.add("Kotlin")
        println("Mutable list: $languages")

        val readOnlyList = listOf("Java")
        //readOnlyList.add("Kotlin"); // Unresolved reference
        println("Read Only list: $readOnlyList")
    }

    fun showCaseVariableTypes() {
        println("Calling function for Variable types...")
        println("String: $greeting")
        println("Int: $number")
        println("Int: $string")
        modifyMutableList()
    }
}