package com.lex.main

import com.lex.controlStructures.Color
import com.lex.controlStructures.Conditionals
import com.lex.controlStructures.LoopsAndRanges
import com.lex.controlStructures.PetService
import com.lex.exceptions.ExceptionThrowing
import com.lex.extensionFunctions.lastChar
import com.lex.extensionFunctions.repeatTimes
import com.lex.functions.FunctionsTypes
import com.lex.functions.FunctionsWithArgs
import com.lex.functions.topLevel
import com.lex.variables.VariableTypes

fun main() {
    println("Hello ${name()}!")

    // Variable Types
    testVariableTypes()

    // Function types
    testFunctionTypes()

    // Function with arguments
    testFunctionWithArguments()

    // Conditionals
    testConditionals()

    // Smart cast
    testSmartCast()

    // Loops & Ranges
    testLoopsAndRanges()

    // Exceptions
    testExceptions()

    // Extension functions
    testExtensionFunctions()
}

fun name(): String {
    println("\nCalling function name...")
    return "Kotlin"
}

fun testVariableTypes() {
    val variableTypes = VariableTypes()
    variableTypes.showCaseVariableTypes()
}

fun testFunctionTypes() {
    println("\nCalling function for Function types...")
    val functionsTypes = FunctionsTypes()

    val topLevelValue = topLevel()
    println("Asserting the call of a top level function should return 1: $topLevelValue")
    assert(topLevelValue == 1)

    val maxValue1 = functionsTypes.max(2,5)
    val maxValue2 = functionsTypes.expressionBodyMax(2,5)

    println("Asserting that maxValue of 2 & 5 should be 5: $maxValue1")
    assert(maxValue1 == maxValue2)

    val localValue = functionsTypes.other()
    println("Asserting call to local function should return 3: $localValue")
    assert(localValue == 3)
}

fun testFunctionWithArguments() {
    println("\nCalling function for Function with Args...")
    val funWithArgs = FunctionsWithArgs()
    funWithArgs.displaySeparator('#', 3) // ###
    funWithArgs.displaySeparator(size = 2, character = '5') // 55
    funWithArgs.displaySeparator(size = 5) //*****
    funWithArgs.displaySeparator() // **********
}

fun testConditionals() {
    println("\nCalling function for Conditionals...")
    val conditionals = Conditionals()
    val orangeWeather = conditionals.getDescription(Color.ORANGE)

    println("The sky today looks ${Color.ORANGE}, the weather should be $orangeWeather")
    assert(orangeWeather == "mild")

    var mixedColor = conditionals.mixColors(Color.RED, Color.YELLOW)
    println("The mix of color ${Color.RED} with ${Color.YELLOW} is: $mixedColor")
    assert(mixedColor == Color.ORANGE)

    mixedColor = conditionals.mixColors(Color.RED, Color.BLUE)
    assert(mixedColor == "Unknown color")
}

fun testSmartCast() {
    println("\nCalling function for Smart cast...")
    val petService = PetService()
    val petGreeting = petService.getPetGreeting()

    println("My pet says: $petGreeting")
}

fun testLoopsAndRanges() {
    println("\nCalling function for Loops and Ranges...")
    val loopsAndRanges = LoopsAndRanges()
    loopsAndRanges.printLetters()
    loopsAndRanges.printMap()
    loopsAndRanges.printRanges()

    var isLetter = loopsAndRanges.isLetter('j')
    println("\nCheck if 'j' is a letter: $isLetter")
    assert(isLetter)

    isLetter = loopsAndRanges.isLetter('*')
    println("\nCheck if '*' is a letter: $isLetter")
    assert(!isLetter)

    var isDigit = loopsAndRanges.isNotDigit('x')
    println("\nCheck if 'x' its not a digit: $isDigit")
    assert(!isDigit)

    isDigit = loopsAndRanges.isNotDigit('3')
    println("\nCheck if '3' its not a digit: $isDigit")
    assert(isDigit)

    var recognizeChar = loopsAndRanges.recognizeCharacter('c')
    println("\nRecognize 'c': $recognizeChar")

    recognizeChar = loopsAndRanges.recognizeCharacter('4')
    println("\nRecognize '4': $recognizeChar")

    recognizeChar = loopsAndRanges.recognizeCharacter('%')
    println("\nRecognize '%': $recognizeChar")
}

fun testExceptions() {
    println("\nCalling function for Exceptions...")
    val exceptionThrowing = ExceptionThrowing()

    println("try to check percentage values between 1 and 100, should throw exception and value of variable should be false")
    val isValidPercentage = try {
        exceptionThrowing.checkPercentage(120)
    } catch (e: IllegalArgumentException) {
        println("Exception occurred, e: ${e.localizedMessage}")
        false
    }
    assert(isValidPercentage == false)

    var parsedNumber = exceptionThrowing.parseNumber("34")
    println("Try to parse string into number, \"34\" should be valid: $parsedNumber")
    assert(parsedNumber == 34)

    parsedNumber = exceptionThrowing.parseNumber("3g")
    println("Try to parse string into number, \"3g\" should not be valid, thus null should be expected: $parsedNumber")
    assert(parsedNumber == null)
}

fun testExtensionFunctions() {
    println("\nCalling function for Extension functions...")
    val regularString = "Hello World"
    val lastChar = regularString.lastChar()
    val repeatedString = regularString.repeatTimes(3)

    println("\nLast char of \"$regularString\" is : $lastChar")
    assert(regularString[regularString.length-1] == lastChar)

    println("\nRepeated string of \"$regularString\" is: $repeatedString")
    assert(regularString.repeat(3) == repeatedString)
}