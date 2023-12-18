package action

fun main() {
    // null이 가능하게 하려면 자료형 뒤에 물음표를 추가해야 합니다.
    var str : String? = "Hello Kotlin"
    str = null
    println("str : $str")
}