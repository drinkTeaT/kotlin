package base

//// 主构造器的三种写法
//class Animal(var name: String, var age: Int) {
//}
//
//class SmallAnimal(name: String, age: Int) {
//}
//
//class BigAnimal constructor(name: String, age: Int) {
//    var name: String
//    var age: Int
//
//    init {
//        this.name = name
//        this.age = age
//    }
//}

/**
 * 第一种写法(单个构造方法)
 */
open class Tiger constructor(_name: String, age: Int) {    // 含参主构造方法
    private var name: String = _name    // 成员变量
    private var age: Int    //成员变量

    // 构造方法初始化
    init {
        println("初始化name：$name,age:$age")
        this.age = age
    }

    open fun tigerInfo() = println("tiger $name,age $age")

    fun getName() = name

    fun getAge() = age
}

class BigTiger(_name: String, age: Int) : Tiger(_name, age) {
    override fun tigerInfo() = println(
        "big tiger info,name ${super.getName()},age ${super.getAge()}"
    )
}

// 第二种写法-多个构造函数并继承
open class Plane {
    private var name: String = ""
    private var price: Int = 0

    constructor() {}

    constructor(name: String, price: Int) {
        this.name = name
        this.price = price
    }
}

class BigPlane : Plane {
    constructor() : super() {}

    constructor(name: String, price: Int) : super(name, price) {}
}


// 第三种写法-主加从
open class Tank(name: String, weight: Int) {
    private var name: String
    private var weight: Int

    init {
        this.name = name
        this.weight = weight
        println("name:${this.name} weight:${this.weight}")
    }

    constructor() : this("", 0) {}
}

class HeavyTank(name: String, weight: Int) : Tank(name, weight) {
//    constructor() : super() {}
}

fun main(args: Array<String>) {
    var tiger = Tiger("killy", 4)
    tiger.tigerInfo()
    var bigTiger = BigTiger("mongo", 8)
    bigTiger.tigerInfo()

    var bigPlane = BigPlane()
    println(bigPlane)
}