package section03

fun main() {
    val name = "안유진"
    val email = "test@test.com"

    add(name)
    add(name, email)
    add("김채원", "test2@test.com")
    defaultArgs()
    defaultArgs(200)
}

fun add(name: String, email: String = "default") {
    val output = "${name}님의 이메일은 ${email}입니다."
    println(output)
}

fun defaultArgs(x: Int = 100, y: Int = 200) {
    println(x + y)
}