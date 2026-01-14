fun main() {
    val manager = ResourceManager()
    val gas = OutpostResource(1,"Gas", 100)
    val mineral = OutpostResource(2,"Mineral", 200)
    manager.add(gas)
    manager.add(mineral)
    manager.printAll()
    val bonusMineral = mineral.copy(id = 3, amount = mineral.amount + 100)
    println("Бонусные минералы: $bonusMineral")
}