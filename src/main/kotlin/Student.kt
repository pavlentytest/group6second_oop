open class Student (_name: String, _age: Int) {
    var name: String
        get() {
            // if
            return field
        }
        private set
    var age: Int
    init {
        this.name = _name
        this.age = _age
    }
    constructor(_name: String, _age: Int, _id: Int) : this(_name, _age) {

    }
}
class SubStudent : Student("",0,0) {

}
// Функция расширения
fun String.countOf() : Int {
    return 0
}
