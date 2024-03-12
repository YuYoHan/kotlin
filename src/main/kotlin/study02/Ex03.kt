package study02

fun main() {
    // ?를 사용하면 null이 가능하다.
    var str1 : String?
    str1 = null
    println("str1 : $str1, length : ${str1?.length}")
}