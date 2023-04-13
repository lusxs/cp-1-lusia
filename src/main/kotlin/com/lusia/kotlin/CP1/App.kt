package com.lusia.kotlin

fun isPrimeNumber( x: Int,i: Int =2): Boolean {

//    for (i in 2..number / 2) {
//        if (number % i == 0) {
//            return false
//        }
//    }
//    return true

    if (x < 2)
        return false
    if (i * i > x)
        return true
    if (x % i == 0)
        return false
    return isPrimeNumber(x, i + 1)

}

fun main(a: Array<String>) {

    val test = readLine()!!.toInt()
    repeat(test) {
        val i = readLine()!!.toInt()
        val result = if(isPrimeNumber(i)) "Prime Number" else "Not Prime"
        println("Case #${it+1}: $result ")


    }

}






