package com.lusia.kotlin

data class ArrayOfNumchar (val index: Int, val value: Char)

fun main() {

    val numchar = arrayOf(
        ArrayOfNumchar(1,'A'),
        ArrayOfNumchar(5,'B'),
        ArrayOfNumchar(3,'D'),
        ArrayOfNumchar(4,'E'),
        ArrayOfNumchar(2,'C')
    )

    val sortedNumchar = numchar.sortedBy { it.index }

    for (ArrayOfNumchar in sortedNumchar) {
        println("${ArrayOfNumchar.index}. ${ArrayOfNumchar.value}")
    }

}