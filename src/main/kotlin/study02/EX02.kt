package study02

fun main() {
    var num : Double = 0.1;

    for (x in 0..999) {
        num += 0.1
    }
    println("num : $num")
}