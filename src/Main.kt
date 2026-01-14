import modules.EnergyGenerator
import modules.ResearchLab
import resources.OutpostResource
import resources.ResourceManager

fun main() {
//    val manager = resources.ResourceManager()
//    val gas = resources.OutpostResource(1,"Gas", 100)
//    val mineral = resources.OutpostResource(2,"Mineral", 200)
//    manager.add(gas)
//    manager.add(mineral)
//    manager.printAll()
//    val bonusMineral = mineral.copy(id = 3, amount = mineral.amount + 100)
//    println("Бонусные минералы: $bonusMineral")
    val manager = ResourceManager()
    manager.add(OutpostResource(1, "Minerals", 120))
    manager.add(OutpostResource(2, "Gas", 40))
    val generator = EnergyGenerator()
    val lab = ResearchLab()
    generator.performAction(manager)
    lab.performAction(manager)
    println()
    manager.printAll()
}