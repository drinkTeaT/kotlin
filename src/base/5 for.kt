package base

import java.util.*

fun main(args: Array<String>) {
    forMap()
}

fun forNum() {
    for (i in 1..100) {
        println(i)
    }

    for (i in 100 downTo 1 step 2) {
        println(i)
    }
}

fun forMap() {
    val binaryMap = TreeMap<Char, String>()
    for (i in 'A'..'F') {
        binaryMap[i] = i.toString()
    }
    for ((key, value) in binaryMap) {
        println("$key , $value")
    }
}