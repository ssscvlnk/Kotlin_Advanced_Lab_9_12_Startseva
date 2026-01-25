package gameCharacter

sealed class CharacterState {
    object Inaction : CharacterState()
    object Run : CharacterState()
    data class Attack(val damage: Int) : CharacterState()
    data class Death(val reason: String) : CharacterState()
}