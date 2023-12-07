fun main() {
    var a = 0

    // 반복문과 증감연산자
    while (a < 5) {
        println(a++)
    }

    // for문
    for (i in 0..9) {
        print(i)
    }

    for (i in 1..10) {
        if(i == 3) break;
        print(i)
    }

    // 반복문에서 나오는 법
    loop@for (i in 1..10) {
        for (j in 1..10) {
            if(i == 1 && j == 2) break@loop
            println("i : $i, j : $j")
        }
    }
}