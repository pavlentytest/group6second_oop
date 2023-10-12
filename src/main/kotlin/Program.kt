class Program {
    val x = 100

    companion object {
        const val NAME = "Program"
        fun toDo() {

        }
    }
}
interface Movable {
    fun doMove1()
    fun doMove2()
    fun doMove3() {

    }
}
class Bus : Movable {
    override fun doMove1() {

    }

    override fun doMove2() {

    }

}
abstract class Animal {
    abstract fun makeSound()
}
class Cat : Animal() {
    override fun makeSound() {
        TODO("Not yet implemented")
    }

}