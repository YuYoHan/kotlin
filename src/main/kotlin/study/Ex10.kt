package study

fun main() {

}

interface Runner {
    fun run()
}

interface Eater{
    fun eat() {
        print("음식을 먹습니다.")
    }
}

class Dog : Runner, Eater {
    override fun run() {
        print("달립니다.")
    }

    override fun eat() {
        print("허겁지겁 먹습니다.")
    }
}