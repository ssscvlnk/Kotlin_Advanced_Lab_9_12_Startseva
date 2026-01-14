var age: Int = 18
    set(value) {
        if ((value>0) and (value<110))
            field = value
    }
data class Item(
    val id: Int,
    val name: String,
    val amount: Int
) {
    override fun toString(): String {
        return "ID: $id, name: $name, amount: $amount"
    }
}
abstract class Human(val name:String) {
    abstract var age: Int
    abstract fun hello()
}
class Person(name: String, override var age: Int) : Human(name) {
//    override var age: Int = 0

    override fun hello() {
        println("My name is $name")
    }
}
abstract class Figure{
    abstract fun perimeter(): Float
    abstract fun area(): Float
}
class Rectangle(val wigth: Float, val height: Float): Figure() {
    override fun perimeter(): Float {
        return 2*(wigth+height)
    }
    override fun area(): Float {
        return wigth*height
    }
}
fun main() {
//    println(age)
//    age = 55
//    println(age)
//    age = -43
//    println(age)
//    val sword = Item(1, "Sword",1)
//    val betterSword = sword.copy(amount = 2, name = "BetterSword")
//    println(sword.toString())
//    println(betterSword.toString())
//    val(id, name, amount) = betterSword
//    println("$id, $name, $amount")
    val polina: Human = Person("Polina", 17)
    val anton: Human = Person("Anton", 20)
}
