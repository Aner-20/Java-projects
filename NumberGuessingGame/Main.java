package NumberGuessingGame;

import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args){
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int correctNumber = random.nextInt(10) + 1;
        int guessedNumber = 0;
        int lives = 3;
        
          while(guessedNumber != correctNumber && lives > 0){
            System.out.println("Guess a number between 0 and 10: ");
            System.out.println("Lives: " + lives);
            guessedNumber = scanner.nextInt();
            scanner.nextLine();
            if(guessedNumber < correctNumber){
                lives--;
                System.out.println("Sorry, guess again. Too low");
            }
            else if(guessedNumber > correctNumber){
                lives--;
                System.out.println("Sorry, guess again. Too high");
            }
        }
        if(guessedNumber == correctNumber){
            System.out.println("You have guessed the number: " + correctNumber);

        }
        else{
            System.out.println("The correct number was " + correctNumber);
        }
        System.out.println("Remaining lives: " + lives);
    }
             
}    

