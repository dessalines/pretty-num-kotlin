package com.dessalines

import kotlin.math.abs
import kotlin.math.floor

private val SUFFIXES = arrayOf('k', 'M', 'B', 'T')

fun prettyFormat(number: Int): String = prettyFormat(number.toLong())

fun prettyFormat(number: Long): String {
    return if (abs(number) < 1000) {
        number.toString()
    } else {
        val sign = if (number < 0) -1f else 1f
        var numAsFloat = abs(number).toFloat()

        for (suffix in SUFFIXES) {
            numAsFloat /= 1000f

            if (numAsFloat < 1000f) {
                val decimalPlaces =
                    if ((numAsFloat - floor(numAsFloat)) < 0.1 || numAsFloat >= 100f) {
                        0
                    } else {
                        1
                    }
                val numStr = "%,.${decimalPlaces}f".format(sign * numAsFloat)
                return "$numStr$suffix"
            }
        }
        "Number out of range"
    }
}
