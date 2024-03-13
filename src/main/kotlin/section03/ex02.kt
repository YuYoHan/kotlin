package section03

fun main() {
    nomalVarargs(1, 2, 3, 4)
    nomalVarargs(4, 5, 6)
}

// vararg : 가변 인자
// 가변 인자는 인자의 개수가 변한다라는 뜻입니다.
// 가변 인자를 사용하면 함수는 하나만 정의해 놓고 여러 개의 인자를 받을 수 있습니다.
fun nomalVarargs(vararg counts: Int) {
    for(num in counts) {
        println("$num ")
    }
    print("\n")
}