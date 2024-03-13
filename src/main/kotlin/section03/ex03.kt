package section03

fun main() {
    // 일반 인자
    val res1 = sum(3, 2)
    // 인자에 함수를 사용
    val res2 = mul(sum(3, 2), 3)

    print("res1 : $res1, res2: $res2")
}

fun sum(a: Int, b: Int) = a + b
fun mul(a: Int, b: Int) = a * b