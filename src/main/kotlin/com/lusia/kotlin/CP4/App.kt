package com.lusia.kotlin.CP4

fun isPrimeNumber( x: Int,i: Int =2): Boolean {   //cek bilangan prima

    if (x < 2)
        return false
    if (i * i > x)
        return true
    if (x % i == 0)
        return false
    return isPrimeNumber(x, i + 1)

}

fun main() {
    val inputs = mutableListOf<Int>()
    while (true) {
        val input = readLine()?.toIntOrNull()
        if (input == null) {
            break
        }
        inputs.add(input)
    }
    for (input in inputs) {
        val reversed = input.toString().reversed().toInt()
        if (isPrimeNumber(input)) {
            if (isPrimeNumber(reversed) && input != reversed) {
                println("$input is emirp.")
            } else {
                println("$input is prime.")
            }
        } else {
            println("$input is not prime.")
        }
    }
}

