package hackerrankChallenge

import java.util.*

// Link: https://www.hackerrank.com/challenges/30-data-types/problem

fun main() {
    /*
     * Read input from STDIN. Print output to STDOUT. In this exercise, I'm using Scanner instead of readline because it
     * allows to read in a specific type, casting the value properly.
     **/
    val i1 = 4
    val d1 = 4.0
    val s1 = "HackerRank "

    // InputStream to get Input
    val reader = Scanner(System.`in`).useLocale(Locale.US)

    // Input int value
    println("Please, enter an integer value:")
    val i2 = reader.nextInt()

    // Input double value
    println("Please, enter a double value:")
    val d2 = reader.nextDouble()

    // Input string value
    println("Please, enter a text:")
    val s2 = reader.next()

    // Closing InputStream
    reader.close()

    println(i1 + i2)
    println(d1 + d2)
    println(s1 + s2)
}