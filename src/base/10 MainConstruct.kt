package base

// 主构造器的三种写法
class Animal(var name: String, var age: Int) {
}

class SmallAnimal(name: String, age: Int) {
    val name: String = name
    val age: Int = age
}

class BigAnimal constructor(name: String, age: Int) {
    var name: String
    var age: Int

    init {
        this.name = name
        this.age = age
    }
}

fun main(args: Array<String>) {
    var smallAnimal = SmallAnimal("mouse", 1)
    println(smallAnimal.name)

    var animal = Animal("cat", 2)
    println(animal.name)
}