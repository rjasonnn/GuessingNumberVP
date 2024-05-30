package com.example.guessinggame

data class GuessingGameState(
    val userNumber: String = "",
    val noOfGuessLeft: Int = 5,
    val guessedNumbersList: List<Int> = emptyList(),
    val mysteryNumber: Int = (1..9).random(),
    val hintDescription: String = "Guess\nthe mystery number between\n0 and 10.",
    val gameStage: GameStage = GameStage.PLAYING
)

enum class GameStage {
    WON,
    LOSE,
    PLAYING
}
