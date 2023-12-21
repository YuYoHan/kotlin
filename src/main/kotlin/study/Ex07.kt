package study

fun main() {
    var a = Person("안유진", 20)
    println("${a.name}은 사랑이다.")
    var b = Person2("김채원", 23)
    b.introduce()
}
class Person(var name:String, var age:Int)

class Person2(var name:String, val age:Int) {
    fun introduce() {
        println("안녕하세요, ${age}살인 ${name}입니다.")
    }
}