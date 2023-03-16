package com.lusia.kotlin.CP2
import java.util.Scanner;
fun main(args: Array<String>) {

    val reader = Scanner(System.`in`)

    do {
        print("Enter a number: ")
        val num = reader.nextInt()

        if (num != 0) {
            if (num % 11 == 0)
                println("$num is a multiple of 11")
            else
                println("$num is not multiple off 11")
        }
    } while (num != 0)





}