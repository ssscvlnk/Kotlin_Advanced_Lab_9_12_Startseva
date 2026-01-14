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
fun main() {
//    println(age)
//    age = 55
//    println(age)
//    age = -43
//    println(age)
    val sword = Item(1, "Sword",1)
    val betterSword = sword.copy(amount = 2, name = "BetterSword")
    println(sword.toString())
    println(betterSword.toString())
    val(id, name, amount) = betterSword
    println("$id, $name, $amount")
}