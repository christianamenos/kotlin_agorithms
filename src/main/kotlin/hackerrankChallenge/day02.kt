package hackerrankChallenge

import java.util.*
import kotlin.math.roundToInt

// Link: https://www.hackerrank.com/challenges/30-operators/problem

fun main() {
    // InputStream to get Input
    val reader = Scanner(System.`in`).useLocale(Locale.US)

    println("Please, enter the meal cost (double):")
    val mealCost = reader.nextDouble()

    println("Please, enter the meal tip percent (double):")
    val mealTipPercent = reader.nextDouble()

    println("Please, enter the tax percent (double):")
    val taxPercent = reader.nextDouble()

    // Closing InputStream
    reader.close()

    val totalCost = mealCost + mealCost * mealTipPercent * 0.01 + mealCost * taxPercent * 0.01
    println(totalCost.roundToInt())
}