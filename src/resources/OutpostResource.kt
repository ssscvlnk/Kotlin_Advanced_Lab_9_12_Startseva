package resources

data class OutpostResource(
    val id: Int,
    val name: String,
    var amount: Int
) {
    override fun toString(): String {
        return "Ваш ресурс: $id | Имя: $name | Количество: $amount"
    }
}

fun main() {
    val gas = OutpostResource(1,"Gas", 100)
    val mineral = OutpostResource(2,"Mineral", 200)
    println("Успех! Вы добыли доп. количество минералов: ${mineral.amount + 100}!")
    val bonusMineral = mineral.copy(id = 3, amount = mineral.amount + 100)
    println(gas.toString())
    println(mineral.toString())
    println(bonusMineral.toString())
}
