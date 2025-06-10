package com.dessalines

import kotlin.math.abs
import kotlin.math.floor

private val SUFFIXES = arrayOf('k', 'M', 'B', 'T')

fun prettyFormat(number: Int): String {
    return prettyFormat(number.toLong())
}

fun prettyFormat(number: Long): String {

    return if (abs(number) < 1000) {
        number.toString()
    } else {
        val sign = if (number < 0) -1f else 1f
        var number_as_float = abs(number).toFloat()

        for (suffix in SUFFIXES) {
            number_as_float /= 1000f

            if (number_as_float < 1000f) {
                val decimalPlaces =
                        if ((number_as_float - floor(number_as_float)) < 0.1 ||
                                        number_as_float >= 100f
                        ) {
                            0
                        } else {
                            1
                        }
                val numStr = "%,.${decimalPlaces}f".format(sign * number_as_float)
                return "$numStr$suffix"
            }
        }
        "Number out of range"
    }
}
