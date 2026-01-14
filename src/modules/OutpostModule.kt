package modules

import resources.ResourceManager

abstract class OutpostModule(
    val name: String,
    var level: Int = 1
) {
    fun upgrade() {
        level++
        println("$name удучшен до уровня $level")
    }
    abstract fun performAction(manager: ResourceManager)
}