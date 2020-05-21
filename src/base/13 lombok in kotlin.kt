package base

data class Data(val id: Int, val data: String) {
}

fun main(args: Array<String>) {
    println(Data(1, "0101010010101101"))
}