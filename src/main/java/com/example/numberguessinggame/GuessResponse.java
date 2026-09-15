package com.example.numberguessinggame;

public class GuessResponse {
    public int result;
    public int attempts;
    public boolean gameOver;
    public int number;
    public int maxNumber;
    public boolean valid;

    GuessResponse(int result, int attempts, boolean gameOver, int number, int maxNumber, boolean valid){
        this.result = result;
        this.attempts = attempts;
        this.gameOver = gameOver;
        this.number = number;
        this.maxNumber = maxNumber;
        this.valid = valid;
    }
}
