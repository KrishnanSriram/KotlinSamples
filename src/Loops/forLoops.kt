package Loops

/**
 * Created by sriramk on 5/20/2017.
 */
fun main(args: Array<String>) {
    for(index in 1..10) {
        print("${index}, ")
    }

    println("\nMy favorite languages")
    val myLanguages = listOf("Swift", "Java Script", "Java", "Python", "Kotlin", "CSharp", "Others")
    for(language in myLanguages.asReversed()) {
        print("${language}, ")
    }

    println("\nMy favorite languages, with number")
    for((index, language) in myLanguages.withIndex()) {
        print("${index+1}. ${language}, ")
    }

    println("\nPrint in reverse order")
    for(index in 10 downTo 1 step 2) {
        print("$index, ")
    }
}
