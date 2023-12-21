package study

fun main() {
    // 생성자 사용
    var a = Person3("키리나", 24)
    // 보조 생성자 사용
    var b = Person3("윈터")
}
class Person3(var name:String, val birthYear: Int) {
    // 생성자
    init {
        println("${this.birthYear}년생인 ${this.name}님이 생성되었습니다.")
    }

    // 보조 생성자
    constructor(name: String) : this(name, 1997) {
        println("보조 생성자가 생성되었습니다.")
    }
}