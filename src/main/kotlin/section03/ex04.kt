package section03

fun main() {
    println("funFunc : ${funFunc()}")
}

// ex03에 있는 sum 메소드를 사용하고 있습니다.
fun funFunc() : Int {
    return sum(2, 2)
}