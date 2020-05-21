package base

enum class Gender(val type: String) {
    MALE("男性"), FEMALE("女性"), UNKNOWN("未知");
}

fun main(args: Array<String>) {
    val unknown = Gender.UNKNOWN
    println("性别:${unknown.type}")
    println(judgeGender(unknown))
}

fun judgeGender(gender: Gender): String {
    return when (gender) {
        Gender.MALE -> {
            Gender.MALE.type
        }
        Gender.FEMALE -> Gender.FEMALE.type
        Gender.UNKNOWN -> Gender.UNKNOWN.type
    }
}