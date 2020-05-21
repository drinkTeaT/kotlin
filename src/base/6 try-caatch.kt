package base

import java.lang.Exception

fun main(args: Array<String>) {
    exceptionTry()
}

fun exceptionTry(): Int? {
    return try {
        1 % 0
    } catch (e: Exception) {
        null
    }
}