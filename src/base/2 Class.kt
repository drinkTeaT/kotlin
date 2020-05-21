package base

class Person(
    val name: String,
    var age: Int
) {
    val isChild: Boolean
        get() = age < 18

    override fun toString() = "name is $name , age is $age , isChild : $isChild"
}

fun main(args: Array<String>) {
    val person = Person("tom", 12)
    print("Name is ${person.name} ,is Child: ${person.isChild}")
}