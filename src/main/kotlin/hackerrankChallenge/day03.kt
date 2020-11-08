package hackerrankChallenge

import java.util.*
import kotlin.math.roundToInt

fun conditionalCheck(value: Int) {
    if (value % 2 == 0) {
        if(value in 2..5 || value > 20) println("Not Weird")
        if(value in 6..20) println("Weird")
    } else {
        println("Weird")
    }
}

// Link: https://www.hackerrank.com/challenges/30-conditional-statements/problem

fun main() {
    // InputStream to get Input
    val reader = Scanner(System.`in`).useLocale(Locale.US)

    println("Please, enter a number:")
    val value = reader.nextInt()

    // Closing InputStream
    reader.close()

    conditionalCheck(value)
}