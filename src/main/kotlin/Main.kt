class Car

fun main(args: Array<String>) {
    val car = Car()
    val car1 = Car()

    val ivan = Student("Ivan",10)
    println(ivan.name)
    ivan.name = "234234"
    println(ivan.age)
    val olga = Student("Olga",10,100)


   // val program = Program()
    Program.NAME
    Program.toDo()

    val movable = Movable()
    val movable2 = object: Movable {
        override fun doMove1() {
            TODO("Not yet implemented")
        }

        override fun doMove2() {
            TODO("Not yet implemented")
        }
    }
    movable2.doMove1()
    movable2.doMove2()

    val animal = Animal()

    val cat = Cat()
    val animal2 = object: Animal() {
        override fun makeSound() {
            TODO("Not yet implemented")
        }
    }
    animal2.makeSound()
    object {

    }
}
