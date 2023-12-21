package study

fun main() {
    val a : Int = 128
    val b = a
    println(a === b)

    val c : Int? = a
    val d : Int? = a
    val e : Int? = c
    // 값의 내용만 비교하는 경우 동일하므로 true
    println(c == d)
    // 값의 내용은 같지만 참조 주소를 비교해 다른 객체(주소 다름)이므로 false
    println(c === d)
    // 값의 내용도 같고 참조 주소도 같으므로 true
    println(c === e)
}