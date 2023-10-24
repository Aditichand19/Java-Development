import java.util.Random;  //to generate random no. for the game
import java.util.Scanner;

public class NumberGuessingGame
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        Random random=new Random();

        int targetNumber=random.nextInt(100)+1;
        int attempts=0;
        int maxAttempts=100;
        boolean hasGuessedCorrectly=false;
        System.out.println("WELCOME TO THE NUMBER GUESSING GAME!");

        while(!hasGuessedCorrectly)
        {
            System.out.println("ENTER YOUR GUESS (1-100): ");
            int userGuess=scanner.nextInt();
            attempts++;

            if (userGuess < targetNumber){
                System.out.println("TOO LOW.. TRY AGAIN");
            }
            else if(userGuess > targetNumber){
                System.out.println("TOO HIGH.. TRY AGAIN");
            }
            else{
                System.out.println("CONGRATULATIONS! You have guessed the number "+targetNumber+" in "+attempts+" attempts ");
                int score=maxAttempts - attempts;
                System.out.println("Your Score is:"+ score);
                break;
            }
        }
        scanner.close();
    }
}
