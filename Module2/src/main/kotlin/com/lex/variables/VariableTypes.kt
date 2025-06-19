package com.lex.variables

fun main() {
    val variableTypes = VariableTypes()
    variableTypes.showCaseVariableTypes()
}

class VariableTypes {
    private val greeting = "Hi!" // Infer type  :String
    private var number = 0 // Infer type : Int

    private var string = 1 //infer type :Int
    //string = "abs" //will result in error since we cannot change the inferred type

    private fun modifyMutableList() {
        val languages = mutableListOf("Java")
        languages.add("Kotlin")
        println(languages)

        val readOnlyList = listOf("Java")
        //readOnlyList.add("Kotlin"); // Unresolved reference
        println(readOnlyList)
    }

    fun showCaseVariableTypes() {
        println(greeting)
        println(number)
        println(string)
        modifyMutableList()
    }
}