package study

fun main() {
    // 스마트 캐스트에 의해 Float형으로 스마트 캐스트
    var test : Number = 12.2
    test = 12
    test = 120L

    test += 12.0f


    val num = 129

    if(num is Int){
        println(num)
    } else if(num !is Int) {
        println("Not a Int")
    }

    // Any형은 코틀린의 최상위 기본 클래스로 어떤 자료형이라도 될 수 있음
    val x:Any
    x = "Hello"
    if(x is String) {
        println(x.length)
    }

    var a : Any = 1
    a = 20L
    println("a : $a type: ${a.javaClass}")
}