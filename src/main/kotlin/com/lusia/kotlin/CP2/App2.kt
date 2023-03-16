package com.lusia.kotlin.CP2
import java.util.*

fun main() {
    val reader = Scanner(System.`in`)
    println("How many case:")
    val num = reader.nextInt()

    repeat(2) {
        print("a:")
        val a = reader.nextInt()
        print("b:")
        val b = reader.nextInt()
        val sum = (a..b).filter { it % 2 == 1 }.sum()
        println("Case ${it+1}: $sum")
    }
}