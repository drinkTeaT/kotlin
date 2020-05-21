package base

fun main(array: Array<String>) {
    defineStructure()
    println(greet("tom"))
}

fun defineStructure() {
    val set = HashSet<String>()
    set.add("1")
    set.add("1")
    set.add("1")
    println(set.size)
}

fun greet(name: String, greet: String = "hello") = "$greet $name"