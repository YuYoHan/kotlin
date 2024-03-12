package study02

fun main() {
    var str1 : String = "Hello"
    var str2 = "World"
    var str3 = "Hello"

    println("str1 === str2 ${str1 === str2}")
    println("str1 === str3 ${str1 === str3}")

    var a = 1
    val str4 = "a = $a"
    val str5 = "a = ${a + 4}"
    println(str4)
    println(str5)
}