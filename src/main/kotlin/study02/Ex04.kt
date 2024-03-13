package study02

fun main() {
    val a: Int = 126
    val b = a
    println(a === b)

    if(a is Int) {
        println(a)
    }
}