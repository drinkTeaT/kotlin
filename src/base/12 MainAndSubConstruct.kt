package base

open class Dog(var name: String) {
    constructor() : this("doggy")
}

class BigDog : Dog {
    constructor():super()

    fun getInfo() = println(name)
}

fun main(args: Array<String>) {
    BigDog().getInfo()
}