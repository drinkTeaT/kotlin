package base

fun main(args: Array<String>) {
    Button().showOff()
    // 类继承
    val tim =  Extend("tim",15)
    println(tim.getInfo())
}

interface Clickable {
    fun click()

    /**
     * 类似于default
     */
    fun showOff() = println("I'm Clickable")
}

class Button : Clickable {
    override fun click() {
        println("I was Clicked")
    }

    override fun showOff() {
        super.showOff()
        println("I'm Button")
    }
}

open class Base(private val name: String, private val age: Int) {
    open fun getInfo() {
        println("name is $name and age is $age")
    }
}

class Extend(name: String, age: Int) : Base(name, age) {
    override fun getInfo() {
        super.getInfo()
        println("----")
    }
}