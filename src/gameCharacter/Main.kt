package gameCharacter

fun main() {
    val character = GameCharacter("Герой")
    character.stateProcess(character.state)
    character.changeState(CharacterState.Run)
    character.stateProcess(character.state)
    character.changeState(CharacterState.Attack(100))
    character.stateProcess(character.state)
    character.changeState(CharacterState.Death("Босс оказался сильнее"))
    character.stateProcess(character.state)
}