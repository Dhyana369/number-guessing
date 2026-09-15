package com.example.numberguessinggame;

import java.util.Random;

public class Game {
    private int number;
    private int maxNumber;
    private int maxAttempts;

    Game(int difficulty){
        Random random = new Random(); // random call to get random val

        switch(difficulty){ // used rule switch, faster and no need of breaks
            case 1 -> {
                number = random.nextInt(50) + 1;
                maxNumber = 50;
                maxAttempts = 10;
            }
            case 2 -> {
                number = random.nextInt(150) + 1; // set bound to not exceed val,
                // 150 give 0(inclusive) to 150(exclusive), so adding 1 to the generated number makes it 1 to 150(inclusive)
                maxNumber = 150;
                maxAttempts = 7;
            }
            case 3 -> {
                number = random.nextInt(300) + 1;
                maxNumber = 300;
                maxAttempts = 5;
            }
        }
    }

    int getMaxAttempts(){
        return maxAttempts;
    }
    int getMaxNumber(){
        return maxNumber;
    }
    int getNumber(){
        return number;
    }

    int checkGuess(int guess){
        if (guess == number) {
            return 1;
        }
        else if (guess < number) {
            return 2;
        }
        else {
            return 3;
        }
    }

    void useAttempt(){
        maxAttempts--;
    }
}
