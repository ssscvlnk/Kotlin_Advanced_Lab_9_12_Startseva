package gameCharacter

data class GameCharacter(
    val name: String,
    var state: CharacterState = CharacterState.Inaction
) {
    fun changeState(newState: CharacterState) {
        state = newState
        println("Состояние персонажа изменено")
    }
    fun stateProcess(state: CharacterState){
        when (state) {
            CharacterState.Inaction -> println("Персонаж бездействует")
            CharacterState.Run -> println("Персонаж бежит")
            is CharacterState.Attack -> println("Персонаж атакует с уроном ${state.damage}")
            is CharacterState.Death -> println("Персонаж погиб: ${state.reason}")
        }
    }
}