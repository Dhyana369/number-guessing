package com.example.numberguessinggame;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@RestController
public class GameController {
    private Game game;

    @GetMapping("/start")
    public String startGame(int difficulty) {
        game = new Game(difficulty);
        return "Guess a number between 1 and " + game.getMaxNumber();
    }

    @PostMapping("/guess")
    public GuessResponse guess(int guess){
        if(game == null){
            return null;
        }
        if(guess < 1 || guess > game.getMaxNumber()){
            return new GuessResponse(0, game.getMaxAttempts(), false, game.getNumber(), game.getMaxNumber(), false);
        }
        game.useAttempt();
        int result = game.checkGuess(guess);
        int attempts = game.getMaxAttempts();
        boolean gameOver = result == 1 || attempts == 0;
        return new GuessResponse(result, attempts, gameOver, game.getNumber(), game.getMaxNumber(), true);
    }
}
