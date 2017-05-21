package Generics

/**
 * Created by sriramk on 5/21/2017.
 */

fun main(args: Array<String>) {
    var intStack: SimpleStack<Int> = SimpleStack<Int>()
    intStack.push(10)
    intStack.push(12)
    intStack.push(14)
    intStack.push(16)
    intStack.push(18)
    println(intStack)
    var removedItem = intStack.pop()
    println("Removed item: ${removedItem}")
    println(intStack)
}