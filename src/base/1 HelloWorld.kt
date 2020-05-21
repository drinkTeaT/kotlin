package base

fun main(args: Array<String>) {
    val name = "World"
    println("Hello $name!")
    println(add(10, 20))
    println(add1(10, 20))
    newHelloWorld()
}

fun add(a: Int, b: Int): Int {
    return a + b
}

fun add1(a: Int, b: Int): Int = a + b

fun newHelloWorld(){
    val three = 3
    val four = 4
    print("3 + 4 = ${three + four}")
}