//package study
//
//// 상속
//fun main() {
//    var a = Animal("별이", 5, "개")
//    var b = Dog("별이", 5)
//    a.introduce()
//    b.introduce()
//}
//// open을 해야 상속할 수 있습니다.
//open class Animal(var name:String, var age:Int, var type:String) {
//    fun introduce() {
//        println("저의 애완동물은 ${type} ${name}이고, ${age}살 입니다.")
//    }
//}
//// 상속에 대한 규칙
//// 1. 수퍼 클래스에 존재하는 속성과 같은 이름의 속성을 가질 수 없음
//// 2. 서브 클래스가 생성될 때는 반드시 수퍼 클래스의 생성자까지 호출되어야 함
//class Dog(name: String, age: Int) : Animal(name, age, "개") {
//    fun bark() {
//        println("멍멍")
//    }
//}
//
//class Cat(name: String, age: Int): Animal(name, age, "고양이") {
//    fun bark() {
//        println("야옹~")
//    }
//}