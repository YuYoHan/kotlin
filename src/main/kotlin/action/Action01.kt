package action

import kotlin.math.PI
import kotlin.math.abs

fun main() {
    val intro : String = "안녕하세요!";
    val num : Int = 20

    println(PI)
    // 절대값
    println(abs(-12.6))

    println("intro : $intro, num : $num")

    class Person(val name : String, val age:Int)

    val user1 = Person("kind", 30)
    println(user1.name)
    println(user1.age)


}