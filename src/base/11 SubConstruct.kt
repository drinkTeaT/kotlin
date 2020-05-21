package base

open class Fruit {
    private var name: String = ""
    private var price: Int = 0

    constructor() {}

    constructor(name: String, price: Int) : this() {
        this.name = name
        this.price = price
    }

    fun info() = println("$name's price is ￥$price")
}

class Watermelon : Fruit {
    constructor() : super()

    constructor(name: String, price: Int) : super(name, price)
}

fun main(array: Array<String>) {
    val watermelon = Watermelon("Melon", 1)
    println(watermelon.info())
}