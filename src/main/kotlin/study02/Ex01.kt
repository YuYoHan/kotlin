package study02

fun main() {
    // 변경 가능
    var username : String = "안유진"
    username = "김채원"
    // 변경 불가능
    val count = 3
    println("userName : $username, count: $count")
}